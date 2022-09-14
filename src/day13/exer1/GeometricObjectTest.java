package day13.exer1;

public class GeometricObjectTest {

  public static void main(String[] args) {
    GeometricObjectTest test= new GeometricObjectTest();

    Circle c1 = new Circle(2.3, "white", 1.0);
    test.disPlayGeometricObject(c1);

    Circle c2 = new Circle(3.3, "white", 1.0);
    test.disPlayGeometricObject(c2);

    boolean isEquals = test.equalsArea(c1, c2);
    System.out.println("c1和c2面积是否相等" + isEquals);

    MyRectangle rect = new MyRectangle(2.1, 3.4, "red", 2.0);
  }

  public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
    return o1.findArea() == o2.findArea();
  }

  public void disPlayGeometricObject(GeometricObject o) {
    System.out.println("面积为" + o.findArea());
  }
}
