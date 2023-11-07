package learning.patterns.basics.anonymous.innnerclass;

public class ConsolePrinter implements Printer{
    @Override
    public void print(String messagge) {
        System.out.println(messagge);
    }
}
