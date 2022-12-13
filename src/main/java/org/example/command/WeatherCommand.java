package org.example.command;

import org.example.dao.Request;
import org.example.dao.Response;
import org.telegram.telegrambots.meta.api.objects.Message;

public class WeatherCommand implements Command {
    @Override
    public String getName() {
        return CommandName.WEATHER.getName();
    }
    @Override
    public Response handle(Request request) {
        Message message = request.message();
        message.setText(CommandName.WEATHER.getAnswer());

        return new Response(message);
    }
}