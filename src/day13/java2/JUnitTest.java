package day13.java2;

/*
* 1. 此类是公共的
* 2. 提供公共的无参构造器
*
*
* 声明单元测试方法
* 方法权限public
* 没有返回值
* 没有形参
*
* 单元测试方法上需要注解： @test，并再单元测试类中导入
* */

import org.junit.Test;

import java.util.Date;

public class JUnitTest {

  @Test
  public void testEquals() {
    String s1 = "xx";
    String s2 = "xx";
    System.out.println(s1.equals(s2));

    // ClassCastException异常
//    Object obj = new String("GG");
//    Date date = (Date)obj;

    show();
  }

  public void show() {
    System.out.println("show");
  }

  @Test
  public void testToString() {
    String s2 = "MM";
    System.out.println(s2);
  }

}
