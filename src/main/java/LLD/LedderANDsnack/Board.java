package LLD.LedderANDsnack;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
  Cell[][] board;

  Board(int row, int col, int noSnack, int noLadder){
    board = new Cell[row][col];
    for (int i=0;i<row;i++){
      for (int j=0;j<col;j++){
        board[i][j] = new Cell();
      }
    }
    initilizeSnack(board, noSnack);
    initilizeLadder(board, noLadder);
  }

  private void initilizeLadder(Cell[][] board, int noLadder) {
    int count = 0;
    while (count < noLadder){
      int start = ThreadLocalRandom.current().nextInt(0, board.length* board.length);
      int end = ThreadLocalRandom.current().nextInt(0, board.length* board.length);
      if(start <= end){
        board[start/ board.length][start% board.length] = new Cell(start, end);
        count++;
      }
    }
  }

  private void initilizeSnack(Cell[][] board, int noSnack) {
    int count = 0;
    while (count < noSnack){
      int start = ThreadLocalRandom.current().nextInt(0, board.length* board.length);
      int end = ThreadLocalRandom.current().nextInt(0, board.length* board.length);
      if(start >= end){
        board[start/ board.length][start% board.length] = new Cell(start, end);
        count++;
      }
    }
  }
}
