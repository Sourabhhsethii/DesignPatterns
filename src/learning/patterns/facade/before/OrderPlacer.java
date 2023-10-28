package learning.patterns.facade.before;

public class OrderPlacer {

    public void selectAndSaveItems(){
        System.out.println("Selected and Saved Items ");
    }

    public void payAndCheckout(){
        System.out.println("Checkout Done!!!");
    }

    public void orderSentToInventory(){
        System.out.println("Order Sent To Inventory!!!");
    }

    public void notifyUser(){
        System.out.println("Order Notified to User");
    }
}
