package com.project.uber.uberApp.dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDTO {

    private UserDTO user;
    private Double rating;

}
