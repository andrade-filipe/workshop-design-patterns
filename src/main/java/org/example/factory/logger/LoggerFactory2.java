package org.example.factory.logger;

public class LoggerFactory2 extends Logger{
    @Override
    protected LoggerContract loggerConstructor() {
        return new LoggerImpl2();
    }
}
