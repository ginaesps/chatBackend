package com.chatapp.chatserver.service.impl;

import com.chatapp.chatserver.model.Users;
import com.chatapp.chatserver.model.UserStatus;
import com.chatapp.chatserver.repository.UsersRepository;
import com.chatapp.chatserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users createUser(Users user) {
        return usersRepository.save(user);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Optional<Users> findUserById(long id) {
        return usersRepository.findById(id);
    }

    @Override
    public Users updateUser(Users user) {
        return usersRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        usersRepository.deleteById(id);
    }

    @Override
    public Users updateUserStatus(long id, UserStatus userStatus) {
        Users user = usersRepository.getOne(id);
        user.setUser_status(userStatus);
        return usersRepository.save(user);
    }

    @Override
    public List<Users> getUsersByChatroomId(long chatroomId) {
        return usersRepository.findUsersByChatroomId(chatroomId);
    }
}
