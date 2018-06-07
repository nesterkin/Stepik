package org.stepik.java.module4;

import java.util.logging.*;

public class Task3 {

    public static void main(String[] args) {
        configureLogging();
    }

    private static void configureLogging() {
        Logger LoggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        LoggerA.setLevel(Level.ALL);
        Logger LoggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        LoggerB.setLevel(Level.WARNING);
        Logger LoggerC = Logger.getLogger("org.stepic.java");

        Handler handler = new ConsoleHandler();
        handler.setFormatter(new XMLFormatter());
        handler.setLevel(Level.ALL);
        LoggerC.addHandler(handler);
        LoggerC.setUseParentHandlers(false);
    }
}