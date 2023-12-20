package org.example.factory.logger;

public class LoggerFactory extends Logger{

    public LoggerFactory(){}

    @Override
    protected LoggerContract loggerConstructor() {
        return new LoggerImpl();
    }
}
