package dec2023.patterns.proxy.proxyclasses.viainterface;

import dec2023.patterns.proxy.ICICIBank;
import dec2023.patterns.proxy.Payment;
import dec2023.patterns.proxy.model.PaymentEvent;

public class ICICIProxy implements Payment {

    Payment iciciBank;

    @Override
    public PaymentEvent pay() {
        iciciBank = new ICICIBank();
        System.out.println("Proxy VIA interface like spring JDK does");
        System.out.println("Now You can add cross cutting concerns here....");
        return iciciBank.pay();
    }
}
