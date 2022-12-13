package org.example.command;

import org.example.parsing.Parsing;

public enum CommandName {
    START("/start", "Enter /weather"),
    HELP("/help", "Command /start to get started\n" +
            "Command /help for help (no one will help you anymore)\n" +
            "Command /weather get information about weather in Ekaterinburg"),
    WEATHER("/weather", "Temperature in Ekaterinburg now is " + Parsing.parsing()),
    UNKNOWN("", "Sorry, I don't know this command ¯\\_(ツ)_/¯");

    private String name;
    private String answer;

    CommandName(String name, String response) {
        this.name = name;
        this.answer = response;
    }

    public String getName() {
        return name;
    }

    public String getAnswer() {
        return answer;
    }
}
