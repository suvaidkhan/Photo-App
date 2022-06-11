package com.photoapp.user.api.photoappuserapi.controllers;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoapp.user.api.photoappuserapi.Shared.UserDto;
import com.photoapp.user.api.photoappuserapi.models.CreateUserRequestModel;
import com.photoapp.user.api.photoappuserapi.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("/status/check")
    public String getUser() {
        return "working fine yo";
    }

    @PostMapping
    public String createUser(@RequestBody CreateUserRequestModel userDetails) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDto userDto = modelMapper.map(userDetails, UserDto.class);
        usersService.createUser(userDto);
        return "User saved";
    }

}
