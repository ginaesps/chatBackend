package com.chatapp.chatserver.service.impl;

import com.chatapp.chatserver.model.user_chatrooms;
import com.chatapp.chatserver.repository.User_ChatroomsRepository;
import com.chatapp.chatserver.service.User_ChatroomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_ChatroomsServiceImpl implements User_ChatroomsService {
    @Autowired
    private User_ChatroomsRepository userChatroomRepository;

    @Override
    public user_chatrooms addUserToChatroom(long userId, long chatroomId) {
        user_chatrooms userChatroom = new user_chatrooms();
        userChatroom.setChatroom_id((chatroomId));
        return userChatroomRepository.save(userChatroom);
    }

    @Override
    public List<user_chatrooms> findAllUserChatroomRelationships() {
        return userChatroomRepository.findAll();
    }

    @Override
    public user_chatrooms findUserChatroomRelationshipById(long id) {
        return userChatroomRepository.findById(id).orElse(null);
    }

    @Override
    public List<user_chatrooms> findUserChatroomRelationshipsByUserId(long userId) {
        return null;
    }

    @Override
    public List<user_chatrooms> findUserChatroomRelationshipByChatroomId(long chatroomId) {
        return null;
    }

    @Override
    public List<user_chatrooms> findUserChatroomRelationshipsByChatroomId(long chatroomId) {
        return userChatroomRepository.findByChatroomId(chatroomId);
    }

    @Override
    public user_chatrooms updateUserChatroomRelationship(user_chatrooms userChatroom) {
        userChatroomRepository.save(userChatroom);
        return userChatroom;
    }

    @Override
    public void removeUserFromChatroom(user_chatrooms userChatroom) {
        userChatroomRepository.delete(userChatroom);
    }

    @Override
    public user_chatrooms createUserChatroomRelationship(long userId, long chatroomId) {
        user_chatrooms relationship = new user_chatrooms();
        relationship.setUser_id(userId);
        relationship.setChatroom_id(chatroomId);
        return userChatroomRepository.save(relationship);
    }

    @Override
    public void deleteUserChatroomRelationship(long id) {
        userChatroomRepository.deleteById(id);
    }
}
