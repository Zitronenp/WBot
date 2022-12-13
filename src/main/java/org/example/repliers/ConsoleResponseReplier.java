package org.example.repliers;

import org.example.dao.Response;

public class ConsoleResponseReplier implements ResponseReplier {
    @Override
    public void reply(Response response) {
        System.out.println(response.message().getText());
    }
}