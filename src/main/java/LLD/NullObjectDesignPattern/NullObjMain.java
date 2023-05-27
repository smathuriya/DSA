package LLD.NullObjectDesignPattern;

public class NullObjMain {
  public static void main(String args[]){
    Vehicle v = VehicleFactory.getVehicleObj("cr");
    System.out.println(v.printName());
    System.out.println(v.getCountryOrigin());
  }
}
