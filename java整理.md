# 数组

## 1. 一维数组

### 1.1 初始化和声明

#### 1.1.1 声明

```java
int[] ids;
```

#### 1.1.2 静态初始化

数组的初始化和数组元素赋值操作同时进行

```java
ids = new int[] {1, 2, 3}
```

#### 1.1.3 动态初始化

数组的初始化和数组元素赋值操作分开进行

```java
String[] name = new String[6]
```

### 1.2 调用数组指定位置元素

从 **0** 开始，从 **长度-1** 结束

```java
names[0] = "xx"
```

### 1.3 如何获取数组长度

属性.length

```java
name.length
```

### 1.4 如何遍历数组

```java
for(int i = 0 ; i < names.length ; i++) {}
```

### 1.5 数组的初始化赋值

- 整形 - 0
- 浮点型 - 0.0
- char型 - 0或'\u0000'，而非'0'
- boolean型 - false
- 引用数据类型 - null

## 2. 二维数组

### 2.1 初始化和声明

#### 2.1.1 静态初始化

```java
int[][] arr = new int[][]{{1,2,3},{4,5},{6,7,8}}
```

#### 2.1.2 动态初始化

第一种：

```java
String[][] arr = new String[3][2]
```

第二种：

```java
String[][] arr = new String[3][]
```

### 2.2 根据指定位置获取数组元素

```java
arr[0][1]
```

### 2.3 获取数组的长度

```java
arr.length
```

### 2.4 如何遍历二维数组

```java
for(int i = 0 ; i < arr.length ; i++) {
	for(int j = 0 ; j < arr[i].length ; i++) {
	}
}
```

### 2.5 默认初始化值

#### 2.5.1 `int[][] arr = new int[4][3]`

- 外层元素：地址值
- 内存元素：与一维数组初始化情况相同

#### 2.5.2 `int[][]arr = new int[4][]`

- 外层元素：null
- 内层元素：不能调用，否则报错

## 3. 数组的常见异常

### 3.1 数组角标越界异常

异常名称: `ArrayIndexOutOfBoundsExcetion`

```java
System.out.println(arr[-2]);
```

### 3.2 空指针异常

异常名称: `NullPointerException`

#### 3.2.1 情况一

```java
int[] arr1 = new int[]{1,2,3}
arr1 = null
System.out.println(arr1[0]);
```

#### 3.2.2 情况二

```java
int[][] arr2 = new int[4][];
System.out.println(arr2[0][0]);
```

## 4. 常用工具类

### 4.1 判断两个数组是否相等

**返回类型：boolean **

**equals (int[]a, int[]b)**

```java
int[] arr1 = new int[]{1,2,3,4};
int[] arr2 = new int[]{1,3,2,4};
boolean isEquals = Arrays.equals(arr1, arr2);
```

### 4.2 输出数组信息

**返回类型：String** 

**toString(int[] a)**

```
Arrays.toString(arr1)
```

### 4.3 将指定值填充到数组种

**返回类型：void** 

**fill(int[] a, int val)**

```java
Arrays.fill(arr1, 10);
```

### 4.4 对数组进行排序

**返回类型：void**

**sort(int[] a)**

```java
Arrays.sort(arr2);
```































