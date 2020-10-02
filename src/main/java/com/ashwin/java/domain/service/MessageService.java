package com.ashwin.java.domain.service;

import com.ashwin.java.domain.repository.MessageRepository;
import com.google.inject.Inject;

import java.util.Random;

public class MessageService {
    private final MessageRepository messageRepository;

    @Inject
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public String getMessage() {
        int i = new Random().nextInt(10);
        return messageRepository.getMessage(i);
    }
}
