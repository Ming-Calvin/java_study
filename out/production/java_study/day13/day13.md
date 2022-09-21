#### 1.如何实现向下转型？需要注意什么问题？如何坚决此问题？

使用强转符： ()

Person p = new Man();

Man m = (Man)pl



可能ClassCastException异常。



在向下转型前，使用instanceof判断是否属于此类



if(p instanceof Man) {

​	Man m = (Man)pl

}





#### 2. == 和 equals() 有何区别

== 对象 -- 所指地址； 基本 -- 数值



equals() 是一个方法，只能用在引用类型种，判断两个对象的值是否相等



#### 3. class User {

​	String name;

​	int age;

​	// 重写equals()方法

​	

```java
public boolean equals(Object obj) {
	if (obj == this) {
        return true;
    }
	if (obj instanceof User) {
        User u = (User)obj;
        return this.age = u.age && this.name.equals(u.name);
    }
	return false;
}
```

#### }



#### 4. 写出8种基本数据类型及对应的包装类

byte

short

int	Integer

long

float

double

char	Character

boolean



#### 5. 基本数据类型、包装类与String三者之间如何转换

自动装箱、自动拆箱

Integer i = 10;

基本数据类型、包装类 ---> String: vlaueOf(XXX xx)

String ---> 基本数据类型、包装类 : parseXXX(String s)



