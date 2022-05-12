package com.africa.semicolon.diaryapp.controllers.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                         //rest controller exposes this class Api to rest controller and @Controller for mvc
@RequestMapping("/api/v1/diary")        //this is the api we want to release to the public
public class Controller {
    @GetMapping("/hello-world/")
    public ResponseEntity<?> startPoint(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}


// ResponseEntity to return json file

