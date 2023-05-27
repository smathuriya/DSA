package LLD.LedderANDsnack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Game {
  Player winner;
  Deque<Player> q = new LinkedList<>();
  Board board;
  Dice dice;

  public void initilizeGame(int numOdDice, int diceMin, int diceMax, int numPlayer){
    dice = new Dice(numOdDice, diceMin,diceMax);
    board = new Board(10,10,5,5);
    int count=0;
    while (count < numPlayer){
      q.addFirst(new Player(count,0));
      count++;
    }
  }

  public void start(){
    while (winner == null){
      Player currentPlayer = q.getLast();
      q.removeLast();
      System.out.println("current player"+ currentPlayer.player_id);
      System.out.println("current player position: "+ currentPlayer.position);
      int diceOut = dice.roll();
      currentPlayer.position = newPosition(currentPlayer, diceOut);
      System.out.println("current player new position: "+ currentPlayer.position);
      if(currentPlayer.position == board.board.length*board.board[0].length-1)
        winner = currentPlayer;
      q.addFirst(currentPlayer);
    }
    System.out.println("Winner is: "+winner.player_id);
  }

  private int newPosition(Player currentPlayer, int diceOut) {
    int newPosition = currentPlayer.position + diceOut;
    if(newPosition > board.board.length*board.board[0].length-1)
      return currentPlayer.position;
    return newPosition;
  }
}
