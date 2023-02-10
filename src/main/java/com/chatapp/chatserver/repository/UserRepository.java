package com.chatapp.chatserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chatapp.chatserver.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}