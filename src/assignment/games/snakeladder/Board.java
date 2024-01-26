package assignment.games.snakeladder;

import java.util.HashMap;
import java.util.List;

public class Board {
    int Size;
    HashMap<BoardEntity,Integer> snakeOrLadder;

    public Board(int size, List<BoardEntity> snakes,List<BoardEntity> ladders ) {
        Size = size;

        for (BoardEntity snake: snakes)
        snakeOrLadder.put(snake,snake.Start);

        for (BoardEntity ladder: ladders)
            snakeOrLadder.put(ladder,ladder.Start);
    }

    public Board makeMove(){
        return this;
    }
}
