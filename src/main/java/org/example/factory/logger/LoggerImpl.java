package org.example.factory.logger;

import java.time.OffsetDateTime;

public class LoggerImpl implements LoggerContract{

    public LoggerImpl(){}

    @Override
    public void print(String message) {
        System.out.print("[" + OffsetDateTime.now() + "] ");
        System.out.println(message);
    }
}
