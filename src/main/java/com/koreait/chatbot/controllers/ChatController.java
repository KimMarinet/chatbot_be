package com.koreait.chatbot.controllers;

import com.koreait.chatbot.entities.ChatData;
import com.koreait.chatbot.services.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class ChatController {
    private final ChatService service;

    /**
     * /chat?message=문장...
     * @param message
     * @return
     */
    @GetMapping
    public ChatData chat(@RequestParam("message") String message) {
        return service.process(message);
    }
}
