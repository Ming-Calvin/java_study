package day03;

/*
* 比较运算符
*
* ==
* !=
* >
* <
* >=
* <=
* instanceof
*
*结果是boolean类型
*
* */

public class CompareTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;

		System.out.println(i == j);	// false
		System.out.println(i = j); // 赋值操作 结果为20

		boolean b1 = true;
		boolean b2 = false;

		System.out.println(b2 == b1); // false
		System.out.println(b2 = b1);	// 赋值 true

		

	}
}
