package learning.patterns.facade.after;

/**
 * Amazon Client is free from blotter methods!!
 * Simple & Elegant & Clean Amazon Class!!
 */
public class Amazon {

    OrderPlacerFacade orderPlacerFacade;
    public Amazon(OrderPlacerFacade orderPlacerFacade){
        this.orderPlacerFacade = orderPlacerFacade;
    }

    void orderPlaced(){
        this.orderPlacerFacade.orderPlaced();
    }

}
