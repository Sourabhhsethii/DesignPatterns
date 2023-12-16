package dec2023.patterns.proxy;

import dec2023.patterns.proxy.model.PaymentEvent;
import dec2023.patterns.proxy.proxyclasses.viainterface.ICICIProxy;
import dec2023.patterns.proxy.proxyclasses.viainterface.IDFCProxy;

public class main {
    public static void main(String[] args) {
        Payment payment = new ICICIProxy();
        PaymentEvent event = payment.pay();
        System.out.println(event.getId());

        payment = new IDFCProxy();
        event = payment.pay();
        System.out.println(event.getId());

        // VIA Sublassing
        payment = new dec2023.patterns.proxy.proxyclasses.viasubclassing.ICICIProxy();
        event = payment.pay();
        System.out.println(event.getId());

        payment = new dec2023.patterns.proxy.proxyclasses.viasubclassing.IDFCProxy();
        event = payment.pay();
        System.out.println(event.getId());
    }
}
