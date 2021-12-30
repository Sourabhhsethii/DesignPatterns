package com.dxsys.code.mosh.advance.lambdas;

public class LambdasDemo {

    public static void main(String[] args) {
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    // Programing to printer interface
    public static void greet(Printer printer) {
        printer.print("Programing to printer interface");
    }
}
