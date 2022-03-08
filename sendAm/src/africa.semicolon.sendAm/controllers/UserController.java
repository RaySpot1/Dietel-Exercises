package africa.semicolon.sendAm.controllers;

import africa.semicolon.sendAm.dtos.responses.FindUserResponse;
import africa.semicolon.sendAm.dtos.responses.RegisterUserRequest;
import africa.semicolon.sendAm.dtos.responses.RegisterUserResponse;
import africa.semicolon.sendAm.services.UserService;
import africa.semicolon.sendAm.services.UserServiceImplementation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class UserController {
    private UserService userService = new UserServiceImplementation();


    @PostMapping("/register")
    public RegisterUserResponse registerNewUser(@RequestBody RegisterUserRequest request){
        return userService.register(request);
    }

    @GetMapping("/{email}")
    public FindUserResponse getUserByEmail(@PathVariable String email){
        return userService.findByEmail(email);
    }
}
