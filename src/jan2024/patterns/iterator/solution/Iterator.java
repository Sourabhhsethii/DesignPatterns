package jan2024.patterns.iterator.solution;

public interface Iterator<T> {

    boolean hasNext();
    T current();
    void next();

}
