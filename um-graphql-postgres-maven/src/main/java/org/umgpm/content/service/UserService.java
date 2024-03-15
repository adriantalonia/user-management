package org.umgpm.content.service;

import org.umgpm.content.model.entity.User;

import java.util.List;

public interface UserService {

    User getUserById(String id);
    List<User> getUsers();
}
