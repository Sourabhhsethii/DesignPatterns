package june2024.patterns.structural.composite;

public class CreatePackage {
    public static void main(String[] args) {
        BaseBox box = new SmallBox(1,2,3);
        BaseBox box1 = new BigBox(1,2,3,4);
        System.out.println(box);
        System.out.println(box1);
        BaseBox box2 = new CompoundBox(box1,1,2,3);
        System.out.println(box2);
    }
}
