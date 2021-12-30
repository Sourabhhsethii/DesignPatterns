package com.dxsys.code.mosh.advance.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;

public class ExceptionsDemo {

    // Checked | Unchecked | Error
    public static void show() throws FileNotFoundException {
        var reader = new FileReader("file.text"); // Check Exception. Need to be handled before compile time and also know as compile time exception.

        // Run Time Excpetion - Unchecked Exception
        sayHello(null); // Null Pointer Exception
        int test = 5/0; // Arthimetic Exceptions
        // IllegalArgumentException
        // IndexOutOfBoundsException
        // IllegalStateExcpetion

        // Error - StackoverflowError or OutOfMemory. These are programming Errors


    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
