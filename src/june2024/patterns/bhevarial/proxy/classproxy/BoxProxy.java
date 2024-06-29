package june2024.patterns.bhevarial.proxy.classproxy;

public class BoxProxy extends Box{

    public void colour(int a, boolean isProxy) {
        System.out.println("isProxy : " + isProxy);
        colour(a);
    }
}
