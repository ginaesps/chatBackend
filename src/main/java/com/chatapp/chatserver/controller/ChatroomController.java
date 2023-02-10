package com.chatapp.chatserver.controller;

import com.chatapp.chatserver.model.Chatroom;
import com.chatapp.chatserver.service.ChatroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChatroomController {
    private final ChatroomService chatroomService;

    @Autowired
    public ChatroomController(ChatroomService chatroomService) {
        this.chatroomService = chatroomService;
    }

    @PostMapping("/chatroom")
    public Chatroom createChatroom(@RequestBody Chatroom chatroom) {
        return chatroomService.createChatroom(chatroom.getChatroom_name(), chatroom.getCreated_by());
    }

    @GetMapping("/chatroom/{id}")
    public Chatroom findChatroomById(@PathVariable long id) {
        return chatroomService.findChatroomById(id);
    }

    @PutMapping("/chatroom")
    public Chatroom updateChatroom(@RequestBody Chatroom chatroom) {
        chatroomService.updateChatroom(chatroom);
        return chatroom;
    }

    @DeleteMapping("/chatroom{id}")
    public void deleteChatroom(@PathVariable long id) {
        Chatroom chatroom = chatroomService.findChatroomById(id);
        if (chatroom != null) {
            chatroomService.deleteChatroom(chatroom);
        }
    }
}
