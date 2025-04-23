package dev.zanderlewis.learn;

public class Utilities {
    public static void print(String message) {
        System.out.println(message);
    }

    public static void printDivider() {
        System.out.println("===================================");
    }

    public static void Error(String message) {
        System.err.println(message);
        System.exit(1);
    }

    public static boolean negCheck(String text, int number) {
        if (number < 0) {
            Error(text + " cannot be negative!");
            return true;
        }
        return false;
    }
}
