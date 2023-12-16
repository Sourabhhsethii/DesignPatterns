package dec2023.patterns.proxy;

import dec2023.patterns.proxy.model.PaymentEvent;

public class ICICIBank implements Payment{
    @Override
    public PaymentEvent pay() {
        return new PaymentEvent(1,"Test Table");
    }
}
