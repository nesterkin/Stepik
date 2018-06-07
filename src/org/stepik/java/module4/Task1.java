package org.stepik.java.module4;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
        stillAnotherMethod();
    }

    private static void stillAnotherMethod() {
        getCallerClassAndMethodName();
    }

    public static String getCallerClassAndMethodName() {
        Exception exception = new Exception();
        String string;
        try {
            throw exception;
        } catch (Exception ex) {
            StackTraceElement[] stack = ex.getStackTrace();
            if (stack[1].getMethodName().equals("main")) {
                return "null";
            } else {
                string = stack[1].getClassName() + "#" + stack[1].getMethodName();
                System.out.println("stack[1].getClassName() = " + string);
            }
        }

        return string;
    }
}