package dec2023.patterns.proxy;

import dec2023.patterns.proxy.model.PaymentEvent;

public  class IDFCBank implements Payment {
    @Override
    public PaymentEvent pay() {
        return new PaymentEvent(2,"IDFCBank Payment Settled");
    }
}
