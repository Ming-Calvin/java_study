package day05;

/*
* while循环的使用
*
* 1. 四个要素
* 初始化条件
* 循环条件  ---> boolean
* 循环体
* 迭代条件
*
*
* 初始化条件
* while(循环条件) {
* 	循环体
* 	迭代条件
* }
*
* for 和 while 可以相互转换
*
* 写while循环时，不要弄丢了循环条件，一旦弄丢了，就可能导致死循环
* 区别：for和while 初始化条件有区别
*
* 初始化条件 --> 满足循环条件 --> 进入循环体 --> 进行迭代条件 --> 满足循环条件 --> 进入循环体 --> 进行迭代条件 --> 不满足循环条件
* */


public class whileTest {
	public static void main(String[] args) {
		// 遍历100以内的所有偶数
		int i = 1;
		while(i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
