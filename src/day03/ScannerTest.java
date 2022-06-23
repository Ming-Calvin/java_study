package day03;

/*
* 从键盘获取不同类型的变量：需要使用Scanner类
*
* 具体实现步骤：
* 1. 导包： import java.util.Scanner;
* 2. Scanner的实例化 Scanner scan = new Scanner(System.in);
* 3. 调用Scanner类的相关结构，来获取指定类型的变量
*
* 注意：
* 要根据相应的方法，来输入指定类型的之，如果输入的数据类型与要求的类型补匹配，会报异常：InputMisMatchExce导致程序终止
*
* */

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入");
		String name = scan.next();

		System.out.println("请输入年龄");
		int age = scan.nextInt();


		System.out.println("请输入体重");
		double weight = scan.nextDouble();

		System.out.println("是否");
		boolean isLove = scan.nextBoolean();


		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(isLove);

		// scanner 没有提供获取char型的方法，只能获取一个字符串
		String gender = scan.next();
		// charAt() 获取字符串种某个位置的字符
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);
	}
}
