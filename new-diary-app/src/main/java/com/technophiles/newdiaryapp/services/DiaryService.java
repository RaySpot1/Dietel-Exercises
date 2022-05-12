package com.technophiles.newdiaryapp.services;

import com.technophiles.newdiaryapp.models.Diary;
import com.technophiles.newdiaryapp.models.User;

public interface DiaryService {
    Diary createDiary(String text, User user);
}
