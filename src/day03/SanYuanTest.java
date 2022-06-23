package day03;

/*
* 三元表达式
* 结构：(条件表达式) ? 表达式1 : 表达式2
*
* 根据表达式的真假，执行表达式
*
*
*  凡是可以使用三元运算符的地方都可以使用if...else
*  使用if...else，不一定可以换成三元
*
* */


public class SanYuanTest {
	public static void main(String[] args) {
		// 获取两个整数的最大值

		int m = 12;
		int n = 5;

		// 两个表达式要求数据类型是一致的
		int max = (m > n) ? m : n;

		// 三元可以嵌套
		String maxStr = (m > n) ? "m" : ((m == n) ? "tong" : "n");

		System.out.println(max);

		if (m > n) {
			System.out.println(m);
		} else {
			System.out.println(n);
		}


	}
}
