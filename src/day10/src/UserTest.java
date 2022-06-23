package day10.src;

/*
* 属性赋值的先后顺序
*   1. 默认初始化值
*   2. 显式初始化
*   3. 构造器中赋值/ 构造器初始化
*   4. 通过 对象.方法 或 对象.属性 赋值
*
* 以上操作的先后顺序  1 - 2 - 3 - 4
*
* */

public class UserTest {
    public static void main(String[] args) {
        User u = new User(2);

        u.setAge(3);

        System.out.println(u.age);
    }

}

class User{
    String name;
    int age = 1;

    public User(int a){
        age = a;
    }

    public void setAge(int a) {
        age = a;
    }

}
