package jan2024.patterns.templateMethod;

public class JdbcTemplate extends DbTemplate{
    @Override
    public void executeQuery() {
        System.out.println("JdbcTemplate is executing query");
    }
}
