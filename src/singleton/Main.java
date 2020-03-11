package singleton;

/**
 * Singleton パターンを実装したクラスを利用する。
 */
class Main {
  public static void main(String[] args) {
    System.out.println("処理を開始します。");

    God god1 = God.getInstance();
    God god2 = God.getInstance();

    if (god1 == god2) {
      System.out.println("god1 と god2 は同じインスタンスです。");
    } else {
      System.out.println("god1 と god2 は異なるインスタンスです。");
    }

    System.out.println("処理を終了します。");
  }
}