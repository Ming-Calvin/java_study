package day10.src;


public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle(1.0,2.0);

        t1.setBase(12.0);

        System.out.println("base" + t1.getBase());
        System.out.println("height" + t1.getHeight());
    }
}
