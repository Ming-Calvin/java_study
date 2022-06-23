package day02;

/*
	基本数据类型
	1.数值
	1.1 整型
	byte  2^8 1字节 - 8bit （-128 - 127）
	short  2^16
	int  2^32
	long  2^64
	1.2 浮点型
	float 4字节 单精度 7位有效 范围比long还大
	double 8字节 双精度
	2. 字符型
	char 1字符 = 2字节
	3. 布尔型
	boolean

	引用数据类型
	1.类
	class
	2.接口
	interface
	3.数组
	array

	变量在类中声明的位置
	1. 成员变量
	2. 局部变量

*/

public class test1 {
	public static void main (String[] arg) {
		// 整形
		byte b1 = -12;
		byte b2 = -128;

		System.out.println(b1);
		System.out.println(b2);

		// long型变量必须以’l‘ 或者 ’L‘ 结尾
		short s1 = 128;
		int i1 = 1234;
		long l1 = 3412131231L;

		// 浮点型
		double d1 = 123.3;
		System.out.println(d1);

		// float型变量必须以’f‘ 或者 ’F‘ 结尾
		float f1 = 12.3F;
		System.out.println(f1);
		// 通常定义浮点型变量使用double


		// 字符型
		// 内部只能写一个字符
		char c1 = 'a';
		c1 = 'A';
		System.out.println(c1);

		char c2 = '1';
		char c3 = '安';
		System.out.println(c2);
		System.out.println(c3);

		// 转义字符
		char c5 = '\n'; // 换行
		c5 = '\t'; // 制表符 tab键
		System.out.println("Hello"  + c5);
		System.out.println("word");

		// Unicode
		char c6 = '\u0123';

		// 布尔
		// 两个值 true , false
		boolean bb1 = true;
		// 用于条件判断、循环结构
		System.out.println(bb1 + "\n");
	}

}
