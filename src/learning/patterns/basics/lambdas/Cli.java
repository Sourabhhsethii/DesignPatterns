package learning.patterns.basics.lambdas;

import learning.patterns.basics.anonymous.innnerclass.Printer;

public class Cli {
    public static void main(String[] args) {

        String prifix = "-";

        // Lamba Expression
        print((String msg)->{
            System.out.println(msg);
        });

        // Simplified
        print( msg->  System.out.println(msg));

        // More Simplified - // Add local variable as well.
        Printer printer = message -> System.out.println(prifix + message);
        printer.print("Test 2 - Simple ");

    }

    public static void print(Printer printer){
        printer.print("Test");
    }
}
