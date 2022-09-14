package day13.java2;

/*
*
* 基本数据类型的变量，具有类的特性
*
* 基本数据类型、包装类、String三者之间的转换
*
*
* */

import org.junit.Test;

public class WrapperTest {

  /*基本数据类型 --> 包装类*/
  @Test
  public void test1() {

    int num1 = 10;
    Integer in1 = new Integer(num1);

    System.out.println(in1.toString());

    Integer in2 = new Integer("123");
    System.out.println(in2.toString());


    Float f1 = new Float(12.3f);
    Float f2 = new Float(12.1f);
    System.out.println(f1);
    System.out.println(f2);

    Boolean b1 = new Boolean(true);
    Boolean b2 = new Boolean(true);

    Boolean b3 = new Boolean("true123");
    System.out.println(b3.toString());

    Order order = new Order();
    System.out.println(order.isMale); // false
    System.out.println(order.isfeMale); // null
  }


  /*包装类 --> 基本数据类型*/
  @Test
  public void test2() {
    Integer in1 = new Integer(12);

    int i1 = in1.intValue();

    System.out.println(i1 + 1);
    
    
    Float f1 = new Float(12.3);
    float f2 = f1.floatValue();
    System.out.println(f2 + 1);
  }


  /*
  * 自动装箱与开箱
  *
  * */
  @Test
  public void test3() {
    int num1 = 10;

    // 基本数据类型 --> 包装类
    method(num1);

    // 自动装箱
    int num2 = 10;
    Integer in1 = num2;

    // 自动装箱
    boolean b1 = true;
    Boolean b2 = b1;


    // 自动拆箱
    int num3 = in1;

  }

  public void method(Object obj) {
    System.out.println(obj);
  }

  /* 基本数据类型 --> String类型*/
  @Test
  public void test4() {
    /*方式1*/
    int num1 = 10;
    String str1 = num1 + "";

    // 方式2: 调用String 的 valueOf
    float f1 = 12.3f;

    String str2 = String.valueOf(f1);
    System.out.println(str2);

    Double d1 = new Double(12.4);
    String str3 = String.valueOf(d1);

    System.out.println(str3);
  }

  /*String类型 ---> 基本数据类型、包装类*/
  @Test
  public void test5() {
    String str1 = "123";

    int num2 = Integer.parseInt(str1);
    System.out.println(num2);


    String str2 = "true1";
    boolean b1 = Boolean.parseBoolean(str2);
    System.out.println(b1); // false
  }
}

class Order {
  boolean isMale;
  Boolean isfeMale;
}