package learning.patterns.basics;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[2] = 20;

        int[] number = {10,20,30,40};
        System.out.println(number.length);
        System.out.println(Arrays.toString(numbers));
    }
}
