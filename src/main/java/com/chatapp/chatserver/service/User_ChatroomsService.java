package com.chatapp.chatserver.service;

import com.chatapp.chatserver.model.user_chatrooms;
import java.util.List;

public interface User_ChatroomsService {
    user_chatrooms addUserToChatroom(long userId, long chatroomId);
    List<user_chatrooms> findAllUserChatroomRelationships();
    user_chatrooms findUserChatroomRelationshipById(long id);
    List<user_chatrooms> findUserChatroomRelationshipsByUserId(long userId);
    List<user_chatrooms> findUserChatroomRelationshipByChatroomId(long chatroomId);

    List<user_chatrooms> findUserChatroomRelationshipsByChatroomId(long chatroomId);

    user_chatrooms updateUserChatroomRelationship(user_chatrooms userChatroom);
    void removeUserFromChatroom(user_chatrooms userChatroom);

    user_chatrooms createUserChatroomRelationship(long userId, long chatroomId);

    void deleteUserChatroomRelationship(long id);
}
