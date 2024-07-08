package july2024.patterns.creational.singleton;

import java.io.Serializable;
import java.util.Objects;

public class SingleTon implements Serializable, Cloneable {

    private static SingleTon singleTon = null;
    private static Object object = new Object();
    private Integer a;
    private Integer b;


    private SingleTon() {

        if(singleTon != null){
            throw new IllegalStateException("Cant create object");
        }
    }

    public static SingleTon getInstance() {
        if(singleTon == null){
            synchronized (object){
                if(singleTon == null){
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }

    void hello(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public Object readResolve(){
        return singleTon;
    }

    public SingleTon clone(){
        return singleTon;
    }
}
