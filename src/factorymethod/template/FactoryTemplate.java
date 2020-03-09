package factorymethod.template;

/**
 * factory method をもつクラス。
 */
public abstract class FactoryTemplate {
  public final Product getInstance() {
    showMessage();

    // インスタンス生成を new を使わずにメソッドを介して行うことになるので、
    // 依存度が低くなる。
    return createProduct();
  }

  protected abstract void showMessage();

  protected abstract Product createProduct();

}