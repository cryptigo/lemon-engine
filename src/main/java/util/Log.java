package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void component(String className, String message) {
        String timeStamp = "[" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()) + "]";
        System.out.println(timeStamp + GREEN + " [" + className + "] : " + message + RESET);
    }

    public static void scene(String className, String message) {
        String timeStamp = "[" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()) + "]";
        System.out.println(timeStamp + PURPLE + " [" + className + "] : " + message + RESET);
    }

    public static void renderer(String className, String message) {
        String timeStamp = "[" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()) + "]";
        System.out.println(timeStamp + CYAN + " [" + className + "] : " + message + RESET);
    }

    public static void editor(String className, String message) {
        String timeStamp = "[" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()) + "]";
        System.out.println(timeStamp + BLUE + " [" + className + "] : " + message + RESET);
    }

    public static void lemon(String className, String message) {
        String timeStamp = "[" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()) + "]";
        System.out.println(timeStamp + YELLOW + " [" + className + "] : " + message + RESET);
    }







    // Info
    public static void info(String className, String message) {
        String timeStamp = "[" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()) + "]";
        System.out.println(timeStamp + GREEN + " [" + className + "] : " + message + RESET);
    }

    // error
    public static void error(String className, String message) {
        String timeStamp = "[" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()) + "]";
        System.out.println(timeStamp + RED + " [" + className + "] : " + message + RESET);
    }

    // Debug
    public static void debug(String className, String message) {
        String timeStamp = "[" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()) + "]";
        System.out.println(timeStamp + BLUE + " [" + className + "] : " + message + RESET);
    }

    // Trace
    public static void trace(String className, String message) {
        String timeStamp = "[" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()) + "]";
        System.out.println(timeStamp + CYAN + " [" + className + "] : " + message + RESET);
    }

    // Warning
    public static void warn(String className, String message) {
        String timeStamp = "[" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()) + "]";

        System.out.println(timeStamp + YELLOW + " [" + className + "] : " + message + RESET);
    }
}
