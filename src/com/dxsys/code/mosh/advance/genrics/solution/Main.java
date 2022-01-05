package com.dxsys.code.mosh.advance.genrics.solution;

import com.dxsys.code.mosh.advance.genrics.Utils;
import com.dxsys.code.mosh.advance.genrics.problem.User;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        // We Genrics, we achived compile  time type safety rather error at runtime.
      /*var list =  new GenricList<Integer>();
      list.add(1);
      int number = list.get(0);
        System.out.println(number);*/

       /*GenricList<Integer> numbers = new GenricList<>();
       numbers.add(1);// Boxing. Java will put the primitive value inside the box. its called boxing.
        int getNumber = numbers.get(0); // Unboxing
        System.out.println(getNumber);*/

        var user1 = new User(10);
        var user2 = new User(20);

        if(user1.compareTo(user2) < 0){
            System.out.println("user1 < user2");
        } else if(user1.compareTo(user2) == 0){
            System.out.println("equal");
        } else {
            System.out.println("user1 > user2");
        }

        var max = Utils.max(new User(40), new User(20));
        System.out.println(max);

         Utils.print("Key",2,"value", 4);
         new KeyValuePair("",1);

//         User user = new Instrcutor(10);
//         Utils.printUser(new Instrcutor(10));
//         var instrcutors = new GenricList<>();
//        // Utils.printUsers(instrcutors);

    }
}
