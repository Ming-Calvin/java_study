package day05;

/*
*							使用范围					使用的作用								相同点
* break:		switch-case			结束当前的循环				关键字后面不能声明执行语句
* 					循环结构中
*
* continue: 循环结构中				结束当此的循环				关键字后面不能声明执行语句
*
*
*
* */

public class continueTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 4 == 0) {
				break;	// 123
//				continue;	//1235678910
			}
			System.out.print(i);
		}

		System.out.println("\n");

		label: for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 10; j++) {

				if(j % 4 == 0) {
					//break;	// 默认跳出包裹此关键字最近的一层循环
					// continue; // 默认跳出包裹此关键字最近的一层循环

					// break label;	//结束指定标识的一层循环结构
					continue label;	//结束档次指定标识的一层循环结构
				}

				System.out.print(j);
			}

			System.out.println( );
		}
	}




}
