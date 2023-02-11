package com.chatapp.chatserver.model;
import lombok.*;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users {
    private long id;
    private String username;
    private UserStatus user_status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
