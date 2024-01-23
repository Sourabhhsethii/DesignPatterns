package jan2024.patterns.vistor;

public class Main {
    public static void main(String[] args) {
        var doc = new HtmlDocument();
        doc.add(new HeadingNode());
        doc.add(new AnchorNode());

        doc.execute(new HiglightOperation());
        doc.execute(new PlainTextOpn());
    }
}
