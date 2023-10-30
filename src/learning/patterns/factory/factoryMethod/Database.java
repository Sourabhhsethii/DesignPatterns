package learning.patterns.factory.factoryMethod;

/**
 * createQuery is responsible for creating object of associated classes.
 */
public interface Database {
    void connection();

    /**
     * Factory Method
     */
    Query createQuery();
}
