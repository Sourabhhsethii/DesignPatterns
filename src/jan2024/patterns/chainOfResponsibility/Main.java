package jan2024.patterns.chainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        // authenticator -> logger -> compressor ->encrpt
        var enrpt = new Encrptor(null);
        var compressor = new Compressor(enrpt);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new Webserver(authenticator);
        server.handle(new HttpRequest("admin", "password"));
    }
}
