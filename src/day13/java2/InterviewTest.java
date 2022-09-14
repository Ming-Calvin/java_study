package day13.java2;

import org.junit.Test;

public class InterviewTest {

  @Test
  public void test1() {
    Object o1 = true ? new Integer(1) : new Double(2.0);
    System.out.println(o1); // 1.0
    /*发生类型提升*/
  }

  @Test
  public void test2() {
    Object o2;
    if (true)
      o2 = new Integer(1);
    else
      o2 = new Double(2.0);
    System.out.println(o2); // 1
  }

  @Test
  public void test3 () {
    Integer i = new Integer(1);
    Integer j = new Integer(1);
    System.out.println(i == j); // false

    Integer m = 1;
    Integer n = 1;
    System.out.println(m == n); // true


    /*Integer 内部定义了一个IntegerCache结构，IntegerCache中定了Interge[], 保存了-128 - 127范围内的整数，如果Integer赋值在
    * -128-127范围内时，就可以直接使用数组中的元素，就不用new,提高效率*/
    Integer x = 128;  // 相当于new了一个Integer函数
    Integer y = 128;  // 相当于new了一个Integer函数
    System.out.println(x == n); // false
  }


}
