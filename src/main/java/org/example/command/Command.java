package org.example.command;

import org.example.dao.Request;
import org.example.dao.Response;

public interface Command {
    String getName();
    Response handle(Request request);
}