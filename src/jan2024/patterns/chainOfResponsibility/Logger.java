package jan2024.patterns.chainOfResponsibility;

public class Logger extends Handler {


    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("log");
        return false;
    }

}
