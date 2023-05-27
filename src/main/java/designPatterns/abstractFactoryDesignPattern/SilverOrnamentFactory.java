package designPatterns.abstractFactoryDesignPattern;

public class SilverOrnamentFactory extends AbstractFactory{
  @Override
  public Ornaments getOrnaments(String type) {
    switch (type){
      case "chain":
        return new SilverChain();
      default:
        return null;
    }
  }
}
