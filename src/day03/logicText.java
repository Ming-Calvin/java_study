package day03;

/*
* 逻辑运算符
*
*  & && | || ! ^
*
* 逻辑操作都是布尔型
*
* */

public class logicText {
	public static void main(String[] args) {

		// &  &&
		boolean b1 = false;
		int num1 = 10;
		if (b1 & (num1++ > 0)) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		System.out.println(num1);	// 11

		boolean b2 = false;
		int num2 = 10;
		if (b2 && (num2++ > 0)) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		System.out.println(num2); // 10

		// 相同点：1.&  &&运算结果相同
		//       2.当左边是true时，二者都会执行右边的运算
		// 不同点：当左边是是false时，&&不执行右边的运算

		// |  ||
		boolean b3 = true;
		int num3 = 10;
		if(b3 | (num3++ > 0)) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		System.out.println(num3);	// 11

		// |  ||
		boolean b4 = true;
		int num4 = 10;
		if(b4 || (num4++ > 0)) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		System.out.println(num4);// 10

		// 相同点：1.|  ||运算结果相同
		//       2.当左边是false时，二者都会执行右边的运算
		// 不同点：当左边是是true时，&&不执行右边的运算

		// 开发时推荐使用 & |


		// 异或：当两个值不同时，返回true


	}
}
