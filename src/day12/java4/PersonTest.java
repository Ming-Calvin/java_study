package day12.java4;

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

public class PersonTest {
  public static void main(String[] args) {

    Person p1 = new Person();
    p1.eat();

    Man man = new Man();
    man.eat();
    man.age = 25;
    man.earnMoney();


    // 对象的多态性   父类的引用指向子类的对象
    Person p2 = new Man();
    Person p3 = new Woman();

    System.out.println("***********");
    //多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法 ---虚拟方法调用
    p2.eat();
    p2.walk();

//    System.out.println(p2.id);


  }


}
