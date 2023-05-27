package designPatterns.builderDesignPattern;

public class Bui {
  public static void main(String args[]){
    Car sportsCar = new Car.SportsCarBuilder()
        .setColor("Red")
        .setSeats(2)
        .setAirbags(true)
        .build();
    System.out.println();
  }
}
