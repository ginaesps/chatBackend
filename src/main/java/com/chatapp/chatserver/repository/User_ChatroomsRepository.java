package com.chatapp.chatserver.repository;

import com.chatapp.chatserver.model.user_chatrooms;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface User_ChatroomsRepository extends JpaRepository<user_chatrooms, Long> {
    List<user_chatrooms> findByChatroomId(long chatroomId);
}
