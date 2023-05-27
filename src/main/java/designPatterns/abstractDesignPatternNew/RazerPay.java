package designPatterns.abstractDesignPatternNew;

public class RazerPay implements PaymentGateway{

  @Override
  public void doPayment() {
    System.out.println("Payment by razer pay");
  }
}
