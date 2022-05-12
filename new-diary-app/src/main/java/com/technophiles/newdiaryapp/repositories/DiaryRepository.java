package com.technophiles.newdiaryapp.repositories;

import com.technophiles.newdiaryapp.models.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
}
