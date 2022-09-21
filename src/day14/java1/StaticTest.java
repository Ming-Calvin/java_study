package day14.java1;

/*
* static关键字的使用
*
* 1. static： 静态的
* 2. static可以用来修饰： 属性、方法、代码块、内部类
*
* 3. 使用static来修改属性：静态变量
*   属性： 按是否使用static修饰分为 静态属性 vs 非静态属性
*   实例变量，我们创建了类的多个对象，每个对象都独立的拥有一套类种的非静态属性，当修改其中一个对象
*           非静态属性时，不会导致对象中的同样的属性值的修改
*
*   静态变量（类变量）： 创建了类的多个对象，多个变量共享一个静态变量，当通过一个对象修改静态变量时，会导致其他对象调用
*             静态变量时，其他对象调用此静态变量时，是修改过的
*
*   3.2 static修饰属性的其他说明：
*     1. 静态变量随着类的加载而加载， （实例对象是随着类的创建而加载的），可以通过使用 类.静态对象 的方式进行调用
*     2. 静态变量的加载要早于对象的创建
*     3. 由于类只会加载一次，则静态变量在内存中也只会存在一份，存在方法区的静态域中
*     4.   类/静态变量  实例变量
*     类     yes      no
*     对象   yes      yes
*   3.3 静态属性举例： System.out; Math.PI;
*
* 4. 使用static来修改方法：静态方法
*     4.1 随着类的加载而加载， 可以通告“类.静态方法” 进行调用
*     4.2.    静态方法 实例变方法
 *     类     yes      no
 *     对象   yes      yes
 *    4.3 静态方法中，只能调用静态的方法或属性
 *        非静态方法中，既可以调用非静态的方法调用，也可以调用静态的方法属性
*
*  5. static注意点：
*   5.1 在静态的方法内，不能使用this关键字、super关键字
*   5.2 关于静态属性和静态方法，从生命周期考虑
*
*  6. 在开发中，如何确定一个属性是否要声明为static
*   属性可以被多个对象共享的，不会随对象的不同而不同
*   类中的常量也常常声明为static
*
*  在开发中，如何确定一个方法是否要声明为static
*   操作静态属性的方法，通常设置为static
*   工具类中的方法，习惯上声明为static，比如Math，Array，Collections
* */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StaticTest {
  public static void main(String[] args) {
    Chinese c1 = new Chinese();
    c1.name = "小明";
    c1.age = 40;
    c1.nation = "中国";

    Chinese c2 = new Chinese();
    c2.name = "小红";
    c2.age = 30;

    System.out.println(c2.nation);

    c1.eat();

    Chinese.show();
  }
}

class Chinese {
  String name;
  int age;
  static String nation;

  public void eat() {
    System.out.println("eat");
    this.info();
    System.out.println("name" + name);
    // 调用静态结构
    System.out.println("nation" + nation);
  }

  public static void show() {
    System.out.println("static");
//  eat();
//  name = "TOM";
    System.out.println();
  }

  public void info() {
    System.out.println("name" + name + "age" + age);
  }
}
