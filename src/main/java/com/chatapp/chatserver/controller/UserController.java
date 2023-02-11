package com.chatapp.chatserver.controller;

import com.chatapp.chatserver.model.Users;
import com.chatapp.chatserver.model.UserStatus;
import com.chatapp.chatserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public ResponseEntity<Users> createUser(@RequestBody Users user) {
        Users newUser = userService.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<Users> findUserById(@PathVariable long id) {
        return userService.findUserById(id);
    }

    @PutMapping("/")
    public Users updateUser(@RequestBody Users user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
    }

    @PutMapping("/{id}/status")
    public Users updateUserStatus(@PathVariable long id, @RequestParam ("UserStatus") UserStatus userStatus) {
        return userService.updateUserStatus(id, userStatus);
    }

    @GetMapping("/chatroom/{chatroomId}")
    public List<Users> getUsersByChatroomId(@PathVariable long chatroomId) {
        return userService.getUsersByChatroomId(chatroomId);
    }
}
