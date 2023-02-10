package com.chatapp.chatserver.model;
import lombok.*;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Chatroom {
    private long id;
    private String chatroom_name;
    private String url;
    private long created_by;
    private Timestamp created_at;
    private Timestamp updated_at;
}
