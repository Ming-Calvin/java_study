package day12.java4;

public class Woman extends Person{
  boolean isBeauty;

  public void goShopping() {
    System.out.println("woman like shopping");
  }

  @Override
  public void eat() {
    System.out.println("woman eat less");
  }

  @Override
  public void walk() {
    System.out.println("women walk");
  }
}
