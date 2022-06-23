package day08.Project02;

// 测试类
public class CircleTest {
	public static void main(String[] args) {
		Circle circle = new Circle();

		circle.radius = 3;
		double area = circle.findArea();

		System.out.println(area);

	}
}

// 圆
class Circle {
	// 属性
	double radius;

	// 求圆的面积
	public double findArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
}
