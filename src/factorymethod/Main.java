package factorymethod;

import factorymethod.concrete.StudyFactory;
import factorymethod.template.Product;

public class Main {
  public static void main(String[] args) {
    StudyFactory studyFactory = new StudyFactory();

    Product study = studyFactory.getInstance();
    study.start();
  }
}