package july2024.patterns.creational;

import java.util.concurrent.locks.ReentrantLock;

public class SingleTon {

    private static SingleTon singleTon = null;
    private static Object object = new Object();
    private Integer a;
    private Integer b;


    public static void main(String[] args) {
       var test =  SingleTon.getInstance();
       test.hello(1,2);

        System.out.println(test.getA());

    }

    private SingleTon(){

    }

    public static SingleTon getInstance(){
        if(singleTon == null){
            synchronized (object){
                if(singleTon == null){
                    return new SingleTon();
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
}
