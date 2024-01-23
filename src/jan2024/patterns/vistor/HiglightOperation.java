package jan2024.patterns.vistor;

public class HiglightOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Higlight-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("higlight-anchor");
    }
}
