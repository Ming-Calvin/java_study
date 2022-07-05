#### 1. 构造器的作用是什么？使用中注意的点

作用：1. 创建对象 2.初始化对象的结构

注意点： 1. 构造器没有返回值  2. 默认的构造器是无参数的 3. 构造器可以重载 4. 类中一定会有构造器



#### 2. 关于类的属性的赋值，有几种赋值的方式，谈谈赋值的先后顺序

1. 默认初始化 `int i；`
2. 显式初始化 `int i = 10`
3. 构造器中初始化
4. 通过对象方法 或 对象属性给属性赋值



#### 3. this关键字可以用来调用哪些结构，简单说明一下其使用

this: 属性 方法 构造器

this: 当前对象，正在创建的对象



#### 4. java中目前学习涉及到的四种权限修饰符有说明？说明各自范围

public 整个文件都可以用

protected 不同包的子类中可以使用

缺省 整个包都可以用

private 只在类中可以使用



#### 5. 创建Cicle类，提供私有的radius属性，提供相应的get喝set方法，提供求圆面积的方法

```java
public class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return 3.14 * radius * radius;
  }
}
```