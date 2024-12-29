package com.example.chat_app.service.impl;

import com.example.chat_app.model.Message;
import com.example.chat_app.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Override
    public Message sendMessage(Message message) {
        return null;
    }

    @Override
    public List<Message> getChatHistory(String roomId) {
        return null;
    }
}
