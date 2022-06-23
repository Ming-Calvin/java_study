package day03;

/*
* 运算符一： 算术运算符
* +正 —负 +加 -减 *乘 /除 %取模  前++ 后++ 前-- 后-- +连接运算符
*
* */

public class AriTest {
	public static void main(String[] args) {


		// 除： /
		int num1 = 12;
		int num2 = 5;
		int result1 = num1 / num2 ; //2
		System.out.println(result1);

		int result2 = num1 / num2 * num2;
		System.out.println(result2); //10

		// num1 / num2 是int型为2
		double result3 = num1 / num2;
		System.out.println(result3);  // 2.0

		double result4 = num1 / num2 + 0.0; // 2.0
		double result5 = num1 / (num2 + 0.0); // 2.4

		System.out.println(result5);  // 2.4

		double result6 = (double)num1 / num2; // 2.4
		System.out.println(result6);

		// 取模：%
		// 结果的符号与被模数的符号相同
		// 开发中，经常使用取模符号来判断是否能除尽

		int m1 = 12;
		int n1 = 5;
		System.out.println(m1 % n1); // 2

		int m2 = -12;
		int n2 = 5;
		System.out.println(m2 % n2); // -2

		int m3 = 12;
		int n3 = -5;
		System.out.println(m3 % n3); // 2

		int m4 = -12;
		int n4 = -5;
		System.out.println(m4 % n4); // -2

		// 前++ : 先 +1 ，后赋值
		// 后++ : 先赋值，后 +1
		int a1 = 10;
		int b1 = ++a1;

		int a2 = 10;
		int b2 = a2++;
		System.out.println(b1); // 11
		System.out.println(b2); // 10

		// 注意：
		short s1 = 10;
		// s1 = s1 + 1;  编译失败
		// s1 = (short)(s1 + 1);
		s1 ++; // 自增1，不会改变变量自身的数据类型
		System.out.println(s1);

		// 问题
		byte bb1 = 127;
		bb1 ++;
		System.out.println(bb1); // -128

		/*
		* 127
		* 0 1 1 1  1 1 1 1
		* ++
		* 1 0 0 0  0 0 0 0
		* -128
		* */


		// 前-- : 先 -1 ，后赋值
		// 后-- : 后赋值, 先 -1
		int a3 = 10;
		int b3 = --a3;

		int a4 = 10;
		int b4 = a4--;
		System.out.println(b3); // 9
		System.out.println(b4); // 10

	}
}
