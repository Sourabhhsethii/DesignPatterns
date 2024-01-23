package jan2024.patterns.chainOfResponsibility;

public class Authenticator extends Handler {


    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var idValid = (request.getUserName() == "admin") && request.getPassword() == "password";
        System.out.println("Authentication");
        return !idValid;
    }
}
