package com.example.chatbot.controller;

import com.example.chatbot.model.MessageRequest;
import com.example.chatbot.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public String receiveMessage(@RequestBody MessageRequest request) {

        System.out.println("Received message: " + request.getMessage());

        return chatService.getReply(request.getMessage());
    }
}