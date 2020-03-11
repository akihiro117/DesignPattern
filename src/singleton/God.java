package singleton;

/**
 * Singleton のクラス。 自身のインスタンスが一度しか生成されないようにする。
 */
class God {
  // static にすることで一度しか生成されないようにする。
  private static God god = new God();

  // private にすることで外部からのインスタンス生成を禁止する。
  private God() {
    System.out.println("神様クラスのインスタンスを生成しました。");
  }

  // static にしないと外部からインスタンスを生成できなくなってしまう。
  public static God getInstance() {
    return god;
  }
}