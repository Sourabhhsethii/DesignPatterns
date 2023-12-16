package dec2023.patterns.proxy;

import dec2023.patterns.proxy.model.PaymentEvent;

public interface Payment {
    PaymentEvent pay();
}
