package jan2024.patterns.chainOfResponsibility;

public class Webserver {

    private Handler handler;

    public Webserver(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest httpRequest){
        handler.handle(httpRequest);
    }
}
