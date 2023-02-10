package com.chatapp.chatserver.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus indicates that if an error happens, a 400 status will be returned
//RuntimeException indicates that it's an unchecked exception
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class User_ChatroomsException extends RuntimeException {
    public User_ChatroomsException(String message) {
        //the message is the error returned in the HTTP response
        super(message);
    }
}
