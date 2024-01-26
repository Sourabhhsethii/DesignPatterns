package assignment.games.snakeladder;

public abstract class BoardEntity {
    int Start;
    int end;

    public BoardEntity(int start, int end) {
        Start = start;
        this.end = end;
    }

    public int getStart() {
        return Start;
    }

    public void setStart(int start) {
        Start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
