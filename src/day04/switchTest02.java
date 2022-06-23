package day04;

import java.util.Scanner;


/*
* 凡是可以使用switch-case的结构，都可以转换成if-else，反之，不成立
* 当分支结构时，既可以使用switch-case（表达式取值情况不太多）又可以使用if-else，优先使用switch-case
* */


// 从键盘输入2019年的month和day，判断是2019年的第几天
public class switchTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("输入month");
		int month = scan.nextInt();

		System.out.println("请输入day");
		int day = scan.nextInt();

		System.out.println("请输入year");
		int year = scan.nextInt();

		// 定义一个变量保存总天数
		int sumDay = 0;


		switch(month){
			case 12:
				sumDay += 30;
			case 11:
				sumDay += 31;
			case 10:
				sumDay += 30;
			case 9:
				sumDay += 31;
			case 8:
				sumDay += 31;
			case 7:
				sumDay += 30;
			case 6:
				sumDay += 31;
			case 5:
				sumDay += 30;
			case 4:
				sumDay += 31;
			case 3:
				// sumDay += 28;
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					sumDay += 29;
				} else {
					sumDay += 28;
				}
			case 2:
				sumDay += 31;
			case 1:
				sumDay += day;
				break;
		}

		System.out.println(sumDay);
	}
}
