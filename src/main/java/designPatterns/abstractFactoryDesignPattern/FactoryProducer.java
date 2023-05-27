package designPatterns.abstractFactoryDesignPattern;

public class FactoryProducer {
  public AbstractFactory getFactory(String factoryType){
    switch (factoryType){
      case "silver":
        return new SilverOrnamentFactory();
      case "gold":
        return new GoldOrnamnetFactory();
      default:
        return null;
    }
  }
}
