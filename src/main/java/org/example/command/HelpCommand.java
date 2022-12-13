package org.example.command;

import org.example.dao.Request;
import org.example.dao.Response;
import org.telegram.telegrambots.meta.api.objects.Message;

public class HelpCommand implements Command {
    @Override
    public String getName() {
        return CommandName.HELP.getName();
    }

    @Override
    public Response handle(Request request) {
        Message message = request.message();
        message.setText(CommandName.HELP.getAnswer());

        return new Response(message);
    }
}