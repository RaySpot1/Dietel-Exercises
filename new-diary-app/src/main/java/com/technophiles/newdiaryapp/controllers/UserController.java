package com.technophiles.newdiaryapp.controllers;

import com.technophiles.newdiaryapp.dtos.UserDTO;
import com.technophiles.newdiaryapp.exceptions.NewDiaryAppApplicationException;
import com.technophiles.newdiaryapp.controllers.responses.ApiResponse;
import com.technophiles.newdiaryapp.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("api/v3/diaryApp")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/users/create")
    public ResponseEntity<?> createUser(@RequestParam @Valid @NotNull @NotBlank String email, @RequestParam @Valid @NotBlank @NotNull String password){
        try{
            UserDTO userDTO = userService.createAccount(email, password);
            ApiResponse apiResponse = ApiResponse.builder()
                    .payload(userDTO)
                    .isSuccessful(true)
                    .statusCode(201)
                    .message("User created successfully")
                    .build();
            return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
        } catch (NewDiaryAppApplicationException e){
            ApiResponse apiResponse = ApiResponse.builder()
                    .message(e.getMessage())
                    .isSuccessful(false)
                    .statusCode(400)
                    .build();
            return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);
        }
    }
}
