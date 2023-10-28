package learning.patterns.facade.after;

/**
 * Now Order Placer Facade will do everything!!!
 */
public class OrderPlacerFacade {

    OrderPlacer orderPlacer;

    public OrderPlacerFacade(OrderPlacer orderPlacer){
        this.orderPlacer = orderPlacer;
    }

    void orderPlaced(){
        orderPlacer.selectAndSaveItems();
        orderPlacer.payAndCheckout();
        orderPlacer.orderSentToInventory();
        orderPlacer.notifyUser();
    }
}
