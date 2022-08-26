package day12.java3;

public class Student extends Person{

  String major;
  int test1;
  int test2;
  int test3;
  int test4;
  String id = "student";

  public Student() {

  }

  public Student(String major) {
    this.major = major;
  }

  public Student(String name, int age, String major) {
    super(name, age);
    this.major = major;
  }

  @Override
  public void eat() {
//    super.eat();
    System.out.println("student eat");
  }

  public void study() {
    System.out.println("student study");
    System.out.println("this");
    this.eat();
    System.out.println("super");
    super.eat();
  }

  public void show() {
//    System.out.println("name" + this.name + "age" + super.age);
    System.out.println("id = " + id);
    System.out.println("super.id = " + super.id);



  }
}




