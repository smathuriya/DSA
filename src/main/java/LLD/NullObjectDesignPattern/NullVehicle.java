package LLD.NullObjectDesignPattern;

public class NullVehicle implements Vehicle{

  @Override
  public String printName() {
    return "Default name";
  }

  @Override
  public String getCountryOrigin() {
    return "default country";
  }
}
