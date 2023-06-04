package designPatterns.strategyPattern;

public interface Drive {
  public void drive();
}

class Normal implements Drive{

  @Override
  public void drive() {
    System.out.println("Normal drive");
  }
}

class Special implements Drive{

  @Override
  public void drive() {
    System.out.println("Special drive");
  }
}

abstract class Vehicle{
  Drive driveObj;
  public Vehicle(Drive drive){
    this.driveObj = drive;
  }

  public void drive(){
    driveObj.drive();
  }
}

class PassengerVehicle extends Vehicle{
  public PassengerVehicle() {
    super(new Normal());
  }
}

class OffroadVehicle extends Vehicle{
  public OffroadVehicle() {
    super(new Special());
  }
}

