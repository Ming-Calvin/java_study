package day02;

/*
	讨论7中基本类型 不包括boolean

	基本数据类型之间的运算
	1. 自动类型提升
	byte、char、short ---> int ---> long ---> float ---> double

	当byte、char、short三种变量做运算时，结果为int类型

	容量小的和容量大的做运算时，自动提升成容量大的数据类型
	容量大小指的是表示数的范围



	2. 强制类型转换
*/
public class test2 {
	public static void main(String []args) {
		byte b1 = 2;
		int i1 = 12;
		int i2 = b1 + i1;

		long l1 = b1 + i1;
		System.out.println(i2);
		System.out.println(l1);

		float f1 = b1 + i1;
		System.out.println(f1);

		char c1 = 'a';
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println(i4);

		short s2 = 10;

		byte b2 = 10;

		// 都不通过
		// short c3 = s2 + b2;
		// byte b3 = b1 + b2;
		// short s3 = s2 + c1

		// System.out.println(c3);



	}
}
