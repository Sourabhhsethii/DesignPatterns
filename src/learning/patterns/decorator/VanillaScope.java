package learning.patterns.decorator;

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
