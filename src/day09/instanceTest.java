package day09;

/*
* 万事万物皆对象
* 1. 在java中，都将功能结构等封装到类中，通过类的实例化，来调用具体结构功能
* 	> Scanner,String等
*   > 文件、File
* 	> 网络资源： URL
* 2. java与前端交互是，前后端的结构在java层面交互时，都体现为类、对象

*
*  应用类型的变量，只有可能存储两类值， null 或者 地址值（变量类型）
*
*  匿名对象的使用
*  1. 创建的是对象，没有赋给一个变量名
*  2. 匿名对象只能使用一次
*  3. 使用：如下
* */

public class instanceTest {
	public static void main(ArrayUtil[] args) {
		Phone p = new Phone();

		p.sendEmail();
		p.playGame();

		// 匿名对象
		new Phone().sendEmail();
		new Phone().playGame();

		new Phone().price = 999;
		new Phone().showPrice(); // 0.0

		/**************************************/
		PhoneMall mall = new PhoneMall();
		// 匿名对象使用
		mall.show(new Phone());

	}
}

class Phone {
	double price;

	public void sendEmail() {
		System.out.println("send email");
	}

	public void playGame() {
		System.out.println("play Game");
	}

	public void showPrice() {
		System.out.println(price);
	}

}

class PhoneMall {
	public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
	}
}
