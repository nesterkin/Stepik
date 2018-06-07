package org.stepik.java.module4;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogDemo {
    private static final Logger LOGGER = Logger.getLogger(LogDemo.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.FINE, "Start method main with arg: {0}", Arrays.toString(args));

        try {
            randomlyFailingAlgorithms();
        } catch (IllegalStateException exc) {
            LOGGER.log(Level.SEVERE, "Exception caught", exc);
            System.exit(2);
        }

        LOGGER.fine("Finished successfully");
    }

    private static void randomlyFailingAlgorithms() {
        double randomNumber = Math.random();
        LOGGER.log(Level.FINE, "Random number - {0}", randomNumber);
        if (randomNumber < 0.5) {
            throw new IllegalStateException("Invalid phase of Moon");
        }
    }
}