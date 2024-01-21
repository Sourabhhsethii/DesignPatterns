package assignment.design.pen.entities;

public class Refill {
    private Nib nib;
    private Ink ink;

    public Refill(Nib nib, Ink ink) {
        this.nib = nib;
        this.ink = ink;
    }

    public Nib getNib() {
        return nib;
    }

    public Ink getInk() {
        return ink;
    }
}
