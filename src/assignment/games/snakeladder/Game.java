package assignment.games.snakeladder;

import jan2024.patterns.adapter.BOFA;
import jan2024.patterns.adapter.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    DiceService diceService;
    List<Player> players;
    int noOFDice;
    Board board;

    public void launchGame(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("0 -> Start the game");
        System.out.println("1 -> Exit from game");
        while (true) {
            int input = scanner.nextInt();
            switch (input) {
                case 0 :    System.out.println("Enter Number Of Player;");
                            int numberOfPlayer = scanner.nextInt();

                            for(int i = 1;i<=numberOfPlayer;i++){
                                System.out.println("Enter User Name " + i);
                                String enterUserName = scanner.nextLine();

                                Player player = new Player(enterUserName,0);
                                players.add(player);
                            }
                            System.out.println("Number Of Player " + numberOfPlayer);
                            System.out.println("Enter Number Of Dice;");
                             int numberOfDice = scanner.nextInt();
                             this.noOFDice = numberOfDice;
                            System.out.println( "Number Of Dice " + numberOfDice);

                            System.out.println("Enter Number Of Board Size;");
                            int boardSize = scanner.nextInt();
                            System.out.println("Board Size;" + boardSize);

                            System.out.println("Enter Number Of Snakes;");
                            int noOfSnakes = scanner.nextInt();
                            System.out.println("Board Snakes;" + noOfSnakes);

                            System.out.println("Enter Number Of Ladder;");
                            int noOfLadder = scanner.nextInt();
                            System.out.println("Ladder;" + noOfLadder);

                            List<BoardEntity> snake = getSnakes(boardSize,noOfSnakes);
                            List<BoardEntity> ladder = getLadders(boardSize,noOfLadder);

                            this.board = new Board(boardSize, snake, ladder);
                            while(true){
                                for (int player = 0; player<= numberOfPlayer; player++){
                                    System.out.println("press enter to roll payer : " + player);

                                     int rollNumber = rollDice(noOFDice);
                                     System.out.println(rollNumber);
                                     board
                                }
                            }

                case 1 :
                            System.out.println("Stopping");
                            return;
            }
        }
    }

    private int rollDice(int noOfDice) {
        diceService = DiceService.getInstance();
        return diceService.rollDice(noOfDice);
    }

    private List<BoardEntity> getSnakes(int boardSize, int noOfSnakes){
        int boardNumbers = boardSize * boardSize;
        for (int )
    }

    private List<BoardEntity> getLadders(int boardSize, int noOfLadder){
        int boardNumbers = boardSize * boardSize;
        for (int )
    }

}
