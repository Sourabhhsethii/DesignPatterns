package june2024.patterns.bhevarial.templatemethod;

public abstract class JdbcTemplate {

    private String connectionUrl;
    private String driverUrl;
    private String query;

    abstract String connection(String connectionUrl);
    abstract String driver(String driverUrl);
    abstract String query(String query);


    private void print(String log){
        System.out.println(log);
     }

    public void callDb() {
        driver(driverUrl);
        print("Connecting to driverUrl " + driverUrl);
        connection(connectionUrl);
        print("Connecting to connectionUrl " + connectionUrl);
        query(query);
        print("Query Completed " + query);
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public void setDriverUrl(String driverUrl) {
        this.driverUrl = driverUrl;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public static void main(String[] args) {
        System.out.println();
    }


}
