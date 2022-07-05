package day10.java2;

/*
* this关键字的使用：
*
* this的属性和方法
*   this的理解为当前对象 或 当前正在创建的对象
*
* 在类的方法中，我们可以使用 this.属性 或 this.方法来调用当前对象的属性
* 但是通常情况下，我们都选择省略。特殊情况下，如果方法的形参和属性同名时，
* 必须使用”this.变量“的方式，表名变量是属性，而非形参。
*
*
* this调用构造器
*  1. 在类的构造器中，可以使用”this(形参列表)"方式，调用本类中指定的类的其他构造器
*  2. 构造器中不能通过”this(形参列表)"方式调用自己
*  3. 如果一个类中有n个构造器，最多有n-1个构造器中使用this(形参列表)
*  4. 构造器的调用必须得在首行，最多只能声明一个，用于调用其他的构造器
*
* */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setAge(1);
        System.out.println(p1.getAge());

        p1.eat();
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
        this.eat();
    }

    public Person(String name) {
        // 调用构造器
        this();
        this.name = name;
    }

    public Person(int age) {
        this();
        this.age = age;
    }

    public Person(String name, int age) {
        this(age);
        this.name = name;
//        this.age = age;
    }

    public void setName(String ntringame) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void eat() {
        System.out.println("eat");
        this.study();
    }

    public void study() {
        System.out.println("study");
    }
}
