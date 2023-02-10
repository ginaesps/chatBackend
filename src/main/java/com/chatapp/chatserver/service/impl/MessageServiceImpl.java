package com.chatapp.chatserver.service.impl;

import com.chatapp.chatserver.model.Message;
import com.chatapp.chatserver.repository.MessageRepository;
import com.chatapp.chatserver.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Message sendMessage(long chatroomId, long senderId, long receiverId, String senderName, String receiverName, String MessageBody) {
        Message message = new Message();
        message.setChatroom_id(chatroomId);
        message.setSender_id(senderId);
        message.setReceiver_id(receiverId);
        message.setSender_name(senderName);
        message.setReceiver_name(receiverName);
        message.setMessage_body(message.getMessage_body()); //not sure
        return messageRepository.save(message);
    }

    @Override
    public List<Message> findAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public Message findMessageById(long id) {
        return messageRepository.findById(id).orElse(null);
    }

    @Override
    public List<Message> findMessagesByChatroomId(long chatroomId) {
        return messageRepository.findByChatroomId(chatroomId);
    }

    @Override
    public void updateMessage(Message message) {
        messageRepository.save(message);
    }

    @Override
    public void deleteMessage(Message message) {
        messageRepository.delete(message);
    }
}
