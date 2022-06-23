package day05;

/*
* 100以内所有质数的输出
* 质数：只能被1和它本身整除的自然数 --> 从2 开始到这个数-1位置结束，不能被整除
*
* 最小的质数是2
* */

public class primeNumer {
	public static void main(String[] args) {
		boolean isFlag = true;

		for (int i= 2; i <= 100; i++) {	// 遍历100以内的数
			for (int j = 2; j < i; j++) { // 被i去除
				if ( i % j == 0) {
					isFlag = false;
				}
			}
			if(isFlag) System.out.println(i);

			isFlag = true;
		}

		
	}

}
