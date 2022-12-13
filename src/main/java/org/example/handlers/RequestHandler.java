package org.example.handlers;

import org.example.dao.Request;
import org.example.dao.Response;

public interface RequestHandler {
    Response handle(Request request);
}