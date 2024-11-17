package org.example.lesson;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SenderService {

    private final ISender sender; // = ConsoleSender.getInstance();

    public void send(String message) {
        sender.send(message);
    }


    public void init() {
        System.out.println("SenderService init");
    }
    public void start() {
        System.err.println("start");
    }
}
