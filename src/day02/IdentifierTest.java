package day02;

/*
* 标识符
* 可以自己取名字的
*
* 命名规则 --> 编译不通过
* 1. 大小写 数字 _ $ 构成
* 2. 数字不能开头
* 3. 不可使用关键字 和 保留字
* 4. 严格区分大小写，长度不限制
* 5. 不能写空格
*
* 命名规范 --> 编译可以通过
* 包名 所有单词都小写 myage
* 类名、接口名 所有单词首字母大写 MyAge
* 变量名、方法名 第一个的单词首字母小写、第二个单词开始首字母大写 myName
* 常量名 每个单词用下划线连接 my_age
* */


public class IdentifierTest {
	public static void main(String[] args) {
		int myNumber = 1001;
		System.out.println(myNumber);
	}
}
