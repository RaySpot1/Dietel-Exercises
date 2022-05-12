package com.technophiles.newdiaryapp.controllers;

import com.technophiles.newdiaryapp.models.Diary;
import com.technophiles.newdiaryapp.models.User;
import com.technophiles.newdiaryapp.controllers.responses.ApiResponse;
import com.technophiles.newdiaryapp.dtos.UserDTO;
import com.technophiles.newdiaryapp.exceptions.NewDiaryAppApplicationException;
import com.technophiles.newdiaryapp.services.DiaryService;
import com.technophiles.newdiaryapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("api/v3/diaryApp/diaries")
public class DiaryController {
    private DiaryService diaryService;

    private UserService userService;

    @Autowired
    public DiaryController(DiaryService diaryService, UserService userService){
        this.diaryService = diaryService;
        this.userService = userService;
    }

    @PostMapping("/create/{userId}")
    private ResponseEntity<?> createDiary(@Valid @NotNull @NotBlank @PathVariable ("userId") String userId, @NotNull @NotBlank @RequestParam String title){
        try {
            User user = userService.findById(Long.valueOf(userId));
            Diary diary = diaryService.createDiary(title, user);
            Diary userDTO = userService.addDiary(Long.valueOf(userId), diary);
            ApiResponse apiResponse = ApiResponse.builder()
                    .payload(userDTO)
                    .isSuccessful(true)
                    .message("diary added successfully")
                    .statusCode(201)
                    .build();
            return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
        } catch (NewDiaryAppApplicationException e){
            ApiResponse apiResponse = ApiResponse.builder()
                    .message(e.getMessage())
                    .isSuccessful(false)
                    .statusCode(404)
                    .build();
            return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);
        }


    }
}
