package learning.patterns.factory.abstractFactory;

public abstract class Database {

    public void setUrl() {
        System.out.println("Set Url");
    }

    public void save() {
        System.out.println("Saved in DB");
    }

    public abstract DatabaseFactory createFactory();
}
