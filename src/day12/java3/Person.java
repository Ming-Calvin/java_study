package day12.java3;

public class Person {
  String name;
  int age;
  String id = "person";

  public Person() {
    System.out.println("xx");
  }

  public Person(String name) {
    this.name = name;
  }

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
}
