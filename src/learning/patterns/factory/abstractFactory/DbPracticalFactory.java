package learning.patterns.factory.abstractFactory;

public class DbPracticalFactory {

    Database getDbObject(String dbName){
        Database db = null;

        if(dbName.equalsIgnoreCase("Mysql")){
            db = new MySqlDatabase();
        } else if (dbName.equalsIgnoreCase("Postgres")){
            db = new PostgresDatabase();
        } else if (dbName.equalsIgnoreCase("Mongo")){
            db = new MongoDatabase();
        }
        return db;
    }
}
