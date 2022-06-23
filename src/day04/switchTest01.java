package day04;

import java.util.Scanner;

/*
* 如果结构中的多个case结果相同，可以进行合并
*
*
* */


public class switchTest01 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);

		String word = scan.next();
		char wordChar = word.charAt(0);

		System.out.println(wordChar);

		int score = 78;

		// 学生成绩大于60分的输出‘合格’，小于60分的输出不合格
		switch ( score/10 ){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("不及格");
				break;
			case 7:
				System.out.println("及格");
				break;
		}

	}
}