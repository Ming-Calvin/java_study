package day06;

public class ArrayTest02 {
	public static void main(String[] args) {
		// 声明和初始化
		// 静态
		int[] arr = new int[] {1, 2, 3};
		int[][] arr1 = new int[][]{{1, 2, 3}, {1, 2, 3}};
		// 动态
		String[][] arr2 = new String[3][2];
		String[][] arr3 = new String[3][];

		// 调用
		System.out.println(arr1[0][1]);		//2
		System.out.println(arr2[1][1]);		//null
//		System.out.println(arr3[1][0]);		// thread "main" 报错

		// 获取长度
		int[] arr4[] = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
//		int[] arr5[] = {1, 2, 3}, {4, 5}, {6, 7, 8}};

		System.out.println(arr4.length);  //3
		System.out.println(arr4[0].length);  //3
		System.out.println(arr4[1].length);  //2
		System.out.println(arr4[2].length);  //3

		// 如何遍历二维数组
		for(int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				System.out.println("arr4[" + i + "]" + "[" + j + "]: " + arr4[i][j] );
			}
		}

		// 默认值
		// 二维数组外层数组的元素、内存的数组元素
		// 外层元素：arr[0]
		// 内层元素：arr[0][0]

		// 整型
		int[][] arr6 = new int[4][3];
		System.out.println(arr6[0]);	// [I@1b6d3586 -- 地址值
		System.out.println(arr6[0][0]);	// 0

		System.out.println(arr6);	// [[I@4554617c

		// 浮点型
		float[][]	arr7 = new float[4][3];
		System.out.println(arr7[0]);	// [F@74a14482
		System.out.println(arr7[0][0]);	// 0.0

		// String
		String[][]	arr8 = new String[4][3];
		System.out.println(arr8[0]);	// [Ljava.lang.String;@1540e19d
		System.out.println(arr8[0][0]);	// null

		/*
		* 针对于初始化一： int[][] = new int[4][3]
		* 外层： 地址值
		* 内层： 一维数组相情况相同
		*
		* 针对于初始化二： int[][] = new int[4][]
		* 外层： null
		* 内层： 一不能调用，否则报错
		*
		* */

		/*
		*
		*
		* */
	}
}
