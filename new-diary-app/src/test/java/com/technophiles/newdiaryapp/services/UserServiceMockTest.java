package com.technophiles.newdiaryapp.services;

import com.technophiles.newdiaryapp.models.User;
import com.technophiles.newdiaryapp.exceptions.NewDiaryAppApplicationException;
import com.technophiles.newdiaryapp.repositories.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceMockTest {
    @Mock
    UserRepository userRepository;          //creates a mock object of the user repository
    private UserService userService;

    @Captor
    private ArgumentCaptor<User> userArgumentCaptor;

    @BeforeEach
    void setUp(){
       this.userService = new UserServiceImpl(userRepository);
    }

    @Test
    void testCanCreateAccount() throws NewDiaryAppApplicationException {
        String email = "testemail@gmail.com";
        String password = "password";
        when(userRepository.findUserByEmail(anyString())).thenReturn(Optional.empty());
        when(userRepository.save(any(User.class))).thenReturn(new User());
        userService.createAccount(email, password);
        verify(userRepository, times(1)).findUserByEmail(email);
        verify(userRepository, times(1)).save(userArgumentCaptor.capture());
        User user = userArgumentCaptor.getValue();
        assertThat(user.getEmail()).isEqualTo(email);
        assertThat(user.getPassword()).isEqualTo(password);
    }

    @AfterEach
    void tearDown(){
        userService = null;
    }
}
