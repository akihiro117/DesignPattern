package adapter.useextends;

/**
 * 既にあるものを新しいインターフェースに適合させるクラス。 Adapter の役割。
 */
public class HelloAndName extends Hello implements Greeting {
  @Override
  public void showHelloAndName(String name) {
    showHello();
    System.out.println(name + "!");
  }
}