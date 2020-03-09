package factorymethod.concrete;

import factorymethod.template.FactoryTemplate;
import factorymethod.template.Product;

/**
 * factory method をもつクラスを継承するクラス。
 */
public class StudyFactory extends FactoryTemplate {

  @Override
  protected void showMessage() {
    System.out.println("インスタンスを生成します。");
  }

  @Override
  protected Product createProduct() {
    return new Study();
  }
}