package org.example.handlers;

import org.example.dao.Request;

public interface StopHandler {
    boolean needStop(Request request);
}