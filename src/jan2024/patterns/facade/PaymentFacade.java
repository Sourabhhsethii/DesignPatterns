package jan2024.patterns.facade;

public class PaymentFacade {
    private Funds funds;
    private Pay pay;
    private boolean isPaid;

    public PaymentFacade(Funds funds, Pay pay) {
        this.funds = funds;
        this.pay = pay;
    }

     boolean pay(String name,Integer amount){
     if(funds.checkFunds(name,amount)){
         isPaid = true;
     }
     return isPaid;
    }
}
