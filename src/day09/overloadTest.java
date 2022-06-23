package day09;

/*
* 重载
*	定义：在同一类中，允许存在一个以上的同名方法，只要参数个数和类型不同就好
*	“两同一不同” -- 同类、同方法名
* 							参数列表不同，参数个数不同，参数类型不同
*
*
*	举例：
* 	Arrays类中重载的sort()/binarySearch()
*
*	判断是否重载：
* 	跟方法的权限修饰符，返回值类型，形参变量名，方法体都没有关系
*
* 在通过对象调用方法时，如何确定某一个指定方法
* 方法名 --> 参数列表
*
* */


public class overloadTest {
	public static void main(String[] args) {
		overloadTest test = new overloadTest();
		test.getSum(1, 2);


	}


	// 如下的四个方法构成了重载
		public void getSum(int i, int j) {
			System.out.println(i + j);
		}

		public void getSum(double d1, double d2) {
			System.out.println(d1 + d2);
		}

	public void getSum(String s1, String s2) {
		
	}

	public void getSum(int i, String s) {

	}

// 不行
//	public void getSum(int i1, int j) {
//
//	}
}
