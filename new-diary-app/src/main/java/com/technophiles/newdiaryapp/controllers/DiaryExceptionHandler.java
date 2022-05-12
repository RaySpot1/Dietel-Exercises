package com.technophiles.newdiaryapp.controllers;

import com.technophiles.newdiaryapp.controllers.responses.ApiResponse;
import com.technophiles.newdiaryapp.exceptions.NewDiaryAppApplicationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


//a centralized class for handling exceptions instead of try and catch

@ControllerAdvice
public class DiaryExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({NewDiaryAppApplicationException.class})
    public ResponseEntity<Object> diaryApplicationHandler(NewDiaryAppApplicationException exception){
        ApiResponse apiResponse = new ApiResponse(null, false, 400, exception.getMessage());
        return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);
    }
}
