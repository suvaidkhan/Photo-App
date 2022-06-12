package com.photoapp.user.api.photoappuserapi.service;

import com.photoapp.user.api.photoappuserapi.shared.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDetails);
}
