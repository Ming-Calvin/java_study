package day09;

/*
* 如果是基本数据类型，此时赋值的是变量所保存的数据
*	如果是引用数据类型，此时赋值的是变量所保存的数据的地址值
*
*
*
* */

public class ValueTransferTest {
	public static void main(String[] args) {
		System.out.println("基本数据类型");

		int m = 10;
		int n = m;

		System.out.println("m = " + m +",  n = " + n);

		n = 20;

		System.out.println("m = " + m +",  n = " + n);

		System.out.println("引用数据类型");

		Order o1 = new Order();
		o1.orderId = 1001;

		Order o2 = o1;	// o1 和 o2 的地址值相同，指向同一个空间

		System.out.println("o1 = " + o1.orderId);
		System.out.println("o2 = " + o2.orderId);

		o2.orderId = 1002;
		System.out.println("o1 = " + o1.orderId);
		System.out.println("o2 = " + o2.orderId);
	}
}

class Order {
	int orderId;
}