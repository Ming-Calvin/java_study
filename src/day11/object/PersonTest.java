package day11.object;

/*
* 一、面向对象的特征二：继承性 why
* 1. 减少代码的冗余，提高代码通用性
* 2. 便于功能的扩展
* 3. 为之后的多态，提供了前提
*
* 二、继承的格式，class A extend B {}
* A. 子类、派生类、subclass
* B、 父类、超类、基类、superclass
*
*
* 体现： 一旦子类A继承父类B之后，子类A中就获取了父类B中声明的所有的属性和方法
* 特别的： 父类中声明的private的属性或方法，子类继承父类以后，仍然认为获取了父类中私有的结构
* 至少因为封装性的影响，使得子类不能直接调用父类的结构而已
*
* 子类继承父类以后，还可以定义声明自己特有的属性或方法，实现功能的拓展
* 子类和父类的关系，不同于子集和集合的关系
*
* extends：延展、拓展
*
* 三、java中关于继承性的规定
* 1. 一个类可以被多个子类继承
* 2. java中单继承性 -- 一个类只能用有一个父类
* 3. 子父类是一个相对的概念
* 4. 子类直接继承的父类，称为之直接父类、间接继承的父类称为间接父类
* 5. 子类继承父类以后，就获取了直接父类以及所有间接父类中声明的属性和方法
*
* 四、 1. 如果没有显示的声明一个类的父类，则此类继承于java.lang.Object类
*     2. 所有的java类，都直接或间接继承于java.lang.Object类
*     3. 意味着所有的java类都具有java.lang.Object类声明的功能
* */


public class PersonTest {
  public static void main(String[] args) {

    Person p1 = new Person();
//    p1.age = 1;
    p1.eat();

    Student s1 = new Student();
    s1.eat();
    s1.sleep();


  }
}
