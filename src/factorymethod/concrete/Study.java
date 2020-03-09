package factorymethod.concrete;

import factorymethod.template.Product;

public class Study extends Product {

  Study() {

  }

  public void start() {
    System.out.println("勉強を開始します。");
  }
}