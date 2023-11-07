package learning.patterns.basics.anonymous.innnerclass;

public class Cli {
    public static void main(String[] args) {
        print(new ConsolePrinter());
        print(new Printer() {
            @Override
            public void print(String message) {
                System.out.println("Test Anonymous Class");
            }
        });
    }
    public static void print(Printer printer){
        printer.print("Test");
    }
}
