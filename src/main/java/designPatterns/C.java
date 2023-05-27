package designPatterns;

interface A{
  public void getArea();
}

interface B{
  public void getArea();
  public void getVolum();
}

public class C implements A,B{

  @Override
  public void getArea() {
    System.out.println("Yes");
  }

  @Override
  public void getVolum() {

  }
}

class Ma{
  public static void main(String args[]){
    A a = new C();
    a.getArea();
  }
}
