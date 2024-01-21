package assignment.design.pen.entities.pentype;

import assignment.design.pen.entities.Body;
import assignment.design.pen.entities.PenType;
import assignment.design.pen.statergies.WritingStrategy;

public abstract class Pen {
    public Integer serialNo;
    public Body body;

    public Pen(Integer serialNo, Body body) {
        this.serialNo = serialNo;
        this.body = body;
    }

    public abstract void write();
}
