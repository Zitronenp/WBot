package org.example.handlers;

import org.example.dao.Request;
import org.example.dao.Response;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface Converter {
    Request convertMessageToRequest(Message message);
    SendMessage convertResponseToMessage(Response response);
}