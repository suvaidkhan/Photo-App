package com.photoapp.user.api.photoappuserapi.data;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByUserEmail(String email);
}
