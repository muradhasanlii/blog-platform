package com.muradhasanli.blog.service.impl;

import com.muradhasanli.blog.domain.entity.User;
import com.muradhasanli.blog.repository.UserRepository;
import com.muradhasanli.blog.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User getUserById(UUID id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not fount with id " + id));
    }
}
