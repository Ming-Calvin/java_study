package day05;

/*
*	输入正整数m和n，求最大公约数和最小公倍数
* */
import java.util.Scanner;

public class forTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("输入m");
		int m = scan.nextInt();

		System.out.println("输入n");
		int n = scan.nextInt();

		// 最大公约数
		// 获取两个数的较小值
		int min = (m <= n) ? m : n;

		for(int i = min; i >= 1 ; i--) {
			if (m % i == 0 && n % i == 0) {
				System.out.println(i);
				break;
			}
		}

		// 最小公倍数
		int max = (m >= n) ? m : n;
		for(int i = max ; i <= m * n; i++) {
			if (i % m == 0 && i % n == 0) {
				System.out.println(i);
				break;
			}
		}



	}
}
