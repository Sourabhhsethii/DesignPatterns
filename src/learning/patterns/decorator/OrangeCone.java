package learning.patterns.decorator;

/**
 * Base class
 */
public class OrangeCone implements IceCream {

    IceCream ic;

    public OrangeCone(){

    }

    public OrangeCone(IceCream ic){
        this.ic = ic;
    }

    @Override
    public String getDesc() {
        String desc;
        if(ic!= null) {
            desc = ic.getDesc() + "Orange Cone";
        } else {
            desc = "Orange Cone";
        }
        return desc;
    }

    @Override
    public Integer getCost() {
        Integer price;
        if(ic!= null) {
            price = ic.getCost() + 10;
        } else {
            price = 10;
        }
        return price;
    }
}
