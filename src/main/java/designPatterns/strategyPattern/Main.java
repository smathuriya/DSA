package designPatterns.strategyPattern;

public class Main {
  public static void main(String args[]){
    Vehicle v = new PassengerVehicle();
    v.drive();
  }
}
