package learning.patterns.basics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        // a green apple
        String line = "a green apple";
        Map<Character,Integer> countMap = new LinkedHashMap<>();
        for (int i = 0; i < line.length() ; i++) {
            Integer countOfChar = 0;
            for (int j = 0; j < line.length(); j++) {
                if(line.charAt(i) == line.charAt(j)){
                    countOfChar++; // O(n^2)
                }
                countMap.put(line.charAt(i),countOfChar);
            }

        }

        for (var i: countMap.entrySet()) {
            if(i.getValue() == 1){
                System.out.println(i.getKey()); // O(N)
                break;
            }
        }
    }

}
