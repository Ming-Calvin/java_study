package day11.object;

public class Student extends Person {

  String name;
  private int age;
  String major;

  public Student() {

  }

  public Student(String name, int age, String major) {
    this.name = name;
    this.age = age;
    this.major = major;
  }


}
