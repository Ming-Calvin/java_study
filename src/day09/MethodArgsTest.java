package day09;

/*
* 可变个数形参的方法
*
* 格式： 数据类型 ... 变量名
*	1. 调用可变个数形参方法是，传入的方法个数可以是 0个，1个 .... 多个
* 2. 形参的类型是一定的
* 3. 可变个数形参的方法与本类中方法名相同，形参不同的方法构成重载
* 4. 可变个数形参的方法与本类中方法名相同，形参类型也相同的方法不能共存
* 5. 可变个数形参在方法的形参中，必须放在末尾
*	6. 可变个数在方法的形参当中，最多使用一次
*
*
* */
public class MethodArgsTest {
	public static void main(String[] args) {
		MethodArgsTest test = new MethodArgsTest();
		test.show(12);
		test.show("hello");
		test.show("hello", "sadfa");
		test.show();

	}




	public void show(int i) {

	}

//	public void show(String s) {
//
//	}

	public void show(String ... strs) {
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
 	}

//  不共存
//	public void show(String[] array) {
//		System.out.println(strs);
//	}

//  报错
//	public void show(String ... strs, int i) {
//		for(int i = 0; i < strs.length; i++) {
//			System.out.println(strs[i]);
//		}
//	}




}
