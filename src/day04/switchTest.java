package day04;

/*
* 根据switch表达式中的值，依次匹配case中的常量，一旦匹配成果，会进入到相应的case中，调用气执行语句，当调用完执行语句后，仍然会
* 向下执行其他case结构中的执行后。直到遇到break关键字或switch-case结构末尾结束为止
*
*
* break可以使用在switch-case结构中，标识一旦执行到此关键字，跳出结构
*
* switch结构中的表达式，只能是如下6种数据类型之一：
* byte、short、char、int、枚举类型、String类型
*
* case 之后只能声明常量，不能声明一个范围
*
* break关键字是可选的
*
* default: 默认
*
* */

public class switchTest {
	public static void main (String[] args) {
		int num = 2;
		switch(num){
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			default:
				System.out.println("other");
				break;
		}
	}
}
