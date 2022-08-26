package day13.exer1;

public class GeometricObjectTest {

  public static void main(String[] args) {
    GeometricObjectTest test= new GeometricObjectTest();


  }

  public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
    return o1.findArea() == o2.findArea();
  }

  public void disPlay(GeometricObject o) {
    System.out.println("面积为" + o.findArea());
  }
}
