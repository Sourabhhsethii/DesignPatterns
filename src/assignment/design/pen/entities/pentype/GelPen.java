package assignment.design.pen.entities.pentype;

import assignment.design.pen.entities.Body;
import assignment.design.pen.entities.PenType;
import assignment.design.pen.entities.Refill;
import assignment.design.pen.factories.WritingFactory;
import assignment.design.pen.statergies.GelPenStrategy;
import assignment.design.pen.statergies.WritingStrategy;

public class GelPen extends Pen {

    private Refill refill;

    public GelPen(Integer serialNo, Body body, Refill refill) {
        super(serialNo, body);
        this.refill = refill;
    }

    public Refill getRefill() {
        return refill;
    }

    @Override
    public void write() {
        WritingFactory.getWritingStrategy(PenType.GEL_PEN).write();
    }
}
