package day05;

/*
* do..while使用
*
* 循环结构
*
* 初始化条件
* do {
* 	循环体
* 	迭代条件
* } while(循环条件)
*
* 结构不一样，至少执行一次循环体
* 初始化条件 --> 进入循环体 --> 进行迭代条件 --> 满足循环条件 --> 进入循环体 --> 进行迭代条件 --> 不满足循环条件
* */

public class doWhileTest {
	public static void main(String[] args) {
		int num = 1;
		do {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;
		}while(num <= 100);
	}
}
