package jan2024.patterns.chainOfResponsibility;

public class Encrptor extends Handler{


    public Encrptor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Encrpt");
        return false;
    }
}
