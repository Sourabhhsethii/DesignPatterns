package learning.patterns.facade.before;

/**
 * Amazon Class is doing so many thins
 * orderPlaced is blotted method.
 */
public class Amazon {

    OrderPlacer orderPlacer;

    /**
     * constructor based injector
     * @param orderPlacer
     */
    public Amazon(
            OrderPlacer orderPlacer){
        this.orderPlacer = orderPlacer;
    }


    void orderPlaced(){
        orderPlacer.selectAndSaveItems();
        orderPlacer.payAndCheckout();
        orderPlacer.orderSentToInventory();
        orderPlacer.notifyUser();
    }
}
