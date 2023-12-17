package dec2023.patterns.abstractfactory;

public interface DatabaseFactory {
     abstract Query createQuery();
     abstract Transaction createTransaction();
}
