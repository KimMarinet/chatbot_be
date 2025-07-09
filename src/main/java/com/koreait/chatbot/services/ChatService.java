package com.koreait.chatbot.services;

import com.koreait.global.configs.PythonProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Lazy
@Service
@RequiredArgsConstructor
@EnableConfigurationProperties(PythonProperties.class)
public class ChatService {
    private final PythonProperties properties;
    private final WebApplicationContext ctx;


}
