package com.koreait.chabot.services;

import com.koreait.chatbot.entities.ChatData;
import com.koreait.chatbot.services.ChatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ChatServiceTest {

    @Autowired
    private ChatService service;

    @Test
    void test(){
        ChatData data = service.process("잘 살아있나?");
        System.out.println(data);
    }
}
