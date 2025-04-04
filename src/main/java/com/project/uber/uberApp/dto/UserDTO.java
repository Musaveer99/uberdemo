package com.project.uber.uberApp.dto;

import com.project.uber.uberApp.enitities.enums.Role;
import lombok.*;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String name;
    private String email;
    private Set<Role> roles;

}
