package com.chatapp.chatserver.model;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {

    private long id;
    private long chatRoomId;
    private long senderId;
    private long receiverId;
    private String senderName;
    private String receiverName;
    private String messageBody;
    private String dateTime;
    private MessageStatus messageStatus;
}