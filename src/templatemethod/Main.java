package templatemethod;

public class Main {
  public static void main(String[] args) {
    EcShop credit = new CreditPayment();
    EcShop cash = new CashPayment();

    credit.buyItem();
    cash.buyItem();
  }

}