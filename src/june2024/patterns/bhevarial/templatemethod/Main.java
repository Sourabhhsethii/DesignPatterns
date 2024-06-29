package june2024.patterns.bhevarial.templatemethod;

public class Main {
    public static void main(String[] args) {

        CallDb callDb = new CallDb();
        callDb.setConnectionUrl( "MySQL://localhost");
        callDb.setDriverUrl(" MySQL");
        callDb.setQuery(" select * from table x -> ");

        callDb.callDb();

    }
}
