package day04;

/*if...else
*
* 1. 可以嵌套使用
* 2. 如果if...else之哟一行时，可以省略大括号
* */

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 > num2) {
			if (num3 > num1) {
				System.out.println(num2 + ' ' + num1 + ' ' +  num3);
			}
		}
	}
}
