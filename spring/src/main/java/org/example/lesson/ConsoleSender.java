package org.example.lesson;

public class ConsoleSender implements ISender {

    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
