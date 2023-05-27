package LLD.NullObjectDesignPattern;

public class Car implements Vehicle{

  @Override
  public String printName() {
    return "car";
  }

  @Override
  public String getCountryOrigin() {
    return "India";
  }
}
