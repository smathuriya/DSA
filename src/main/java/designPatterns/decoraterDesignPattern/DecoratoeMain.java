package designPatterns.decoraterDesignPattern;

interface Rocket {
  public void fly();
}

class DiwaliRocket implements Rocket{

  @Override
  public void fly() {
    System.out.println("Diwali Rocket fly");
  }
}

class SpaceRocket implements Rocket{

  @Override
  public void fly() {
    System.out.println("Space rocket fly");
  }
}

abstract class AnstractRocket implements Rocket{
  Rocket rocket;
  AnstractRocket(Rocket rocket){
    this.rocket = rocket;
  }
  @Override
  public void fly() {
    rocket.fly();
  }
}

class DecoraterClass extends AnstractRocket{
  String color;
  DecoraterClass(Rocket rocket, String color) {
    super(rocket);
    this.color = color;
  }
  public void fly(){
    rocket.fly();
    System.out.println(color);
  }
}

public class DecoratoeMain{
  public static void main(String args[]){
    Rocket redRocket = new DecoraterClass(new DiwaliRocket(), "Red");
    Rocket greenRocket = new DecoraterClass(new SpaceRocket(), "Green");
    Rocket rocket = new DiwaliRocket();
    redRocket.fly();
    greenRocket.fly();
    rocket.fly();
  }
}