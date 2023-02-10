package com.chatapp.chatserver.service;

import com.chatapp.chatserver.model.Chatroom;

import java.util.List;

public interface ChatroomService {
    Chatroom createChatroom(String name, long createdBy);
    List<Chatroom> findAllChatrooms();
    Chatroom findChatroomById(long id);
    void updateChatroom(Chatroom chatroom);
    void deleteChatroom(Chatroom chatroom);
}
