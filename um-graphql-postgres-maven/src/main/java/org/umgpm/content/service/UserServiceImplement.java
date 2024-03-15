package org.umgpm.content.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.umgpm.content.model.entity.User;
import org.umgpm.content.repository.UserRepository;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImplement implements UserService {

    private final UserRepository userRepository;
    @Override
    public User getUserById(String id) {
        return userRepository.findById(UUID.fromString(id)).orElse(null);
    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
