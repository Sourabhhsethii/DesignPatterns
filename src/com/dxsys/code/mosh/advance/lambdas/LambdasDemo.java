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
        greet(message ->
            System.out.println(prefix + message + suffix)
        );

        /**
         * Method Reference.
         * //Class/Object::method
         */
        greet(System.out::println);
    }

    // Programing to printer interface
    public static void greet(Printer printer) {
        printer.print("Programing to printer interface");
    }
}
