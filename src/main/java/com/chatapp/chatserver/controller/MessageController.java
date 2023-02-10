package com.chatapp.chatserver.controller;

import com.chatapp.chatserver.model.Message;
import com.chatapp.chatserver.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping
    public Message sendMessage(@RequestParam long chatroomId,
                               @RequestParam long senderId,
                               @RequestParam long receiverId,
                               @RequestParam String senderName,
                               @RequestParam String receiverName,
                               @RequestParam String messageBody) {
        return messageService.sendMessage(chatroomId, senderId, receiverId, senderName, receiverName, messageBody);
    }

    @GetMapping
    public List<Message> findAllMessages() {
        return messageService.findAllMessages();
    }

    @GetMapping("/{id}")
    public Message findMessageById(@PathVariable long id) {
        return messageService.findMessageById(id);
    }

    @GetMapping("/chatroom/{chatroomId}")
    public List<Message> findMessagesByChatroomId(@PathVariable long chatroomId) {
        return messageService.findMessagesByChatroomId(chatroomId);
    }

    @PutMapping
    public void updateMessage(@RequestBody Message message) {
        messageService.updateMessage(message);
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable long id) {
        Message message = messageService.findMessageById(id);
        messageService.deleteMessage(message);
    }
}
