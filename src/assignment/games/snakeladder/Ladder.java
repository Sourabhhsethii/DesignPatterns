package assignment.games.snakeladder;

public class Ladder extends BoardEntity {
    int number;

    public Ladder(int start, int end, int number) {
        super(start, end);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
