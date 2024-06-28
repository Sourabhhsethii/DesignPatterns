package june2024.patterns.bhevarial.classproxy;

public class BoxProxy extends Box{

    public void colour(int a, boolean isProxy) {
        System.out.println("isProxy : " + isProxy);
        colour(a);
    }
}
