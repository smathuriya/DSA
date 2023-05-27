package dsAlgo;

public class PoorPigs_458 {
  public static void main(String args[]){
    System.out.println(poorPigs(1,1,1));
  }
  static public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
    if(buckets==1&&minutesToDie==1&&minutesToTest==1)
      return 0;
    int fact;
    if(minutesToTest%minutesToDie != 0){
      fact = minutesToTest/minutesToDie+1;
    }else
      fact = minutesToTest/minutesToDie;
    fact++;
    int t = fact;
    int count = 1;
    while (fact<buckets){
      fact *= t;
      count++;
    }
    return count;
  }
}
