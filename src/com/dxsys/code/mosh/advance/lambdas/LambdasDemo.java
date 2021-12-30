package com.dxsys.code.mosh.advance.lambdas;

public class LambdasDemo {

    public static String suffix = "_";


    public static void main(String[] args) {

        /**
         * Anominous inner class
         */
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });

        String prefix = "-";
        /**
         * lamda Expression
         */
        greet( (message -> {
            greet(new ConsolePrinter());
            System.out.println(prefix + message + suffix);
        }));
    }

    // Programing to printer interface
    public static void greet(Printer printer) {
        printer.print("Programing to printer interface");
    }
}
