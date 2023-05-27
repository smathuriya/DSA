package designPatterns.abstractFactoryDesignPattern;

public class GoldOrnamnetFactory extends AbstractFactory{
  @Override
  public Ornaments getOrnaments(String type) {
    switch (type){
      case "chain":
        return new GoldChain();
      default:
        return null;
    }
  }
}
