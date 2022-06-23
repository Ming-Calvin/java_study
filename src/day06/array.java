package day06;

/*
*	数组名
*
* 数组的元素
*
* 数组的特定： 数组是有序排列的
*
* 数组的角标、下标、索引值
*
* 数组的长度： 元素个数
*
* 数组是引用数据类型
*
* 数组的元素既是基础数据类型又可以是引用数据类型
*
* 数组长度一旦确定，就不可以修改
*
* 数组的分类:
* 维度： 一维数组、二维数组、多维数组
* 数组元素类型： 基本数据类型元素数组、引用数据类型元素数组
* */

public class array {
	public static void main(String[] args) {
		// 一维数组
		// 1. 声明和初始化
		int num ;
		num = 10;

		int id = 1001;

		int[] ids; // 声明
		// 静态初始化: 数组的初始花和数组元素的赋值操作同时进行
		ids = new int[] {1001, 1002, 1003, 1004};

		// 动态初始化：数组的初始化和数组的赋值操作分开进行
		String[] name = new String[5];

		// 总结：数组一旦初始化完成，长度就确定了


		// 2. 调用指定位置的元素；通过角标的方式调用
		// 数组的角标是从0开始的，到 数组长度-1 结束
		name[0] = "hh";
		name[1] = "aa";
		name[2] = "xx";
		name[3] = "dd";
		name[4] = "qq";


		// 3. 获取数组的长度
		// 属性：length
		System.out.println(name.length); // 5


		// 4. 如何遍历数组

		for (int i = 0; i < name.length; i++ ) {
//			System.out.println(name[i]);
		}

		// 数组元素默认初始化
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i]);
		}

		// 数组元素是整形： 0
		short[] arr1 = new short[4];
		for (int i = 0; i < arr1.length; i++ ) {
			System.out.print(arr1[i]);
		}

		// 数组元素是浮点型： 0.0
		double[] arr2 = new double[4];
		for (int i = 0; i < arr2.length; i++ ) {
			System.out.println(arr2[i]);
		}

		// 数组元素是char型： 0 -- ASCII码的
		char[] arr3 = new char[4];
		for (int i = 0; i < arr3.length; i++ ) {
			System.out.println("---" + arr3[i] + "***");
		}

//		if(arr[0] == 0) {
//			System.out.println(true); // true
//		}

		// 数组元素是boolean: false
		boolean[] arr4 = new boolean[5];
		for (int i = 0; i < arr4.length; i++ ) {
			System.out.println(arr4[i]); // false
		}

		// 数组元素是应用数据类型: null 空值
		String[] arr5 = new String[5];
		for (int i = 0; i < arr5.length; i++ ) {
			System.out.println(arr5[i]); // null
		}

		if(arr5[0] == null) {
			System.out.println(true); // true
		}

		// 数组内存的解析









	}
}
