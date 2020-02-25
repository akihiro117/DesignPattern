package templatemethod;

/**
 * Template Method を提供するクラス。
 */
public abstract class EcShop {

  /**
   * 商品を購入する処理の流れを定義。 template method を担う。
   */
  public final void buyItem() {
    this.pay();
    this.operate();
    this.completed();
    this.showAd();
  }

  /**
   * 料金を支払う処理。
   */
  public abstract void pay();

  /**
   * 決済の処理。
   */
  public abstract void operate();

  /**
   * 購入完了後の処理。
   */
  private final void completed() {
    System.out.println("ご購入ありがとうございます。");
  }

  /**
   * 広告を表示する処理。 hook を担う。 デフォルトでは何もしない。 サブクラスで任意に実装する。
   */
  public void showAd() {

  }
}