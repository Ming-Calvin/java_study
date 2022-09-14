package day13.exer3;

public class CircleTest {
  public static void main(String[] args) {
    Circle circle1 = new Circle(2.3);
    Circle circle2 = new Circle(2.3, "white", 20.0);
    Circle circle3 = new Circle(2.3, "red", 20.0);

    System.out.println(circle1.getColor().equals(circle2.getColor()));

    System.out.println(circle1.equals(circle2));

  }
}


