package day09;

/*
*
*
* */

public class ArrayUtilTest {
	public static void main(String[] args) {
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[]{32, 34, 32, 5, 3, 54, 654, -98, 0, -53, 5};
		System.out.println("最大");
		int max = util.getMax(arr);
		System.out.println("max" + max);
		System.out.println("最小");
		int min = util.getMin(arr);
		System.out.println("min" + min);
		System.out.println("总");
		int sum = util.getSum(arr);
		System.out.println("sum" + sum);
		System.out.println("平均");
		int avg = util.getAvg(arr);
		System.out.println("avg" + avg);
		System.out.println("反转");
		int[] reverseArr = util.reverse(arr);
		System.out.println("reverse" + reverseArr);
		System.out.println("遍历");
		util.print(arr);
		System.out.println("位置");
		int index = util.getIndex(arr, 5);
		System.out.println(index);
	}
}



class ArrayUtil {

	// 数组最大值
	public int getMax(int[] arr) {
		int maxValue = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}

		return maxValue;
	}


	// 数组最小值
	public int getMin(int[] arr) {
		int minValue = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(minValue > arr[i]) {
				minValue = arr[i];
			}
		}

		return minValue;
	}


	// 数组的总和
	public int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++){
			sum += arr[i];
		}

		return sum;
	}


	// 数组平均值
	public int getAvg(int[] arr) {
		return getSum(arr) / arr.length;
	}


	// 反转数组
	public int[] reverse(int[] arr) {
		for(int i = 0; i < arr.length/2 ; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length -i -1];
			arr[arr.length -i -1] = temp;
		}
		return arr;
	}


	// 复制数组
	public int[] copy(int[] arr){
		int[] arrCopy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrCopy[i] = arr[i];
		}
		return arrCopy;

	}


	// 数组排序
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j +1];
					arr[j + 1] = temp;
				}
			}
		}
	}


	// 遍历数组
	public void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
	}


	// 查找指定元素
	public int getIndex(int[] arr,int dest) {

		for (int i = 0; i < arr.length; i++) {
			// .equals 判断地址是否相同
			if (dest == arr[i]) {
				return i;
			}
		}

		return -1;// 负数表示没找到
	}
}
