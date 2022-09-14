package day13.java1;

/*
* == 和 equals 区别
*
* == 可以使用在基本数据类型变量 和 引用类型数量 中
* 如果比较的是基本数据类型变量，比较两个变量保存的数据死否相等
* 如果是引用类型对象，比较两个地址值是否相同
*
* equals方法
* 是一个方法，而非运算符
* 适用于引用数据类型
* Object类中equals()的定义：
*    public boolean equals(Object obj) {
	        return (this == obj);
	  }
* 说明：Object类中定义的equals()和==的作用是相同的：比较两个对象的地址值是否相同.即两个引用是否指向同一个对象实体
*
*
* 像String、Date、File、包装类等都重写了Object类中的equals()方法。重写以后，比较的不是两个引用的地址是否相同，而是比较两个对象的"实体内容"是否相同。
*
*
* 通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的"实体内容"是否相同。那么，我们就需要对Object类中的equals()进行重写.重写的原则：比较两个对象的实体内容是否相同.
*
* */

public class equalsTest {
  public static void main(String[] args) {
    int i = 10;
    int j = 10;

    double d = 10.0;

    System.out.println(i == d);// true

    char c = 10;
    System.out.println(i == c);// true

    char c1 = 'A';
    char c2 = 65;
    System.out.println(c1 == c2);//true

    Customer cust1 = new Customer("Tom", 21);
    Customer cust2 = new Customer("Tom", 21);
    System.out.println(cust1 == cust2); // false

    String str1 = new String("a");
    String str2 = new String("a");
    System.out.println(str1 == str2); // false

    System.out.println("---------------------");
    System.out.println(cust1.equals(cust2)); // false
    System.out.println(str1.equals(str2)); // true
  }
}
