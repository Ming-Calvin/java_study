package day12.java4;

public class Man extends Person {
  boolean isSmoking;

  public void earnMoney() {
    System.out.println("earnMoney");
  }

  @Override
  public void eat() {
    System.out.println("man eat");
  }

  @Override
  public void walk() {
    System.out.println("man walk");
  }
}
