package day06;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("输入学生人数");

		int number = scanner.nextInt();

		int[] score = new int[number];

		System.out.println("输入" + number + "个学生成绩");
		for(int i = 0; i < score.length; i++) {
			score[i] = scanner.nextInt();
		}

		int maxScore = 0;

		for(int i = 0; i < score.length; i++) {
			if(maxScore < score[i]) {
				maxScore = score[i];
			}
		}

		char level;

		for(int i = 0; i < score.length; i++) {
			if(maxScore - score[i] < 10) {
				level = 'A';
			} else if (maxScore - score[i] < 20) {
				level = 'B';
			} else if (maxScore - score[i] < 30) {
				level = 'C';
			} else {
				level = 'D';
			}

			System.out.println("student\t" + i + "score\t" + level);
		}


		

	}
}
