package adapter.useinstance;

/**
 * 作成したクラスを使用するクラス。Client の役割。
 */
public class Main {
  public static void main(String[] args) {
    Greeting greeting = new HelloAndName();
    greeting.showHelloAndName("Taro");
  }
}