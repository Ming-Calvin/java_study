package day05;

/*
* 嵌套循环的使用
* 1. 嵌套循环： 将一个循环结构A声明在另一个循环结构B的循环体中，就成了嵌套循环
*
* 2.
* 外层循环：循环结构B
* 内层循环：循环结构A
*
*
* */

public class ForForTest {
	public static void main(String[] args) {
		/*
		* 输出 ******
		* 		******
		* 		******
		* 		******
		* 		******
		* 		******
		* */

			for (int j = 0; j < 6; j++) {
				for (int i = 0; i < 6; i++) {
					System.out.print('*');
				}
				System.out.print("\n");
			}

		/*									i 		j
		 * 输出 *						1			1
		 * 		 **						2			2
		 * 		 ***					3			3
		 * 		 ****					4			4
		 * 		 *****				5			5
		 * 		 ******				6			6
		 * */

		/*
		* 外层控制行数
		* 内层控制列数
		*
		* */

		for (int j = 0; j <= 6 ; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print('*');
			}
			System.out.print("\n");
		}

		for (int i = 6; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print('*');
			}
			System.out.print("\n");
		}
	}
}
