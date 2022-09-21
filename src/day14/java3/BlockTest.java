package day14.java3;

/*
* 代码块（初始化块）
*
* 1. 作用： 通常用于初始化类、对象
* 2. 代码块如果有修饰的化，只能用static
* 3. 分类： 静态代码块 vs 非静态代码块
*
* 4. 静态代码块
*   内部可以有输出语句
*   随着类的加载而执行, 只执行一次
*   作用： 初始化类的信息
*   如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
*   静态代码块的执行，优先于非静态代码块的执行
*   静态代码块内只能调用静态的属性、静态的方法，不能调用非静态结构
*
* 5. 非静态代码块
*   内部可以有输出语句
*   随着对象的创建而执行,
*   每创建一个对象，就执行一次非静态代码块
*   作用： 可以在创建对象时，队对象的属性进行初始化
*   非静态代码块可以调用静态的属性、静态的方法或非静态的属性、非静态的方法
*
*
* 对属性赋值的位置：
* 1. 默认初始化
* 2. 显式初始化
* 3. 构造器中初始化
* 4. 有了对象以后，通告“对象.属性” “对象.方法”的方式，进行赋值
* 5. 在代码块中赋值
*
* */

public class BlockTest {
  public static void main(String[] args) {
    String desc = Person.desc;
    System.out.println(desc);

    Person p1 = new Person();
    Person p2 = new Person();
    System.out.println(p1.age);

    Person.info();
  }
}

class Person {
  // 属性
  String name;
  int age;
  static String  desc = "desc";


  // 构造器
  public Person() {

  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // 静态代码块
  static {
    System.out.println("hello, static block");
    desc = "desc xx -2";
  }

  // 静态代码块
  static {
    System.out.println("hello, static block");
    desc = "desc xx -1";
    info();
  }

  // 非静态代码块
  {
    age = 1;
    System.out.println("hello block - 2");
  }

  // 非静态代码块
  {
    age = 1;
    System.out.println("hello block - 1");
    info();
    eat();
  }

  // 方法
  public void eat() {
    System.out.println("eat");
  }

  public static void info() {
    System.out.println("快乐的人");
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}