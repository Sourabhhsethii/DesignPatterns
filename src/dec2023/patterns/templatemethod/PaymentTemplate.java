package dec2023.patterns.templatemethod;

public abstract class PaymentTemplate {

    public void execute(){
        setupPayment();
        paymentExecution();
        paymentLogged();
    }

    public void setupPayment(){
        System.out.println("Setting up the system");
    }

    public abstract void paymentExecution();

    public void paymentLogged(){
        System.out.println("Payment Logged");
    }

}
