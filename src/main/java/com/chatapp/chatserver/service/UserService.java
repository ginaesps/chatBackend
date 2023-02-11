package com.chatapp.chatserver.service;

import com.chatapp.chatserver.model.Users;
import com.chatapp.chatserver.model.UserStatus;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Users createUser(Users user);
    List<Users> getAllUsers();
    Optional<Users> findUserById(long id);
    Users updateUser(Users user);
    void deleteUser(long id);
    Users updateUserStatus(long id, UserStatus userStatus);
    List<Users> getUsersByChatroomId(long chatroomId);
}
