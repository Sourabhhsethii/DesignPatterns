package dec2023.patterns.composite;

import dec2023.patterns.composite.models.Payment;
import dec2023.patterns.composite.models.Seats;
import dec2023.patterns.composite.models.Wheel;

public class Main {
    public static void main(String[] args) {
        Payment payment = new CompositeCar();

        Payment seats = new Seats(1,200);
        seats.execute();

        Payment wheel = new Wheel(1,200);
        wheel.execute();


        CompositeCar car = new CompositeCar();
        car.add(seats);
        car.add(wheel);
        car.execute();
        System.out.println(car.getTotal());

    }
}
