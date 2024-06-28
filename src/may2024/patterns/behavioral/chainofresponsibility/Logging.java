package may2024.patterns.behavioral.chainofresponsibility;

public class Logging extends Handler {

    public Logging(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        System.out.println("Logger");
        return false;
    }
}
