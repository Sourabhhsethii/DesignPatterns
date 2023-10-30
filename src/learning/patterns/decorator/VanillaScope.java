package learning.patterns.decorator;

/**
 * Add on class
 */
public class VanillaScope implements IceCream{

    IceCream ic;

    public VanillaScope(IceCream ic){
        this.ic = ic;
    }

    @Override
    public String getDesc() {
        return ic.getDesc() + " Vanilla Scop ";
    }

    @Override
    public Integer getCost() {
        return ic.getCost() + 5;
    }
}
