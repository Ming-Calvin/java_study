package day03;

/*
* 位运算符
*	21 二进制:   0 0 0 1		0 1 0 1
* <<2 : 0 0 | 0 1 0 1 	0 1 [0 0]		= 84 = 21 * 2 ^ 2
* ... ...
* <<n :  21 * 2 ^ n
*
* 1. 位运算符操作的是整型的数据
* 2. << 在一定范围内，每向左移1位，相当于 * 2
* 3. >> 在一定范围内，每向右移1位，相当于 / 2
*
* >> 最高位如果是1，则补1，否则补0
* >>> 最高位只补 0
*
* 最高效 2 * 8 ： 2 << 3 或 8 << 1
*
* */

public class BitTest {
	public static void main(String[] args) {
		int i = 21;

		System.out.println(i << 2);	// 84
		System.out.println(i << 3); // 168
		System.out.println(i << 26); // 1409286144
		System.out.println(i << 27); // -1476395008


		int m = 12;
		int n = 5;
		System.out.println(m & n);	// 4
		System.out.println(m | n);	// 13
		System.out.println(m ^ n);	// 9

		/*
		* &
		* 0 0 0 0		1 1 0 0
		* 0 0 0 0		0 1 0 1
		* 0 0 0 0 	0 1 0 0		// 4
		*
		* |
		* 0 0 0 0		1 1 0 0
		* 0 0 0 0		0 1 0 1
		* 0 0 0 0   1 1 0 1 	// 13
		*
		* ^ 异或 相同为0，不同为1
		* 0 0 0 0		1 1 0 0
		* 0 0 0 0		0 1 0 1
		* 0 0 0 0   1 0 0 1		// 9
		*
		* ~ 算补码
		* 0 0 0 0 	0 1 1 0		6
		* 1 1 1 1		1 0 0 1  -6 = -7 + 1
		* 答案为 -7
		*
		* */

		// 交换两个变量的值
		int num1 = 10;
		int num2 = 20;

		// 方法1：定义临时变量的值
		// int temp = num2;
		// num2 = num1;
		// num1 = temp;

		// 方法2: 好处：不用定义临时变量
		//       弊端： 可能超过存储范围；有局限性
		// num1 = num1 + num2;
		// num2 = num1 - num2;
		// num1 = num1 - num2;


		// 方法3：使用位运算符
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;


		System.out.println(num1);
		System.out.println(num2);



	}
}
