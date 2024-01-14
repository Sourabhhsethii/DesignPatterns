package jan2024.patterns.abstractFactory.db;

import jan2024.patterns.abstractFactory.db.Database;
import jan2024.patterns.abstractFactory.factory.CassandraDbFactory;
import jan2024.patterns.abstractFactory.factory.DatabaseFactory;

public class CassandraDb implements Database {

    private String url;
    private String connection;
    @Override
    public void setUrl(String url) {
       this.url = url;
    }

    @Override
    public void setConnection(String connection) {
        this.connection = connection;
        System.out.println("Connection" + connection);
    }

    @Override
    public DatabaseFactory getdbFactory() {
        return new CassandraDbFactory();
    }
}
