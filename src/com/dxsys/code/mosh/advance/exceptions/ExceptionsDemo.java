package com.dxsys.code.mosh.advance.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class ExceptionsDemo {

    // Checked | Unchecked | Error
    public static void show()  {

        // Handling Checked Exceptions
        try(
                var reader = new FileReader("file.text");
                var write = new FileReader("file.text");
        ) {
                        // Check Exception. Need to be handled before compile time and also know as compile time exception.
                var value= reader.read();
                new SimpleDateFormat().parse("");
        } catch (FileNotFoundException ex ) {
            System.out.println(ex.getMessage());
        } catch (IOException | ParseException e) {
            System.out.println("Could Not Read Data");
        }


   /*     // Run Time Excpetion - Unchecked Exception
        sayHello(null); // Null Pointer Exception
        int test = 5/0; // Arthimetic Exceptions
        // IllegalArgumentException
        // IndexOutOfBoundsException
        // IllegalStateExcpetion*/


        // Error -
        // StackoverflowError or OutOfMemory. These are programming Errors
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
