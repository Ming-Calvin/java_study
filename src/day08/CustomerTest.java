package day08;

/*
* 类应该具有的功能呢
* 比如： Math类： sqrt()\random()\
* 			Scanner类： nextXxx()
* 			Arrays类：sort()\binarySearch()\toString()\equals()
*
*
* */

public class CustomerTest {
}


class Customer {
	// 属性
	String name;


	// 方法
	// 无返回值 无形参
	public void eat() {
		System.out.println("aaa");
	}

	// 无返回值 有形参
	public void sleep(int hour) {
		System.out.println(hour);
	}

	// 有返回值 无形参
	public String getName() {
		return name;
	}

	// 有返回值 有形参
	public String getNation(String nation) {
		String info = "Aa" + nation;
		return info;
	}

	/*
	* 方法的声明：
	*  权限修饰符 返回值类型 方法名（形参列表） {
	* 	方法体
	* }
	*
	* 权限修饰符 默认方法的是public
	*	private、public、缺省、protected
	*
	* 返回值类型
	* 1. 有返回值
	*		1.1 如果方法有返回值，必须在方法声明时指定返回值的类型。同时方法中需要使用return关键字返回指定类型的变量\常量
	*		1.2 定义时不确定是否该有返回值？
	* 			* 题目要求
	* 			* 经验，具体问题具体分析
	*		1.3 方法名
	* 	1.4 形参列表： 方法可以声明0个， 1个，多个形参
	* 		* 格式： 数据类型1 形参1 数据类型2 形参2
	* 		* 定义方法是否需要形参： 题目要求； 经验，具体问题具体分析
	*		1.5 方法体
	*
	*
	* 2. 无返回值
	*		2.1 如果方法没有返回值，使用void来标识。通常没有返回值的方法不需要使用return。如果写，只能写return用于结束方法，return后不能声明表达式
	*
	*
	* return 关键字的使用
	*
	* 使用在方法中
	* 作用： 1. 结束方法
	* 			2. 针对于有返回值类型的方法，使用”return 数据“方法所要的数据
	* 			3. 注意： return 后不能有声明语句
	*
	* 方法的使用
	* 	方法中不可以定义方法
	*
	*
	*
	* */


}