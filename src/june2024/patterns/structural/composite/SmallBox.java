package june2024.patterns.structural.composite;

public class SmallBox extends BaseBox {

    int z;
    SmallBox(int x, int y,int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void containsItem() {
        super.containsItem() ;
        System.out.println("Added Item in SmallBox" + z);
    }

    @Override
    public String toString() {
        return "SmallBox{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
