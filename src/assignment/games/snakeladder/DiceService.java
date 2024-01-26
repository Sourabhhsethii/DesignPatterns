package assignment.games.snakeladder;

import java.util.Random;

public class DiceService {

    private static DiceService diceService;
    private static final int diceFaceNumber  = 6;
    static Object monitor = new Object();
    private DiceService(){}

    public int rollDice(int noOfDice) {
        int number = noOfDice * diceFaceNumber;
        Random random = new Random();
        return random.nextInt(number);
    }

    public static DiceService getInstance(){

        if(diceService == null){
            synchronized (monitor) {
                if(diceService == null){
                    diceService = new DiceService();
                }
            }
        }
        return diceService;
    }
}
