package designPatterns.abstractDesignPatternNew;

public class DoPayment {
  public static void main(String args[]){
    generatepaymentgateway p = new generatepaymentgateway();
    PaymentGateway m = p.getGateway("");
    m.doPayment();
  }
}
