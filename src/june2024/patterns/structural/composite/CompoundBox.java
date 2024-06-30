package june2024.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundBox extends BaseBox {

    protected List<Box> subpackage = new ArrayList<>();
    CompoundBox( Box box, int... x) {
        super(x[0], x[1]);
        subpackage.add(box);
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
