package org.example.dao;

import org.telegram.telegrambots.meta.api.objects.Message;

public record Response(Message message) {
}