package learning.patterns.factory.abstractFactory;

import javax.management.Query;

/**
 * Abstract Factory Pattern is responsible for all factory methods.
 * createQuery is responsible for creating object of associated classes.
 * createTxn is responsible for create=ing object of associated classes.
 * createUpdate is responsible for create=ing object of associated classes.
 */
public interface DatabaseFactory {

    /**
     * Factory Method
     */
    void createQuery();
    void createTxn();
    void createUpdate();

}
