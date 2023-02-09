package com.chatapp.chatserver.model;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {

    private long id;
    private long chatroom_id;
    private long sender_id;
    private long receiver_id;
    private String sender_name;
    private String receiver_name;
    private String message_body;
    private String date_time;
    private MessageStatus message_status;
}