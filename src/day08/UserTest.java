package day08;

/*
* 类中属性的使用
*
* 属性（成员变量） VS 局部变量
* 1. 相同点
* 	定义变量的格式一样
*		先声明，后使用
* 	都有其对应的作用域
*
* 2. 不同点
* 	2.1 在类中声明的位置不同
* 	属性：直接定义在类的一堆{}内
*		局部变量： 声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
*
* 	2.2 关于权限修饰符的不同
* 	属性： 可以在声明属性是，指明其权限，使用权限修饰符
* 	常用的权限修饰符： private、public、缺省、protected
* 	目前都使用的是缺省
*
* 	局部变量： 不能使用修饰符
*
*
*		2.3 默认初始化值
* 	属性： 类的属性都有默认初始化值
*			整型（byte、short、int、long） -- 0
*			浮点型（float、double) - 0.0
* 		字符型(char)	- 0 （或 '\u0000')
* 		布尔型（boolean) - false
* 		引用数据类型（类、数组、接口） - null
*
* 	局部变量：没有初始化值
* 		使用局部变量时，一定要赋初始值
* 		形参在调用时，赋值即可
*
* 	2.4 在内存中的加载位置不同
* 	属性： 加载在堆空间中	（非static）
* 	局部变量： 加载到栈空间中
*
*
* */

public class UserTest {
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1.name);	// null
		System.out.println(u1.age);	// 0
		System.out.println(u1.isMale); // false

	}
}


class User {
	// 属性（成员变量）
	String name;
	public int age;
	boolean isMale;

	public void talk(String language) {	// 形参
		System.out.println("使用" + language);
	}

	public void eat() {
		String food = "披萨"; // 形参
	}
}