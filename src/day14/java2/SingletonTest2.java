package day14.java2;

/*
* 懒汉式
*
* */
public class SingletonTest2 {
  public static void main(String[] args) {
    Order order1 = Order.getInstance();
    Order order2 = Order.getInstance();

    System.out.println(order1 == order2);
  }
}

// 懒汉式
class Order {
  // 1. 私有化类的构造器
  private Order() {}

  // 2. 声明当前类的对象
  // 4. 此对象声明为static
  private static Order instance = null;

  //3. 声明public、static的返回当前对象的方法
  public static Order getInstance() {
    if (instance == null) {
      instance = new Order();
    }
    return instance;
  }
}