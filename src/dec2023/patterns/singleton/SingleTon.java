package dec2023.patterns.singleton;

public class SingleTon {

    /**
     * Eager Construction
     */
    static SingleTon singleTon = new SingleTon();
    private int value = 10;

    private SingleTon() {
    }

    /**
     * Return Object Creation
     * @return
     */
    public static SingleTon getInstance() {

        if(singleTon == null) {
            /**
             * Only Sync the Critical Section!!!
             */
            synchronized (SingleTon.class){
                /**
                 * Double Checking
                 */
                if(singleTon == null) {
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
