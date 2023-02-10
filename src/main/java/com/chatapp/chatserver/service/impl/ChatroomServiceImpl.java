package com.chatapp.chatserver.service.impl;

import com.chatapp.chatserver.model.Chatroom;
import com.chatapp.chatserver.repository.ChatroomRepository;
import com.chatapp.chatserver.service.ChatroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatroomServiceImpl implements ChatroomService {
    @Autowired
    private ChatroomRepository chatroomRepository;

    @Override
    public Chatroom createChatroom(String name, long createdBy) {
        Chatroom chatroom = new Chatroom();
        chatroom.setName(name);
        chatroom.setCreatedBy(createdBy);
        return chatroomRepository.save(chatroom);
    }

    @Override
    public List<Chatroom> findAllChatrooms() {
        return chatroomRepository.findAll();
    }

    @Override
    public Chatroom findChatroomById(long id) {
        return chatroomRepository.findById(id).orElse(null);
    }

    @Override
    public void updateChatroom(Chatroom chatroom) {
        chatroomRepository.save(chatroom);
    }

    @Override
    public void deleteChatroom(Chatroom chatroom) {
        chatroomRepository.delete(chatroom);
    }
}
