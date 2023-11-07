package learning.patterns.basics.methodRefernce;

import learning.patterns.basics.anonymous.innnerclass.Printer;

public class Cli {

    public Cli(String message){
        System.out.println(message);
    }
    public static void main(String[] args) {

        print((message) -> System.out.println(message),"Tes2");
        // Class/Object :: method
        print(System.out::println,"test");
        print(Cli::new,"test"); // Constructor
        print(System.out::println,"");

    }

    public static void print(Printer printer, String a){
        printer.print(a);
    }
}
