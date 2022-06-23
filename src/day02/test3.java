package day02;

/*
	强制类型转换： 自动类型提升运算的逆运算
	1. 需要使用强转符： ()
	2. 强制转换可能会导致精度损失

*/

public class test3 {
	public static void main(String []args) {
		// 精度损失1
		double d1 = 12.3;
		int i1 = (int)d1;
		System.out.println(i1);	// 12 截断，损失精度

		// 没有精度损失
		long l1 = 123;
		short s2 = (short)l1;

		// 精度损失2
		int i2 = 128;
		byte b1 = (byte)i2;
		System.out.println(b1); // -128


	}
}
