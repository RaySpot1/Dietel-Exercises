package africa.semicolon.sendAm.services;

import africa.semicolon.sendAm.data.models.User;
import africa.semicolon.sendAm.data.repositories.UserRepository;
import africa.semicolon.sendAm.data.repositories.UserRepositoryImplementation;
import africa.semicolon.sendAm.dtos.responses.FindUserResponse;
import africa.semicolon.sendAm.dtos.responses.RegisterUserRequest;
import africa.semicolon.sendAm.dtos.responses.RegisterUserResponse;
import africa.semicolon.sendAm.exception.RegisterFailureException;
import africa.semicolon.sendAm.exception.UserNotFoundException;


public class UserServiceImplementation implements UserService {
    private UserRepository userRepository = new UserRepositoryImplementation();

    @Override
    public RegisterUserResponse register(RegisterUserRequest requestForm) {
        requestForm.setEmailAddress(requestForm.getEmailAddress().toLowerCase());
        if(emailExist(requestForm.getEmailAddress())) throw new RegisterFailureException("Email is not unique");
        User user = new User();

        user.setEmail(requestForm.getEmailAddress());
        user.setAddress(requestForm.getAddress());
        user.setFullName(requestForm.getFirstName() + " " + requestForm.getLastName());
        user.setPhoneNumber(requestForm.getPhoneNumber());

        userRepository.save(user);
        User savedUser = userRepository.save(user);

        RegisterUserResponse response = new RegisterUserResponse();
        response.setEmail((savedUser.getEmail()));
        response.setFullName(savedUser.getFullName());


        return response;
    }

    private boolean emailExist(String emailAddress) {
        User user = userRepository.findByEmail(emailAddress);

        if(user != null) return true;
        return false;
    }

    @Override
    public UserRepository getRepository() {
        return userRepository;
    }


    @Override
    public FindUserResponse findByEmail(String email){
        email = email.toLowerCase();
        User user = userRepository.findByEmail(email);

        if(user== null) throw new UserNotFoundException(email + " not found");
        FindUserResponse response = new FindUserResponse();
        response.setEmail(user.getEmail());
        response.setFullName(user.getFullName());

        return response;
    }
}
