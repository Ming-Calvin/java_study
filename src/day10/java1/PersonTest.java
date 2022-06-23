package day10.java1;

/*
* 构造器的使用
*
* constructor: 建造者
*
* 作用：
* 1. 用于创建对象
* 2. 初始化对象的属性
*
* 如果没有显式的构造器，系统默认提供一个空参的构造器
* 构造器格式： 权限修饰符 类名（形参列表） {}
* 一个类中定义的多个构造器，构成重载
* 如果定义了类的构造器之后，系统就不再提供默认空参的构造器
*
*/

public class PersonTest {
    public static void main(String[] args) {
        // 创建类的对象： new + 构造器
        Person p = new Person();

        p.eat();

        Person p1 = new Person("sdf");
        System.out.println(p1.name);
    }

}

class Person {
    // 属性
    String name;
    int age;

    // 构造器
    public Person() {
        System.out.println("Person().....");
    }

    public Person(String n) {
        name = n;
    }



    // 方法
    public void eat() {
        System.out.println("eat");
    }

    public void study() {
        System.out.println("study");
    }
}
