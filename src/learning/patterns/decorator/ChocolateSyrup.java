package learning.patterns.decorator;

public class ChocolateSyrup  implements IceCream{

    IceCream ic;

    public ChocolateSyrup(IceCream ic) {
        this.ic = ic;
    }

    @Override
    public String getDesc() {
        return ic.getDesc() + " ChocolateSyrup";
    }

    @Override
    public Integer getCost() {
        return ic.getCost() + 20;
    }
}
