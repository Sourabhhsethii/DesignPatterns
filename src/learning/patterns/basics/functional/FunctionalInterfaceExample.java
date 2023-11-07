package learning.patterns.basics.functional;

import java.util.function.Function;

public class FunctionalInterfaceExample {
    /**
     * Functional Interface with only one method Return R apply(Take T) -> Map operations
     */

    public static void main(String[] args) {
        Function<String,Integer> map = s -> Integer.valueOf(s);
        System.out.println(map.apply("1"));
        // Two Transformations
        // first: "key=value"
        // second: "{key:value}"
        Function<String,String> replaceColon = str -> str.replace(":","=");
        Function<String, String> addBraces = str -> "{" + str  +"}";
        // Declarative Programing, we have small function used to build something complex.
        var result = replaceColon
                .andThen(addBraces)
                .apply("key:value");
        System.out.println(result);

        //Compose than second function first...// Composing the function in reverse order.
        System.out.println(addBraces.compose(replaceColon).apply("key:test"));
    }
}
