package day05;

/*
* 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入0时程序结束
*
* 不在循环条件部分限制次数结构： for(;;) 或 while(true)
* 结束循环有几种方式：
* 方式一： 循环条件部分返回false
* 方式二： 在循环体中，执行break
* */

import java.util.Scanner;

public class ForWhileTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int positiveNumber = 0; // 记录正数
		int negativeNumber = 0; // 记录负数

			for(;;) {
//		while(true) {
			int num = scan.nextInt();

			// 判断num个数
			if (num > 0) {
				positiveNumber++;
			} else if (num < 0) {
				negativeNumber++;
			} else {
				break;
			}

		}

		System.out.println("正" + positiveNumber);
		System.out.println("负" + negativeNumber);
	}
}
