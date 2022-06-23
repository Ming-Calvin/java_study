package day08.Project04;

public class StrdentTest {
	public static void main(String[] args) {
		// 声明Student数组
		Student[] stus = new Student[20];	// String[] arr = new String[1];


		for(int i = 0; i < stus.length; i++) {
			stus[i] = new Student();

			stus[i].num = (i + 1);

			// [1, 6]
			stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);

			// [0, 100]
			stus[i].score = (int)(Math.random() * (100 - 0 + 1));
		}

		for (int i = 0 ; i < stus.length; i++) {
//			System.out.println(stus[i]);	// 地址值
//			System.out.println(stus[i].num);
//			System.out.println(stus[i].state);
//			System.out.println(stus[i].score);
//			System.out.println(stus[i].info());
		}

		for (int i = 0 ; i < stus.length; i++) {
			if (stus[i].state == 3) {
				System.out.println(stus[i].info());
			}
		}

		for (int i = 0 ; i < stus.length; i++) {
			for (int j = 0; j < stus.length - 1; j++) {
				if(stus[i].score >= stus[j].score) {
					Student temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;
				}
			}
		}

		
	}
	Student student = new Student();



}

class Student {
	int num;	// 学号
	int state;	// 状态
	int score;	// 得分

	// 显示学生信息的方法
	public String info() {
		return "" + num + " " + state + " " + score;
	}

}
