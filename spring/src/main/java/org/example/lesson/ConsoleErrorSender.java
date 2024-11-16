package org.example.lesson;

public class ConsoleErrorSender implements ISender {

    @Override
    public void send(String message) {
        System.err.println(message);
    }

    public void init() {
        System.out.println("console error sender init");
    }
}
