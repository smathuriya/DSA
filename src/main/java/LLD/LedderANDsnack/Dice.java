package LLD.LedderANDsnack;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
  int noOfDice;
  int min;
  int max;
  Dice(int noOfDice,int min, int max){
    this.noOfDice = noOfDice;
    this.max = max;
    this.min = min;
  }
  int roll(){
    int sum=0;
    int count=0;
    while (count<noOfDice) {
      int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
      sum += randomNum;
      count++;
    }
    return sum;
  }
}
