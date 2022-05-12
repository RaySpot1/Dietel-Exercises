package com.africa.semicolon.diaryapp.controllers.response;

import com.africa.semicolon.diaryapp.controllers.requests.CreateAccountRequest;
import com.africa.semicolon.diaryapp.controllers.response.ApiResponse;
import com.africa.semicolon.diaryapp.exceptions.DiaryAppApplicationException;
import com.africa.semicolon.diaryapp.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createNewUserAccount(@RequestBody CreateAccountRequest accountRequest){
        try{
            ApiResponse response  = ApiResponse.builder()
                    .message("id:" + userService.createAccount(accountRequest))
                    .isSuccessful(true)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.CREATED);

        } catch(DiaryAppApplicationException exception){
            ApiResponse response  = ApiResponse.builder()
                    .message(exception.getMessage())
                    .isSuccessful(false)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

}
