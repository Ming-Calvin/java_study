package day13.java;

/*
* 多态
*
* 一个事物的多种形态
*
 * 3. 多态的使用：虚拟方法调用
 *   有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
 *   总结：编译，看左边；运行，看右边。
 *
 * 4.多态性的使用前提：  ① 类的继承关系  ② 方法的重写
*
* 5. 对象的多态性，只适用于方法，不适用于属性（编译和运行都看）
*
* 多态性是运行时行为，只有在运行时才知道调用的是哪个类
* */

import day13.java.Man;
import day13.java.Person;
import day13.java.Woman;

public class PersonTest {
  public static void main(String[] args) {

    Person p1 = new Person();
    p1.eat();

    Man man = new Man();
    man.eat();
    man.age = 25;
    man.earnMoney();



    // 何为多态性  子类的对象赋给父类的引用
    // 对象的多态性   父类的引用指向子类的对象
    // 对象       子类
    Person p2 = new Man();
    Person p3 = new Woman();
    // 编译的时候看左边声明的类型
    // 执行的时候看右边，相当于子类重写了父类的方法

    System.out.println("***********");
    //多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法 ---虚拟方法调用
    p2.eat();
    p2.walk();



//    System.out.println(p2.id);

    System.out.println("*****************************");

    // 不能调用子类特有的方法，p2是Person类型
    //  p2.earMoney();

    // 不能调用子类的属性
//    p2.name = "asf";
//    p2.isSmoking = false;

    // 有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法，由于声明未父类类型，导致编译时只能调用父类声明的属性和方法，子类持有的属性不能调用

    // 如何调用子类特有的的方法
    // 使用强制类型转换符；向下转型
    Man m1 = (Man)p2;

    // 父类 -> 子类 向下转型，需要使用强转符`()`
    // 子类 -> 父类 向上转型，可以直接转换

    m1.earnMoney();
    m1.isSmoking = false;

    // 使用强转时，可能出现ClassCastException异常
    // Woman w1 = (Woman)p2;
    // w1.goShopping();

    // instanceof 关键词使用
    // a instanceof A 判断对象a是不是A的示例，是 - true；否 - false

    // 为了避免向下转型时出现异常，我们在向下转型签先进行instanceof的判断，一旦返回true则进行向下转型，如果是false，不进行

    // 如果a instanceof A 返回True，instanceof B也返回true，则B是A的父类
    if (p2 instanceof Woman) {
      Woman w1 = (Woman)p2;
      w1.goShopping();
      System.out.println("Women*****************");
    }

    if (p2 instanceof Man) {
      Man m2 = (Man)p2;
      m2.earnMoney();
      System.out.println("man*****************");
    }

    // 练习：
    // 问题1：编译通过，运行时不通过
//    Person p33 = new Woman();
//    Man m3 = (Man)p33;

//    Person p4 = new Person();
//    Man m4 = (Man)p4;

    // 问题2：编译通过，运行时通过
    Object obj = new Woman();
    Person p = (Person)obj;

    // 问题3： 编译不通过，运行时不通过
    // Man m5 = new Woman();
  }


}
