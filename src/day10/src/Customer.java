package day10.src;
/*
* javaBean符合以下条件：
*   1. 类是公共的
*   2. 有一个无参的构造器
*   3. 有属性： 且有get、set方法
*
*
* */


public class Customer {
    private int id;
    private String name;

    public Customer() {

    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }


}
