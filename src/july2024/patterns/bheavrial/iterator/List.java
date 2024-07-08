package july2024.patterns.bheavrial.iterator;

public abstract class List<T> implements Iterator<T>{


    abstract public void put(T o);

    abstract public void remove(T o);

    abstract public T next();

    abstract public boolean hasNext();
}
