package com.technophiles.newdiaryapp.controllers.responses;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ApiResponse {
    private Object payload;
    private boolean isSuccessful;
    private int statusCode;
    private String message;

}
