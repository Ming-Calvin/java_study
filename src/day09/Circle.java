package day09;

public class Circle {

    public static void main(String[] args) {
        PassObject test = new PassObject();

        Circle c = new Circle();

        test.printAreas(c ,5);
    }

    double radius;

    public double findArea() {
        return Math.PI * radius * radius;
    }
}

class PassObject {
    public void printAreas(Circle c, int time) {

        System.out.println("Radius\t\tArea");

        // 设置圆的半径
        for (int i = 0; i <= time; i++) {

            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }
    }
}
