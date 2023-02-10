package com.chatapp.chatserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chatapp.chatserver.model.Chatroom;

@Repository
public interface ChatroomRepository extends JpaRepository<Chatroom, Long> {

}