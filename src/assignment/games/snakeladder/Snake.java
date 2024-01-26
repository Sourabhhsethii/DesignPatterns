package assignment.games.snakeladder;

public class Snake extends BoardEntity {
    int color;
    int no;

    public Snake(int start, int end, int color, int no) {
        super(start, end);
        this.color = color;
        this.no = no;
    }

    public int getColor() {
        return color;
    }

    public int getNo() {
        return no;
    }
}
