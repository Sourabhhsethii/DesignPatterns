package assignment.design.pen;

import assignment.design.pen.entities.*;
import assignment.design.pen.entities.pentype.BalPen;
import assignment.design.pen.entities.pentype.GelPen;
import assignment.design.pen.entities.pentype.Pen;

import java.util.List;

/**
 * Let's build Pen here in this main class!!!
 */
public class Main {
    public static void main(String[] args) {
        List<PenFeatures> penFeatures = List.of(PenFeatures.WATERPROOF);
        Nib nib = new Nib(0.5f);
        Ink ink = new Ink("blue","polyester",penFeatures);
        Refill refill = new Refill(nib,ink);

        Pen gelPen = new GelPen(22,new Body("Green", 2,3),refill);
        gelPen.write();


        Pen ballPen = new BalPen(22,new Body("Green", 2,3),new Nib(0.5f), new Ink("green","plastic",penFeatures));
        ballPen.write();


    }
}
