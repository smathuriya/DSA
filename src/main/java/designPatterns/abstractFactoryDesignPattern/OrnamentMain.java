package designPatterns.abstractFactoryDesignPattern;

public class OrnamentMain {
  public static void main(String args[]){
    new FactoryProducer().getFactory("gold").getOrnaments("chain").printMatel();
  }
}
