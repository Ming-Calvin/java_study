package day12.java1;

public class Person {
  String name;
  int age;

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void eat() {
    System.out.println("eat");
  }

  public void walk(int distance) {
    System.out.println("walk" + distance);
    show();
    eat();
  }

  private void show() {
    System.out.println("show");
  }

  public Object info() {
    return null;
  }

  public double test() {
    return 12.2;
  }
}
