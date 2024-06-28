package may2024.patterns.behavioral.chainofresponsibility;

public abstract class Handler {

    private Handler next;

    public abstract boolean doHandle(HttpRequest httpRequest);

    public Handler(Handler next){
        this.next = next;
    }

    public void handle(HttpRequest httpRequest){
        if(doHandle(httpRequest))
            return;

        if(next!=null)
            next.handle(httpRequest);
    }
}
