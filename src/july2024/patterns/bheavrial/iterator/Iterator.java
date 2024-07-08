package july2024.patterns.bheavrial.iterator;

public interface Iterator<T> {

    void put(T t);
    T next();
    boolean hasNext();
    public void remove(T o);

}
