package day08;

/*
*	属性 = 成员变量 = field = 域、字段
* 方法 = 成员方法 = 函数 = method
*
* 创建类的对象 = 类的实例化 = 实例化类
*
* 创建了一个类的多个对象， 每个对象都独立拥有一套类的属性（非static）
* 修改一个对象的属性，不影响另一个对象属性的值
*
* 对象的内存解析
* 堆、栈、方法区
* */

// 测试类
public class PersonTest {
	public static void main(String[] args) {
		// 2. 创建Person类的对象
		Person p1 = new Person();

		// 3. 调用对象的结构：属性 、 方法
		p1.name = "tom";
		p1.isMale = true;

		p1.eat();
		p1.sleep();
		p1.talk("chinese");

		Person p2 = new Person();
		System.out.println(p2.name);	// null
		System.out.println(p2.isMale); 	// false 默认值与数组一样

		// 把p1对象的地址赋值给p3
		Person p3 = p1;
		System.out.println(p3.name);	// tom

		// 相当于修改p1
		p3.age = 10;
		System.out.println(p1.age); // 10
	}
}

// 1. 设计类、设计类的成员
class Person {
	// 属性
	String name;
	int age = 1;
	boolean isMale;


	// 方法
	public void eat() {
		System.out.println("eat");
	}

	public void sleep() {
		System.out.println("sleep");
	}

	public void talk (String language) {
		System.out.println(language);
	}



}