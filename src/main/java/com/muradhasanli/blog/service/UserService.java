package com.muradhasanli.blog.service;

import com.muradhasanli.blog.domain.entity.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
