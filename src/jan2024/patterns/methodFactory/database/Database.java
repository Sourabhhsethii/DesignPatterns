package jan2024.patterns.methodFactory.database;

import jan2024.patterns.methodFactory.query.Query;

public abstract class Database {
    String url;
    String connection;

    public abstract Query getQueryObject();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
}
