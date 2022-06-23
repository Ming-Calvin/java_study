package day03;

/*
* 运算符之二： 赋值运算符
* = += -= *= /= %=
*
* */

public class SetValueText {
	public static void main(String[] args) {
		// 赋值符号 =
		int i1 = 10;
		int j1 = 10;

		int i2, j2;
		// 连续赋值
		i2 = j2 = 10;

		int i3 = 10,
				j3 = 20;

		// ********
		int num1 = 10;
		num1 += 2;
		System.out.println(num1); // 12

		int num2 = 13;
		num2 %= 5;
		System.out.println(num2); // 2

		short s1 = 10;
		s1 += 2; // 结论：不会改变变量本身的数据类型
		System.out.println(s1);

		// 开发中，如果希望变量实现+2的操作，有几种方法
		int num = 10;

		// 1. num = num + 2
		// 2. num += 2

		// 开发中，如果希望变量实现+2的操作，有几种方法
		// 1. num = num + 1
		// 2. num += 1
		// 3. num++	（推荐）

		// 练习1
		int i = 1;
		i *= 0.1;	// 计算结果为0.1 由于赋值运算符不会改变数据本身类型，所以结果为int型，取整后得到 0
		System.out.println(i); // 0
		i++;
		System.out.println(i); // 1

		// 练习2
		int m = 2;
		int n = 3;
		n *= m++; // n = n * m++
		// m++ 的结果是 2 ，但是此时m的值是 3

		System.out.println(m);	// 3
		System.out.println(n);	// 6

		int x = 10;
		x += (x++) + (++x);
		// x = x + (x++) + (++x)
		// (x++) = 10 ; x = 11
		// ++x = 12; x = 13
		// x = 10 + 10 + 12 = 32
		System.out.println(x);

		// 比较运算符

	}
}
