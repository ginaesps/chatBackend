package com.chatapp.chatserver.service.impl;

import com.chatapp.chatserver.model.User;
import com.chatapp.chatserver.model.UserStatus;
import com.chatapp.chatserver.repository.UserRepository;
import com.chatapp.chatserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUserStatus(long id, UserStatus userStatus) {
        User user = userRepository.getOne(id);
        user.setUser_status(userStatus);
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsersByChatroomId(long chatroomId) {
        return userRepository.findUsersByChatroomId(chatroomId);
    }
}
