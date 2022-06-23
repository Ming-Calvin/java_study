package day04;

public class forTest01 {
	public static void main(String[] args){
		for(int i = 1; i <= 150; i++) {
			System.out.println(i);
			if(i % 3 == 0) {
				System.out.println("foo");
			} else if (i % 5 == 0) {
				System.out.println("biz");
			}else if (i % 7 == 0) {
				System.out.println("baz");
			}
		}
	}
}
