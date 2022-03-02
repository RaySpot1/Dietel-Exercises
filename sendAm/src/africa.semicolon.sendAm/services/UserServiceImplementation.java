package africa.semicolon.sendAm.services;

import africa.semicolon.sendAm.data.models.User;
import africa.semicolon.sendAm.data.models.UserRepository;
import africa.semicolon.sendAm.data.models.UserRepositoryImplementation;
import africa.semicolon.sendAm.dtos.responses.RegisterUserRequest;
import africa.semicolon.sendAm.dtos.responses.RegisterUserResponse;
import africa.semicolon.sendAm.exception.RegisterFailureException;


public class UserServiceImplementation implements UserService {
    private UserRepository userRepository = new UserRepositoryImplementation();

    @Override
    public RegisterUserResponse register(RegisterUserRequest requestForm) {
        requestForm.setEmailAddress(requestForm.getEmailAddress().toLowerCase());
        if(emailExist(requestForm.getEmailAddress())) throw new RegisterFailureException("Email is not unique");
        User user = new User();

        user.setEmail(requestForm.getEmailAddress());
        user.setAddress(requestForm.getAddress());
        user.setFullName(requestForm.getFirstName());
        user.setPhoneNumber(requestForm.getPhoneNumber() + " " + requestForm.getLastName());

        userRepository.save(user);

        return null;
    }

    private boolean emailExist(String emailAddress) {
        User user = userRepository.findByEmail(emailAddress);

        if(user == null) return false;
        return true;
    }

    public UserRepository getRepository() {
        return userRepository;
    }
}
