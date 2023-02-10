package com.chatapp.chatserver.controller;

import com.chatapp.chatserver.model.user_chatrooms;
import com.chatapp.chatserver.service.User_ChatroomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-chatroom")
public class User_ChatroomsController {
    @Autowired
    private User_ChatroomsService userChatroomService;

    @PostMapping
    public user_chatrooms createUserChatroomRelationship(@RequestParam long userId, @RequestParam long chatroomId) {
        return userChatroomService.createUserChatroomRelationship(userId, chatroomId);
    }

    @GetMapping
    public List<user_chatrooms> findAllUserChatroomRelationships() {
        return userChatroomService.findAllUserChatroomRelationships();
    }

    @GetMapping("/{id}")
    public user_chatrooms findUserChatroomRelationshipById(@PathVariable long id) {
        return userChatroomService.findUserChatroomRelationshipById(id);
    }

    @GetMapping("/chatroom/{chatroomId}")
    public List<user_chatrooms> findUserChatroomRelationshipsByChatroomId(@PathVariable long chatroomId) {
        return userChatroomService.findUserChatroomRelationshipsByChatroomId(chatroomId);
    }

    @PutMapping
    public user_chatrooms updateUserChatroomRelationship(@RequestBody user_chatrooms userChatroom) {
        return userChatroomService.updateUserChatroomRelationship(userChatroom);
    }

    @DeleteMapping("/{id}")
    public void deleteUserChatroomRelationship(@PathVariable long id) {
        userChatroomService.deleteUserChatroomRelationship(id);
    }
}