package assignment.design.pen.entities.pentype;

import assignment.design.pen.entities.Body;
import assignment.design.pen.entities.Ink;
import assignment.design.pen.entities.Nib;
import assignment.design.pen.entities.PenType;
import assignment.design.pen.factories.WritingFactory;
import assignment.design.pen.statergies.WritingStrategy;

public class BalPen extends Pen {
    private Nib nib;
    private Ink ink;

    public BalPen(Integer serialNo, Body body, Nib nib, Ink ink) {
        super(serialNo, body);
        this.nib = nib;
        this.ink = ink;
    }

    public Nib getNib() {
        return nib;
    }

    public Ink getInk() {
        return ink;
    }


    @Override
    public void write() {
        WritingFactory.getWritingStrategy(PenType.BALL_PEN).write();
    }
}
