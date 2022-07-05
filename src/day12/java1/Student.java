package day12.java1;

public class Student extends Person{
  String major;

  public Student() {
  }

  public Student(String major) {
    this.major = major;
  }

  public void study() {
    System.out.println("major:" + major);
  }
}
