package com.project.uber.uberApp.services.impl;

import com.project.uber.uberApp.dto.DriverDTO;
import com.project.uber.uberApp.dto.SignupDTO;
import com.project.uber.uberApp.dto.UserDTO;
import com.project.uber.uberApp.enitities.Rider;
import com.project.uber.uberApp.enitities.User;
import com.project.uber.uberApp.enitities.enums.Role;
import com.project.uber.uberApp.exceptions.RunTimeConflictException;
import com.project.uber.uberApp.repositories.UserRepository;
import com.project.uber.uberApp.services.AuthService;
import com.project.uber.uberApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthSeriveImpl implements AuthService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final RiderService riderService;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signup(SignupDTO signupDTO) {
      userRepository.findByEmail(signupDTO.getEmail()).orElseThrow(() ->
         new RunTimeConflictException("User is already present with email: "+ signupDTO.getEmail()));


        User userMapped = modelMapper.map(signupDTO, User.class);
        userMapped.setRoles(Set.of(Role.RIDER));
        User savedUser = userRepository.save(userMapped);

        // Create user related entities
        riderService.createNewRider(savedUser);
//TODO add wallet service
        return modelMapper.map(savedUser, UserDTO.class);
    }

    @Override
    public DriverDTO onboardNewDriver(Long userId) {
        return null;
    }
}
