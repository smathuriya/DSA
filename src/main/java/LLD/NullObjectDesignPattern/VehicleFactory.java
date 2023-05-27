package LLD.NullObjectDesignPattern;

public class VehicleFactory {

  public static Vehicle getVehicleObj(String name){
    switch (name){
      case "car":
        return new Car();
      default:
        return new NullVehicle();
    }
  }
}
