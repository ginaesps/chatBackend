package com.chatapp.chatserver.service;

import com.chatapp.chatserver.model.Message;

import java.util.List;

public interface MessageService {
    Message sendMessage(long chatroomId, long senderId, long receiverId, String senderName, String receiverName, String messageBody);
    List<Message> findAllMessages();
    Message findMessageById(long id);
    List <Message> findMessagesByChatroomId(long chatroomId);
    void updateMessage(Message message);
    void deleteMessage(Message message);
}
