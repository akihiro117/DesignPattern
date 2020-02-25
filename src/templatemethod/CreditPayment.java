package templatemethod;

/**
 * Template Method を提供する抽象クラスを継承して、抽象メソッドを実装するクラス。
 */
public class CreditPayment extends EcShop {

  @Override
  public void pay() {
    System.out.println("クレジットで支払います。");
  }

  @Override
  public void operate() {
    System.out.println("クレジット決済処理を行います。");
  }

}