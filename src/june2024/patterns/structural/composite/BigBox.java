package june2024.patterns.structural.composite;

public class BigBox extends BaseBox{

    int z;
    int l;

    BigBox(int x, int y, int z,int l) {
        super(x, y);
        this.z = z;
        this.l = l;
    }

    @Override
    public void containsItem() {
        super.containsItem() ;
        System.out.println("Added Item in BigBox" + z + " " +  l);
    }

    @Override
    public String toString() {
        return "BigBox{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", l=" + l +
                '}';
    }
}
