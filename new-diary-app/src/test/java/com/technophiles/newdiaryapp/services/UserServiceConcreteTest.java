package com.technophiles.newdiaryapp.services;

import com.technophiles.newdiaryapp.dtos.UserDTO;
import com.technophiles.newdiaryapp.exceptions.NewDiaryAppApplicationException;
import com.technophiles.newdiaryapp.models.User;
import com.technophiles.newdiaryapp.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserServiceConcreteTest {
    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Test
    void testThatCanDeleteUser() throws NewDiaryAppApplicationException {
        UserDTO userDTO = userService.createAccount("new.user@gmail.com", "password");
        User user = userRepository.findById(userDTO.getId()).get();
        userService.deleteUser(user);
        Optional<User> fromDataBase = userRepository.findById(userDTO.getId());
        assertThat(fromDataBase).isEqualTo(Optional.empty());

    }
}
