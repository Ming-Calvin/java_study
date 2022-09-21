package day14.java2;

/*
*
* 如何实现
*
*
* 区分
* 饿汉式： 坏处：对象加载时间过长， 好处：线程安全的
* 懒汉式：好处：延迟对象的创建， 目前的写法的坏处： 线程不安全 ---> 到多线程内容时，再修改
*
*
*
* */
public class SingletonTest1 {
  public static void main(String[] args) {
    Bank bank1 = Bank.getInstance();
    Bank bank2 = Bank.getInstance();

    System.out.println(bank1 == bank2);
  }
}

// 饿汉式
class Bank {
  // 1. 要求私有化类的构造器
  private Bank() {
  }

  // 2. 内部创建类的对象
  // 4. 此对象也需要被声明为静态的
  private static Bank instance = new Bank();

  // 3.提供公共的方法，返回公共的对象
  public static Bank getInstance() {
    return instance;
  }



}