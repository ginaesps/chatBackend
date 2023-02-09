package com.chatapp.chatserver.model;
import lombok.*;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private long id;
    private String username;
    private UserStatus user_status;
    private List<Long> chatroomIds;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
