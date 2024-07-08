package july2024.patterns.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Constructor<SingleTon> constructor = SingleTon.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        var test =  SingleTon.getInstance();
        test.hello(1,2);
        var test2 =  SingleTon.getInstance();
        var test3 =  SingleTon.getInstance();
        var test4 =  SingleTon.getInstance();

        System.out.println(test.getA());

        System.out.println( "Test Hash Code" + test.hashCode());
        System.out.println( "Test 2 Hash Code" +test2.hashCode());
        System.out.println( "Test 3 Hash Code" +test3.hashCode());
        System.out.println( "Test 4 Hash Code" +test4.hashCode());
        var write = new ObjectOutputStream(new FileOutputStream("test.txt"));
        var read = new ObjectInputStream(new FileInputStream("test.txt"));

        try(write;read) {
            write.writeObject(test4);
            write.flush();
            var test5 = (SingleTon)read.readObject();
            System.out.println( "Test 5 Hash Code" +test5.hashCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        var test6 = test4.clone();
        System.out.println( "Test 6 Hash Code" +test6.hashCode());

        var test7 = constructor.newInstance();
        System.out.println(test7.hashCode());


    }
}
