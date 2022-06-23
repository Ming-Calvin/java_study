package day05;

/*
* 优化：
* 100以内所有质数的输出
* 质数：只能被1和它本身整除的自然数 --> 从2 开始到这个数-1位置结束，不能被整除
*
* 最小的质数是2
* */

public class primeNumerTest {
	public static void main(String[] args) {

		boolean isFlag = true;

		long star = System.currentTimeMillis(); // 1970年1月1日到当前时间的毫秒数


		for (int i= 2; i <= 10000; i++) {	// 遍历100以内的数
			for (int j = 2; j <= Math.sqrt(i); j++) { // 被i去除
				if ( i % j == 0) {
					isFlag = false;
					break; // 优化一：只对非指数的自然数有效

				}
			}
			if(isFlag) System.out.println(i);

			isFlag = true;
		}

		long end = System.currentTimeMillis(); // 1970年1月1日到当前时间的毫秒数

		System.out.println("时间" + (end-star));
	}

}
