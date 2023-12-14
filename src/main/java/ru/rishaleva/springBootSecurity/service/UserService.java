package ru.rishaleva.springBootSecurity.service;

import ru.rishaleva.springBootSecurity.model.User;

import java.util.List;

public interface UserService {
    User findByName(String name);

    User getUser(Long id);

    List<User> getAllUsers();

    User addUser(User user);

    void removeUser(Long id);

    void updateUser(User user);

}
