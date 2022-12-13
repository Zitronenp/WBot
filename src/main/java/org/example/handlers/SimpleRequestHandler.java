package org.example.handlers;

import org.example.dao.Request;
import org.example.dao.Response;

public class SimpleRequestHandler implements RequestHandler {
    @Override
    public Response handle(Request request) {
        return new Response(request.message());
    }
}