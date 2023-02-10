package com.chatapp.chatserver.service;

import com.chatapp.chatserver.model.User;
import com.chatapp.chatserver.model.UserStatus;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    Optional<User> findUserById(long id);
    User updateUser(User user);
    void deleteUser(long id);
    User updateUserStatus(long id, UserStatus userStatus);
    List<User> getUsersByChatroomId(long chatroomId);
}
