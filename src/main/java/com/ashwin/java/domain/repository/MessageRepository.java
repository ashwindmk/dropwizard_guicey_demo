package com.ashwin.java.domain.repository;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.ArrayList;
import java.util.List;

public class MessageRepository {
    private final List<String> messages;
    private final String defaultMessage;

    @Inject
    public MessageRepository(@Named("default-message") String defaultMessage) {
        messages = new ArrayList<>();
        messages.add("Hello, have a nice day.");
        messages.add("Hi, have a great day.");
        messages.add("Enjoy your day.");
        messages.add("Hello world.");

        this.defaultMessage = defaultMessage;
    }

    public String getMessage(int i) {
        if (i >= messages.size()) {
            return this.defaultMessage;
        }
        return messages.get(i);
    }
}
