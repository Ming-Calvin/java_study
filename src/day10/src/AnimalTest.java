package day10.src;

/*
* 封装与隐藏
*
* 1. 封装性：如果创建一个类的对象以后，可以通过”对象.属性“的方式，对对象的属性进行赋值，赋值的操作要收到属性的数据类型和存储类型制约。
* 除此之外，没有其他的制约条件，但是在实际问题中需要给属性赋值添加额外的限制条件，这个条件不能在属性声明体现，只能通过方法进行创建添加
* 同时需要避免用户再使用”对象.属性“进行赋值，则徐奥讲属性声明为私有的（private）
*
* 2. 封装性的体现：将类的属性私有化，使用公共的方法来获取和设置此属性的值
* a. 如上
* b. 不对外暴露私有的方法
* c. 单例模式
*
* 3. 封装性的体现：权限修饰符来配合
* a. 4种权限：从小到大  private 缺省(default) protected public
* 修饰符           类内部         同一个包        不同包的子类      同一个工程
* private           Y
* 缺省               Y              Y
* protected         Y              Y               Y
* public            Y              Y               Y                Y
*
* 4. 可以用来修饰类级类的内部结构：属性、方法、构造器、内部类
* 具体的：4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
*       修饰类只能使用缺省、public
*
*
* 总结： 提供了4种修饰符来修饰类及内部结构，体现了类的内部结构再被调用时的可见性的大小
* */

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "xxx";
//        a.legs = 4;
        a.age = 1;

        a.setLegs(6);
        a.show();

        System.out.println(a.getLegs());
    }
}

class Animal {
    String name;
    int age;
    private int legs; // 腿的个数

    public void setLegs(int l) {
        if (l >= 0 && l % 2 ==0) {
            legs = 1;
        } else {
            System.out.println("error");
        }
    }

    public int getLegs() {
        return legs;
    }

    public void eat() {
        System.out.println("eat");
    }

    public void show() {
        System.out.println("name = " + name + ",age = " + age + ",leg = " + legs);
    }
}

//class Dog{
//
//}
