package designPatterns.factoryDesignPattern;

public class ShapeMain {
  public static void main(String args[]){
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape circle = shapeFactory.getShape("circle");
    if(circle != null)
      circle.printShape();
  }
}
