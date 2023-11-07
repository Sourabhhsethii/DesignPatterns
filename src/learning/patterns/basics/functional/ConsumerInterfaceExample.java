package learning.patterns.basics.functional;


import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);
        // Imperative Programming With Instructions (for loop, if/ele or switch/case )
        // How need to be done
        for (Integer val: list){
            System.out.println(val);
        }
        // Another way to iterate over the list.
        // Declarative Programing
        // Only What needs to be done.
        list.forEach(item-> System.out.println(item));

        // Chaining The Consumers
        List<String> list1 = List.of("a","b","c");

        /**
         * Consumer have two Operations
         * First -> accept
         * Second -> andThen -> Default Method
         */
        Consumer<String> print = item -> System.out.print (item);
        Consumer<String> printUpperCase = item -> System.out.print(item.toUpperCase());
        Consumer<String> printLowerCase = item -> System.out.println(item.toLowerCase());

        // Chaining The Consumers
        list1.forEach(print.andThen(printUpperCase).andThen(print).andThen(printLowerCase));
    }
}
