package june2024.patterns.bhevarial.proxy.interfaceproxy;

public class BoxProxy implements Box{
    @Override
    public void colour(int a) {
        System.out.println("Proxy");
        System.out.println(a);
    }
}
