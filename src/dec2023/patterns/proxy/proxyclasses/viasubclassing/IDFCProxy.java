package dec2023.patterns.proxy.proxyclasses.viasubclassing;

import dec2023.patterns.proxy.IDFCBank;
import dec2023.patterns.proxy.model.PaymentEvent;

public class IDFCProxy extends IDFCBank {
    @Override
    public PaymentEvent pay() {
        System.out.println("Cross Cutting Concerns VIA Subclassing like CGLIB Proxy");
        return super.pay();
    }
}
