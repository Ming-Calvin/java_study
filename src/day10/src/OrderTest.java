package day10.src;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderPublic = 2;
        // 出了Order类后，私有的结构就不可以调用了
//        order.orderPrivate = 3;

        order.methodDefault();
        order.methodPublic();
//        order.methodPrivate();

    }
}
