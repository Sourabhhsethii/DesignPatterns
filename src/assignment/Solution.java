package assignment;

import java.util.ArrayList;

public class Solution {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int largestElement = A.get(0);
        for(int i=0;i<A.size();i++) {
            if(largestElement < A.get(i)) {
                largestElement = A.get(i);
            }
        }

        int secondLargestElement = A.get(0);
        for(int i=0;i<A.size();i++) {
            if(largestElement != A.get(i)) {
                if(secondLargestElement < A.get(i)) {
                    secondLargestElement = A.get(i);
                }
            }
        }

        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            if((A.get(i )== largestElement || A.get(i)==secondLargestElement)){
                continue;
            } else {
                temp.add(A.get(i));
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(solve(a));
    }

}
