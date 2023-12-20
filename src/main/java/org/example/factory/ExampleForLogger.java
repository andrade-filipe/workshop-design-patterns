package org.example.factory;

import org.example.factory.logger.Logger;

public class ExampleForLogger {

    private Logger logger;

    public ExampleForLogger(Logger logger){
        this.logger = logger;
    }

    public void doWhatEver(){
        logger.log("Any Message");
    }
}
