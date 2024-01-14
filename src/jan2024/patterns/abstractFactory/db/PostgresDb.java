package jan2024.patterns.abstractFactory.db;

import jan2024.patterns.abstractFactory.db.Database;
import jan2024.patterns.abstractFactory.factory.DatabaseFactory;
import jan2024.patterns.abstractFactory.factory.PostgesDbFactory;

public class PostgresDb implements Database {

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
        return new PostgesDbFactory();
    }
}
