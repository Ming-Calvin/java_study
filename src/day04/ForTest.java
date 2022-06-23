package day04;

/*
* 1. 四个要素
* 初始化条件
* 循环条件  ---> boolean
* 循环体
* 迭代条件
*
* 2.for循环条件
*
* for (初始化条件 ; 循环条件 ; 迭代条件) {
* 	循环体
* }
*
* 执行过程 ：
*
* 初始化条件 --> 满足循环条件 --> 进入循环体 --> 进行迭代条件 --> 满足循环条件 --> 进入循环体 --> 进行迭代条件 --> 不满足循环条件
*
* */

public class ForTest {
	public static void main(String[] args){

		for(int i = 1; i <= 5; i++) {
			System.out.println("Hello Word");
		}

		int num = 1;
		// 逗号标识执行执行语句有两个
		for(System.out.print('a'); num <= 3; System.out.print('c'),num++) {
			System.out.println('b');
		}
		// ab cb cb c

		// 遍历100以内的偶数
		// i在for循环中有效，出了for循环就失效了
		int sum = 0;
		int count = 0;
		for ( int i = 1; i <= 100; i++) {
			if (i % 2 == 0){
				System.out.println(i);
				sum += i;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);

	}
}
