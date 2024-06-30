package june2024.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundBox extends BaseBox {

    protected List<Box> subpackage = new ArrayList<>();
    CompoundBox(int x, int y, Box... box) {
        super(1,2);
        for(var b: box)
        subpackage.add(b);
    }

    @Override
    public void containsItem() {
        super.containsItem();
    }

    @Override
    public String toString() {
        return "CompoundBox{" +
                "x=" + x +
                ", y=" + y +
                ", subpackage=" + subpackage +
                '}';
    }
}
