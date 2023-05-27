package designPatterns.abstractDesignPatternNew;

public class generatepaymentgateway {
  public PaymentGateway getGateway(String pg){
    PaymentGateway p;
    switch (pg){
      case "rp":
        p = new RazerPay();
        break;
      default:
        p = new Upi();
    }
    return p;
  }
}
