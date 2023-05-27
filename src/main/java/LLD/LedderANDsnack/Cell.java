package LLD.LedderANDsnack;

import lombok.AllArgsConstructor;

public class Cell {
  Jump jump;
  Cell(int start, int end){
    this.jump = new Jump(start, end);
  }

  Cell(){

  }
}