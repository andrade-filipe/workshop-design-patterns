package org.example.factory;

import org.example.factory.logger.Logger;
import org.example.factory.logger.LoggerFactory;
import org.example.factory.logger.LoggerFactory2;
import org.example.factory.logger.LoggerImpl;

public class Main {

    public static void main(String[] args) {
        Logger logger = new LoggerFactory();
        Logger logger2 = new LoggerFactory2();
        var exemplo = new ExampleForLogger(logger2);

        exemplo.doWhatEver();

        logger.log("Messaging directly from logger");
    }
}
