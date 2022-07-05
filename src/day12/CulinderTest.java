package day12;

public class CulinderTest {
  public static void main(String[] args) {
    Cylinder cy = new Cylinder();

    cy.setRadius(2.1);
    cy.setHeight(3.4);
    double volume = cy.findVolume();
    System.out.println(volume);

    double area = cy.findArea();
    System.out.println(area);

  }
}
