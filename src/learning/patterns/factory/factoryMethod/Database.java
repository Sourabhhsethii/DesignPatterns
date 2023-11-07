package learning.patterns.factory.factoryMethod;

public abstract class Database {
    public void setUrl() {
        System.out.println("Set Url");
    }

    public void save() {
        System.out.println("Saved in DB");
    }


}
