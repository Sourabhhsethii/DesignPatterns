package com.dxsys.code.mosh.advance.lambdas;

// Lamda Expression -> Standalone Ananomous  Function exist without the class
public class LamdaExpression {

    public static void main(String[] args) {
        // greet(message-> System.out.println(message + " " +  message.length()));

        Printer printer = message -> System.out.println(message);
        Console console = check -> {
            System.out.println("test " +  check);
            return check;
        };

        printer.print("Hello Functional Programming using lambda & Functional Interfaces");
        console.checkConsole(true);
    }

}
