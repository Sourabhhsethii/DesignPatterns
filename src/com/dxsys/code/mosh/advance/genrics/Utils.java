package com.dxsys.code.mosh.advance.genrics;

import com.dxsys.code.mosh.advance.genrics.problem.User;
import com.dxsys.code.mosh.advance.genrics.solution.GenricList;

public class Utils {
    public static <T extends Comparable> T max(T first, T second){
      return    (first.compareTo(second) <0) ? second : first;
    }

    public static <K,V,M,T> void print(K key, V value, M key2, T value2){
        System.out.println(key + "=" + value + ":" + key2 +  ":" + value2);
    }

    public static void printUser(User user){
        System.out.println(user);
    }

    // class CAP#1 extends User{}
    // class Instructor extends user{}
/*    public static void printUsers
    (GenricList<? super User> users ){
        User x = users.get(0);
        users.add();
    }*/
}
