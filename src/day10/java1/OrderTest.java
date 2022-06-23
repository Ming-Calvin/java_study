package day10.java1;

import day10.src.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        // 出了Order类所属的包之后，默认的结构就不可以调用了
//        order.orderDefault = 1;
        order.orderPublic = 2;
        // 出了Order类后，私有的结构就不可以调用了
//        order.orderPrivate = 3;

//        order.methodDefault();
        order.methodPublic();
//        order.methodPrivate();

    }
}