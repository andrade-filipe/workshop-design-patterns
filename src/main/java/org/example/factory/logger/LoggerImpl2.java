package org.example.factory.logger;

import java.time.OffsetDateTime;

public class LoggerImpl2 implements LoggerContract{
    @Override
    public void print(String message) {
        System.out.print("-" + OffsetDateTime.now() + "- ");
        System.out.println(message);
    }
}
