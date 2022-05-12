package com.technophiles.newdiaryapp.services;

import com.technophiles.newdiaryapp.models.Diary;
import com.technophiles.newdiaryapp.models.User;
import com.technophiles.newdiaryapp.dtos.UserDTO;
import com.technophiles.newdiaryapp.exceptions.NewDiaryAppApplicationException;
import com.technophiles.newdiaryapp.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private ModelMapper mapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.mapper = new ModelMapper();
    }

    @Override
    public UserDTO createAccount(String email, String password) throws NewDiaryAppApplicationException {
        Optional<User>  userOptional = userRepository.findUserByEmail(email);
        if(userOptional.isEmpty()){
            User user = new User(email, password);
            User savedUser = userRepository.save(user);
            return mapper.map(savedUser, UserDTO.class);
        }
        throw new NewDiaryAppApplicationException("Email already exists");
    }

    @Override
    public Diary addDiary(@NotNull Long id, @NotNull Diary diary) throws NewDiaryAppApplicationException {
        User user = userRepository.findById(id).orElseThrow(()-> new NewDiaryAppApplicationException("user does not exist"));
        user.addDiary(diary);
        userRepository.save(user);
        return diary;
    }

    @Override
    public User findById(Long id) throws NewDiaryAppApplicationException {
        return userRepository.findById(id).orElseThrow(()-> new NewDiaryAppApplicationException("User does not exist"));
    }

    @Override
    public boolean deleteUser(User user) {
        userRepository.delete(user);
        return true;
    }
}
