package com.chatapp.chatserver.model;
import lombok.*;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class user_chatrooms {
    private long id;
    private long user_id;
    private long chatroom_id;
    private Timestamp created_at;
    private Timestamp updated_at;
}
