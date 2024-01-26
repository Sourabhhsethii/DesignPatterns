package assignment.games.snakeladder;

public class Player {

    String userName;
    int position;

    public Player(String userName, int position) {
        this.userName = userName;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getUserName() {
        return userName;
    }
}
