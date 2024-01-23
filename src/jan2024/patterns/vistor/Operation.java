package jan2024.patterns.vistor;

public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
