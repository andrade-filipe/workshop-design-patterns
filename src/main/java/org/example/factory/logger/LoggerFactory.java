package org.example.factory.logger;

public class LoggerFactory extends Logger{
    @Override
    protected LoggerContract loggerConstructor() {
        return new LoggerImpl();
    }
}
