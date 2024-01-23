package jan2024.patterns.vistor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {

    private List<HTMLCode> node = new ArrayList<>();

    public void add(HTMLCode code){
        node.add(code);
    }

    public void execute(Operation operation){
        for (var nodes: node)
            nodes.execute(operation);
    }

}
