package designPatterns.adapterDesignPattern;

interface Movable {
  //https://www.baeldung.com/java-adapter-pattern
  public int getSpeed();
}

class KmSpeed implements Movable{

  @Override
  public int getSpeed() {
    return 100;
  }
}

interface MovableAdapter{
  public int getSpeed();
}

class MileSpeed implements MovableAdapter{
  Movable movable;
  MileSpeed(Movable obj){
    this.movable = obj;
  }
  @Override
  public int getSpeed() {
    return movable.getSpeed()*2;
  }
}

public class AdapterMain{
  public static void main(String args[]){
    System.out.println(new KmSpeed().getSpeed());
    System.out.println(new MileSpeed(new KmSpeed()).getSpeed());
  }
}