package day12.java4;


public class AnimalTest {

  public static void main(String[] args) {
    AnimalTest test = new AnimalTest();
    test.func(new Dog());
    test.func(new Cat());
  }

  public void func(Animal animal) {
    animal.eat();
    animal.shout();
  }
}

class Animal {

  public void eat() {
    System.out.println("eat");
  }

  public void shout() {
    System.out.println("shout");
  }

}

class Dog extends Animal {
  public void eat() {
    System.out.println("Dog eat");
  }

  public void shout() {
    System.out.println("Dog shout");
  }
}

class Cat extends Animal {
  public void eat() {
    System.out.println("Cat eat");
  }

  public void shout() {
    System.out.println("Cat shout");
  }
}

class Order {
  public void method(Object obj) {

  }
}

//class Diver {
//  public void doData(Connection conn) {
//    //
//  }
//}