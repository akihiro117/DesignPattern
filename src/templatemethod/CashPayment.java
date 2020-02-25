package templatemethod;

/**
 * Template Method を提供する抽象クラスを継承して、抽象メソッドを実装するクラス。
 */
public class CashPayment extends EcShop {

  @Override
  public void pay() {
    System.out.println("現金で支払います。");
  }

  @Override
  public void operate() {
    System.out.println("現金の支払い処理を行います。");
  }

  @Override
  public void showAd() {
    System.out.println("次回からキャッシュレスで支払いませんか？");
  }
}