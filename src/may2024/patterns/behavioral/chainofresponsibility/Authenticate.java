package may2024.patterns.behavioral.chainofresponsibility;

public class Authenticate extends Handler {

    public Authenticate(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
     var result = httpRequest.getUsername() == "test" && httpRequest.getPassword() =="test";
        System.out.println("Authentication");
        return !result;
    }
}
