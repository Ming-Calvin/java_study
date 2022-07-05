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

  // 重写
  public void eat() {
    System.out.println("Student eat");
  }

  // 不是重写，相当于一个新的方法
  public void show() {
    System.out.println("student show");
  }

  public String info() {
    return null;
  }

  @Override
  public void walk(int distance) {
    super.walk(distance);
  }
}
