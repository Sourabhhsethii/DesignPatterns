package jan2024.patterns.abstractFactory.db;

import jan2024.patterns.abstractFactory.factory.DatabaseFactory;

public interface Database {
    void setUrl(String url);
    void setConnection(String connection);
    DatabaseFactory getdbFactory();
}
