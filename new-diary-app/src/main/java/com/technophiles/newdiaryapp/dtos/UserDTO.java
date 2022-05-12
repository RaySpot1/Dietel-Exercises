package com.technophiles.newdiaryapp.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.technophiles.newdiaryapp.models.Diary;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties("diaries")
public class UserDTO {
    private Long id;
    private String email;
    private Set<Diary> diaries;
}
