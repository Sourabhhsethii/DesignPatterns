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

        /**
         * Build-in Functional Interfaces to perform common tasks
         * Consumer Interface -  void consume(obj) -> Takes Single Arguments and returns nothing.
         * Supplier Interface - Opposite of Consumer Interface -> obj supply() -> Takes No Arguments and returns value.
         * Function - Obj map(obj) -> Function that map a value on differnt value.
         * Predicate - bool test(condition) -> opration that takes a object - check and see if object satisify cretira // used for filter data
         *
         *
         */
    }

    // Programing to printer interface
    public static void greet(Printer printer) {
        printer.print("Programing to printer interface");
    }
}
