package day03;

public class AriExer {
	public static void main(String[] args) {
		int num = 123;

		int bai = num/100;
		int shi = num % 100 / 10;
		int ge = num % 10;

		System.out.println("百位" + bai);
		System.out.println("十位" + shi);
		System.out.println("个位" + ge);

	}
}
