package com.africa.semicolon.diaryapp.controllers.response;

import com.africa.semicolon.diaryapp.models.Diary;
import com.africa.semicolon.diaryapp.services.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class DiaryController {
    @Autowired
    DiaryService diaryService;

    @PostMapping("/create/{userId}")
    public ReponseEntity<?> createNewDiary(@RequestParam String diaryTitle, @PathVariable("userId") String userId){
        try{
            Diary diary = diaryService.createDiary(diaryTitle, userId);
            APIResponse apiResponse = new APIResponse(diary, "diary successfully", true)
        }
    }
}
