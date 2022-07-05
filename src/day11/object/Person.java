package day11.object;

public class Person {
  String name;
  private int age;

  public Person() {}

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void eat() {
    System.out.println("eat");
  }

  public void sleep() {
    System.out.println("sleep");
  }

  public void show() {
    System.out.println("name" + name + ",age" + age);
  }
}
