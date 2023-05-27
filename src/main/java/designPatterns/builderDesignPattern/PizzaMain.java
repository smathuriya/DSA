package designPatterns.builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

class Pizza{
  private String base;
  private List<String> toppingList;
  Pizza(String base, List<String> toppingList){
    this.base = base;
    this.toppingList = toppingList;
  }

  public String getBase() {
    return base;
  }

  public List<String> getToppingList() {
    return toppingList;
  }

  static class PizzaBuilder implements PizzaInterface{
    private String base;
    private List<String> toppingList = new ArrayList<>();;

    @Override
    public PizzaBuilder setBase(String base) {
      this.base = base;
      return this;
    }

    @Override
    public PizzaBuilder setTopping(String tipping) {
      this.toppingList.add(tipping);
      return this;
    }

    @Override
    public Pizza getPizza() {
      if(this.base == null){
        throw new IllegalStateException("Base is null");
      }
      return new Pizza(this.base, this.toppingList);
    }
  }
}

interface PizzaInterface{
  public Pizza.PizzaBuilder setBase(String base);
  public Pizza.PizzaBuilder setTopping(String tipping);
  public Pizza getPizza();
}


public class PizzaMain {
  public static void main(String args[]){
    Pizza pizza = new Pizza.PizzaBuilder().setTopping("12").setTopping("34").getPizza();
    System.out.println(pizza.getBase());
    System.out.println(pizza.getToppingList());
  }
}
