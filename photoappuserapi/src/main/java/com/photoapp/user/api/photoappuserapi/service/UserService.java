package com.photoapp.user.api.photoappuserapi.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.photoapp.user.api.photoappuserapi.shared.UserDto;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDetails);
}
