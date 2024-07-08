package july2024.patterns.bheavrial.iterator;

public class ArrayList<T> extends List<T>{


    java.util.ArrayList list = new java.util.ArrayList();
    Integer size = 0;
    Integer index = 0;

    @Override
    public void put(T o) {
        list.add(o);
        size++;
    }

    @Override
    public void remove(T o) {
        if(list.size() >=0 && list.contains(o))
        { list.remove(o);
        size--; }
    }

    @Override
    public T next() {
        int temp =  index;
        index++;
        return (T)list.get(temp);
    }

    @Override
    public boolean hasNext() {
        return index != (list.size());
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "list=" + list +
                ", size=" + size +
                '}';
    }
}
