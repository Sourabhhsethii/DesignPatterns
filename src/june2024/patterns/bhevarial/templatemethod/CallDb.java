package june2024.patterns.bhevarial.templatemethod;

public class CallDb extends JdbcTemplate{
    @Override
    String connection(String connectionUrl) {
        System.out.println("connectionUrl " + connectionUrl);
        return connectionUrl;
    }

    @Override
    String driver(String driverUrl) {
        System.out.println("driverUrl " + driverUrl);
        return driverUrl;
    }

    @Override
    String query(String query) {
        System.out.println("query " + query);
        return query;
    }
}
