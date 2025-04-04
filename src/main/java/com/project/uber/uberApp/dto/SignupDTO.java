package com.project.uber.uberApp.dto;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupDTO {

    private String name;
    private String email;
    private String password;
}
