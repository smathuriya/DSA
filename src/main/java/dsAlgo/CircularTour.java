package dsAlgo;

public class CircularTour {
  public static void main(String args[]){
    int[] p = {87, 40, 71, 79, 2, 3, 93, 57, 81, 42, 90, 20, 30};
    int[] d = {27, 95, 96, 35, 68, 98, 18, 53, 2, 87, 66, 45, 41};
    System.out.println(tour(p, d));
  }

  static int tour(int petrol[], int distance[])
  {
/*

    for(int i=0;i<petrol.length;i++){
      System.out.println(petrol[i]+", ");
    }
    System.out.println("**********");
    for(int i=0;i<distance.length;i++){
      System.out.println(distance[i]+", ");
    }
*/


    for(int i=0;i<petrol.length;i++){
      distance[i] = petrol[i] - distance[i];
    }
    int l=0;
    int sum = 0;
    for(int i=0;i<petrol.length;i++){
      if(distance[i]>0){
        l=(i+1)% petrol.length;
        sum = distance[i];
        while (l!=i && sum >= 0){
          sum += distance[l];
          l=(l+1)% petrol.length;
          if(sum < 0)
            break;
        }
        if(l==i && sum >=0){
          return i;
        }
      }
    }
    return -1;
  }
}
