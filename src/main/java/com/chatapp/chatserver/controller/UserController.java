package com.chatapp.chatserver.controller;

import com.chatapp.chatserver.model.User;
import com.chatapp.chatserver.model.UserStatus;
import com.chatapp.chatserver.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User newUser = userService.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable long id) {
        return userService.findUserById(id);
    }

    @PutMapping("/")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
    }

    @PutMapping("/{id}/status")
    public User updateUserStatus(@PathVariable long id, @RequestParam ("UserStatus") UserStatus userStatus) {
        return userService.updateUserStatus(id, userStatus);
    }

    @GetMapping("/chatroom/{chatroomId}")
    public List<User> getUsersByChatroomId(@PathVariable long chatroomId) {
        return userService.getUsersByChatroomId(chatroomId);
    }
}
