package day12.java2;

public class OrderTest {
  public static void main(String[] args) {
    Order order = new Order();

    order.orderDefault = 1;
    order.orderPublic = 2;
    order.orderDefault = 3;

    order.methodDefault();
    order.methodProtected();
    order.methodPublic();

    // 同一个包中的其他类，不可以使用Order中私有的属性、方法
    // order.orderPrivate = 4;
    // order.methodDefault();

    
  }
}
