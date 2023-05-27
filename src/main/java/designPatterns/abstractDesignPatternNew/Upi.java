package designPatterns.abstractDesignPatternNew;

public class Upi implements PaymentGateway{

  @Override
  public void doPayment() {
    System.out.println("payment by UPI");
  }
}
