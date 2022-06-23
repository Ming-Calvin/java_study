package day02;

/*
	二进制： 以0b 或 00 开头
	十进制
	八进制： 以0开头
	十六进制： 0-9及A-F， 以0X或0x开头

*/


public class BinaryTest {
	public static void main(String[] args) {

		int num1 = 0b110;
		int num2 = 110;
		int num3 = 0127;
		int num4 = 0X110A;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		// 二进制
		// 正数的原码、反码、补码都相同

		// 负数的补码是其反码 + 1
		// 反码 除符号位外，其他取反
		// 计算机底层以补码储存数据

		// 一般给的负数二进制都是补码，然后由补码推出原码

		// 二 -》 八  三位算一次
		// 二 -》 十六  四位算一次
	}
}
