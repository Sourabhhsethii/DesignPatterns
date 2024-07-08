package july2024.patterns.bheavrial.iterator;

public class Arrays<T> implements Iterator<T>{

    Object[] arr = new Object[10];
    int size = 0;
    int index = 0;
    @Override
    public void put(T t) {
            arr[size] = t;
            size++;
    }

    @Override
    public T next() {
        int temp = index;
        index++;
        return (T)arr[temp];
    }

    @Override
    public boolean hasNext() {
        return (index == (arr.length))? false : true;
    }

    @Override
    public void remove(T o) {
        if(arr.length >=0  && contains(o)) {
            Integer index = index(o);
            if (index != -1) {
                arr[index] = null;
                size--;
            }
        }
    }

    public boolean contains(T t) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == t){
                return true;
            }
        }
        return false;
    }

    public Integer index(T t) {
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == t){
                return i;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Arrays{" +
                "arr=" + java.util.Arrays.toString(arr) +
                ", size=" + size +
                ", index=" + index +
                '}';
    }
}
