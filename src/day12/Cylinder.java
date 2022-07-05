package day12;

public class Cylinder extends Circle {
  private double height;

  public Cylinder() {
    height = 1.0;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double findVolume() {
//    return Math.PI * getRadius() * getRadius() * height;
      return findArea() * height;
  }

  @Override
  // 返回圆柱表面积
  public double findArea() {
    return Math.PI * getRadius() * 2 + 2 * Math.PI * getRadius() * getRadius();
  }
}
