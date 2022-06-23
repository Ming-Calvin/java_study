#### & 和 && 的异同

相同：

1. 两边都为true时，结果为true
2. 左边为true时，依旧运行后面的式子

不同：

1. 右边为false时，&&不运行后面的式子

#### 程序输出

<img src="https://calvin-typora-image.oss-cn-hangzhou.aliyuncs.com/img/20220525165134.png" alt="image-20220525165131055" style="zoom:50%;" />



<img src="https://calvin-typora-image.oss-cn-hangzhou.aliyuncs.com/img/20220525165323.png" alt="image-20220525165321877" style="zoom: 33%;" />

#### 定义三个int型变量并赋值，使用三元运算符或者if-else获取三个数种较大的数

```java
int n1 = 1, n2 = 2, n3 = 3;

if (n1 >= n2 && n1 >= n3) {
    System.out.println(n1);
} else if (n2 >= n1 && n2 >= n3) {
    System.out.println(n2);
} else {
    System.out.println(n3);
}

(n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
```

#### 编写程序，声明两个double型变量并赋值，判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。否则，打印两数的乘积。

```java
double d1 = 11.0, d2 = 12.0;

if (d1 > 10.0 && d2 < 20.0) {
	System.out.println( d1 + d2 );
} else {
    System.out.println( d1 * d2 );
}

```

#### 交换两个变量值的代码的实现

```java
int i1 = 10, i2 = 20

int i3 = i1 + i2;
i1 = i3 - i2;
i2 = i3 - i1;
```



































