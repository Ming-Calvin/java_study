#### switch后面使用的表达是可以是哪些数据类型

整形：byte short int

字符型：char

枚举类型

String类型

#### 使用switch语句改写下列if语句

```java
int a = 3;
int x = 100;
if (a == 1) {
	x+=5;
} else if (a == 2) {
   x+=10; 
} else if (a == 3) {
   x+=16; 
} else {
    x += 34;
}
```

改：

```
int a = 3;
int x = 100;
switch(a) {
	case 1: x+=5;
		    break;
	case 2: x+=10;
		    break;
	case 3: x+=16;
		    break;
	default: x += 34;
			break;
}
```



#### 谈谈对三元运算符、if-else和switch-case场景的理解

三元： 写法简便

if-else： 能实现最多功能

switch-case: 运行最快，在case的值不是很多时，优先使用



满足条件都都能转换成if-else，能用三元和switch-case尽量使用它们



#### 如何从控制台获取String和int变量，并输出？

```
inport java.util.Scanner

Scanner scan = New Scanner(System.in);


// String
scan.next()

// int
scan.nextInt()

// boolean
scan.boolean()

```



#### 使用for循环遍历100以内的奇数，并算出所有的奇数和并输出。

```java
int sum = 0;
for(int i = 0; i <= 100; i++) {
	if (i % 2 != 0){
		sum += i;
	}
}
System.out.println('n')
```





















































































