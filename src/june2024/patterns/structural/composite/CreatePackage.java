package june2024.patterns.structural.composite;

public class CreatePackage {
    public static void main(String[] args) {
        BaseBox box = new SmallBox(1,2,3);
        BaseBox box1 = new BigBox(1,2,3,4);
        System.out.println(box);
        System.out.println(box1);
        BaseBox box2 = new CompoundBox(1,2,box1);
        System.out.println(box2);

        BaseBox box3 = new CompoundBox(1,2, box);
        System.out.println(box3);
    }
}
