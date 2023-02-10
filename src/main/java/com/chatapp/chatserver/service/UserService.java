package com.chatapp.chatserver.service;

import com.chatapp.chatserver.model.User;
import com.chatapp.chatserver.model.UserStatus;
import com.chatapp.chatserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findUserById(long id) {
        return userRepository.findById(id);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    public User updateUserStatus(long id, UserStatus userStatus) {
        User user = userRepository.getOne(id);
        user.setUser_status(userStatus);
        return userRepository.save(user);
    }

    public List<User> getUsersByChatroomId(long chatroomId) {
        return userRepository.findUsersByChatroomId(chatroomId);
    }
}
