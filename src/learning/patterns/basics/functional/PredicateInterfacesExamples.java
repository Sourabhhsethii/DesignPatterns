package learning.patterns.basics.functional;


import java.util.function.Predicate;

public class PredicateInterfacesExamples {

    /**
     * BIPREDICATE -> Evaluates -> It takes two arguments & return boolean.
     */

    // Check if "SKY" -> greater than 5 Chars.
    public static void main(String[] args) {
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        System.out.println(isLongerThan5.test("SKY"));
        System.out.println(isLongerThan5.test("I am more than 5"));

        // Combine more predicate

        Predicate<String> hasLeftBraces = s -> s.startsWith("{");
        Predicate<String> hasRightBraces = s -> s.endsWith("}");
        System.out.println(hasLeftBraces.and(hasRightBraces).test("{}"));

        Predicate<String> hasLeftAndRightBraces = hasLeftBraces.and(hasRightBraces);
        System.out.println(hasLeftAndRightBraces.test("{key:value}"));

        Predicate<String> anotherPrdicateWithNot = hasLeftBraces.negate();
        System.out.println(anotherPrdicateWithNot.test("{}"));

    }



}
