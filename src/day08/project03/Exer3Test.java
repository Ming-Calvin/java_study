package day08.project03;

public class Exer3Test {
	public static void main(String[] args) {
		Exer3Test test = new Exer3Test();

//		test.method();

		System.out.println(test.method(12, 10));
	}

//	public void method() {
//		for (int i = 0; i < 10; i++) {
//			for(int j = 0; j < 8 ; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}

//	public int method() {
//		for (int i = 0; i < 10; i++) {
//			for(int j = 0; j < 8 ; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//
//		return 10 * 8;
//	}

	public int method(int m, int n) {
		for (int i = 0; i < 10; i++) {
			for(int j = 0; j < 8 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		return m * n;
	}
}
