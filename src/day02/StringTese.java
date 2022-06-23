package day02;
/*
	1. Strings属于引用数据类型，字符串
	2. 声明Srting变量时，使用一对”“
	3. String可以和8中基础类型做运算，且做的时连接运算
	4. 运算的结果仍然时String类型
*/




public class StringTese {
	public static void main(String[] args) {

		String s1 = "Hello Word!";

		System.out.println(s1);

		// 可以放任意数量
		String s2 = "a";
		String s3 = "";

		// char c = ""; 编译错误，必须放一个字符

		// ****************
		int num1 = 1001;
		String numStr = "xuehao: ";
		String info = numStr + num1; // 连接运算
		boolean b1 = true;
		String info1 = info + b1; // 连接运算
		System.out.println(info1);

		// 练习1
		char c = 'a';
		int num = 10;
		String str = "h";
		System.out.println(c + num + str); // 107h
		System.out.println(c + str + num); // ah10
		System.out.println(c + (num + str)); // a10h
		System.out.println((c + str) + num); // ah10
		System.out.println(str + num + c); // h10a

		// 练习2
		// *	*


	}
}
