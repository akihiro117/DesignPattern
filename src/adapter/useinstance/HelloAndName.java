package adapter.useinstance;

/**
 * 既にあるものを新しいインターフェースに適合させるクラス。 Adapter の役割。
 */
public class HelloAndName extends Greeting {
  private Hello hello;

  public HelloAndName() {
    this.hello = new Hello();
  }

  @Override
  public void showHelloAndName(String name) {
    this.hello.showHello();
    System.out.println(name + "!");
  }
}