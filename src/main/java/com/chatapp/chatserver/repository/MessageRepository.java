package com.chatapp.chatserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chatapp.chatserver.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}