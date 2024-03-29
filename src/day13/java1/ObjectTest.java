package day13.java1;
/*
* java.lang.Object类
* 1. Object类是Java类的根父类
* 2. 如果在类的声明中未使用extends关键自指明其父类，则默认父类未java.lang.Object类
* 3. Object类中的功能（属性、方法）具有通用性
* 4. Object类只声明了一个空参的构造器
*
*
*
*
*
* */

public class ObjectTest {
  public static void main(String[] args) {
    Order order = new Order();
    System.out.println(order.getClass().getSuperclass());
  }
}

class Order {

}
