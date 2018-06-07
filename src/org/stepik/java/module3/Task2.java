package org.stepik.java.module3;

import java.util.function.DoubleUnaryOperator;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        final double h = 1e-6;
        double sum = 0;
        long i = 0;
        for (double x = a; x < b; x = a + h * i++) {
            sum += h * f.applyAsDouble(x);
        }
        return sum;
    }
}