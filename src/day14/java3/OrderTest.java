package day14.java3;

/*
* 1. 默认初始化
* 2. 显示初始化
* 3. 构造器中初始化
* 4. 有了对象以后，可以通过"对象.属性" 或 "对象.方法"的方式，进行赋值
* 5. 在代码块中赋值
*
* "显式"的英文单词是explict，意思是“明确的”“隐式"的英文单词是implicit,意思是"不言而明的”。
* 简单来说，“显式”是指你需要明确的写代码，“隐式”是指隐含的默认的。
*
* 1 - 2/5 - 3 - 4
* */

import com.sun.org.apache.xpath.internal.operations.Or;

public class OrderTest {
  public static void main(String[] args) {
    Order order = new Order();

    System.out.println(order.orderId);
  }
}

class Order {
  {
    orderId = 4;
  }

  int orderId = 3;
}