package designPatterns.factoryDesignPattern;

public class ShapeFactory {

  Shape getShape(String shapeName){
    Shape shape;
    switch (shapeName){
      case "circle":
        shape = new Circle();
        break;
      case "squre":
        shape = new Squre();
        break;
      default:
        shape = null;
    }
    return shape;
  }
}
