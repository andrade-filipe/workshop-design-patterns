package org.example.factory;

import org.example.factory.logger.Logger;
import org.example.factory.logger.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        Logger logger = new LoggerFactory();
        var exemplo = new ExampleForLogger(logger);

        exemplo.doWhatEver();

        logger.log("Messaging directly from logger");
    }
}
