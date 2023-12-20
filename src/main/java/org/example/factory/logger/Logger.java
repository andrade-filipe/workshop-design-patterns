package org.example.factory.logger;

public abstract class Logger {
    //lets interface decide what implementation use
    protected abstract LoggerContract loggerConstructor();

    public void log(String message){
        loggerConstructor().print(message);
    }
}
