package designPatterns.liskovSubstitution;

import java.util.ArrayList;
import java.util.List;

public interface Vehicle {
  public List<String> musicCompanys();
}

class Car implements Vehicle{

  @Override
  public List<String> musicCompanys() {
    List<String> list = new ArrayList<>();
    list.add("Boos");
    list.add("JBL");
    return list;
  }
}

class Cycle implements Vehicle{

  @Override
  public List<String> musicCompanys() {
    return null;
  }
}

class Test{
  public static void main(String args[]) {
    Vehicle v1 = new Car();
    Vehicle v2 = new Cycle();
    System.out.println(v1.musicCompanys().toArray().toString());
    System.out.println(v2.musicCompanys().toArray().toString());
  }
}
