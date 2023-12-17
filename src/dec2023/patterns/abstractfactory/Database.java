package dec2023.patterns.abstractfactory;

public abstract class Database {

    private String  connectionUrl;
    private String  driver;

    public void setUrl(String url){
        this.connectionUrl = url;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public abstract DatabaseFactory createFactory();
}
