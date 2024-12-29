package com.example.chat_app.service;

import com.example.chat_app.model.Message;
import com.example.chat_app.repository.MessageRepository;

import java.util.List;

public interface MessageService {
     Message sendMessage(Message message);
     List<Message> getChatHistory(String roomId);


}
