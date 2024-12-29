package com.example.chat_app.controller;

import com.example.chat_app.model.Message;
import com.example.chat_app.service.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/message")
public class MessageController {
    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public ResponseEntity<Message> sendMessage(@RequestBody Message message) {
        Message savedMessage = messageService.sendMessage(message);
        return ResponseEntity.ok(savedMessage);
    }

    @GetMapping("/history")
    public ResponseEntity<List<Message>> getChatHistory(@RequestParam String roomId) {
        List<Message> chatHistory = messageService.getChatHistory(roomId);
        return ResponseEntity.ok(chatHistory);
    }

}

// dtos? allargconstructor and autowired, requestparam vs pathvariable for getmapping
