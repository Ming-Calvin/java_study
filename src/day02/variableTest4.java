package day02;

public class variableTest4 {
	public static void main(String[] args) {
		// 1. 编码情况
		long l = 123123;
		System.out.println(l);
		// 编译时，123123被编译器认为是int型，这个式子相当于将int赋给long，变量自动类型提升，不报错

		// 编译失败
		// long l1 = 1231231231312; 报错

		// 编译失败 一定要加f结尾，就算是默认的double也不符合变量自动提升
		// float f1 = 12.3; 报错


		// 2.编码情况2：
		byte b = 12;
		// 整型常量默认为int型
		// 浮点常量默认为double型
		// byte b1 = b + 1; 编译失败
		// float f1 = b + 12.3; 编译失败
	}
}
