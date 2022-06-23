package day05;

public class question {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 2; i <= 1000; i++) {
			for (int j = 1; j < i ; j++) {
				if (i % j == 0) {
					sum  += j;
				}
			}

			if (sum == i) {
				System.out.println(sum);
			}
			sum = 0;
		}


	}
}
