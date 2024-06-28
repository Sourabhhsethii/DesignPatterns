package may2024.patterns.behavioral.chainofresponsibility;

public class HttpRequest {
    private String username;
    public String password;

    public HttpRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
