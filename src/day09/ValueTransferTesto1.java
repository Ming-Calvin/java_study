package day09;

/*
* 方法形参的传递机制，值传递
*
* 1. 形参：方法定义时，声明的小括号内的参数
*    实参： 方法调用时，实际传递给形参的数据
*
* 2. 值传递机制：
* 	参数是基本数据类型，实参赋给形参的是实参真实存储的值
* 	参数是应用数据类型，实参赋给形参的是存储数据的地址值
*
*
*
* */

public class ValueTransferTesto1 {
	public static void main(String[] args) {
		// 交换两个变量值的操作
		System.out.println("基本数据类型");

		int m = 10;
		int n = m;

		System.out.println("m = " + m +",  n = " + n);

//		int temp = m;
//		m = n;
//		n = temp;

		ValueTransferTesto1 test = new ValueTransferTesto1();
		test.swap(m, n);


		System.out.println("m = " + m +",  n = " + n);

		int[] array1 = new int[]{3,2,4};


//		Solution test1 = new Solution();
//		test1.twoSum(array1, 6);

	}

	public void swap(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
	}

	

}
