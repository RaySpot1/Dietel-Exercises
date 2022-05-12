package com.technophiles.newdiaryapp.services;

import com.technophiles.newdiaryapp.models.Diary;
import com.technophiles.newdiaryapp.models.User;
import com.technophiles.newdiaryapp.dtos.UserDTO;
import com.technophiles.newdiaryapp.exceptions.NewDiaryAppApplicationException;

import javax.validation.constraints.NotNull;

public interface UserService {
    UserDTO createAccount(String email, String password) throws NewDiaryAppApplicationException;
    Diary addDiary(@NotNull  Long id, @NotNull Diary diary) throws NewDiaryAppApplicationException;

    User findById(Long userId) throws NewDiaryAppApplicationException;

    boolean deleteUser(User user);
}
