package july2024.patterns.bheavrial.iterator;

public class Main {
    public static void main(String[] args) {
        Iterator<Integer> itr = new ArrayList();

        itr.put(1);
        itr.put(2);
        itr.put(3);


        System.out.println(itr);
        itr.remove(3);
        System.out.println(itr);

        itr.remove(0);
        System.out.println(itr);

        itr.remove(9);
        System.out.println(itr);


      while (itr.hasNext()){
          System.out.println(itr.next());
      }

        itr.put(3);
        itr.put(3);
        itr.put(3);
        System.out.println(itr);

        Iterator itr2 = new Arrays<>();

        itr2.put(1);
        itr2.put(1);
        itr2.put(2);
        itr2.put("test");
        itr2.remove(2);
        System.out.println(itr2);

        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
}
