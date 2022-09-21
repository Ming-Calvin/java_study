package day14.java3;
/*
*
* final: 最终的
*
* 1. final可以用于修饰的结构，类、方法、变量
* 2. final 用来修饰一个类: 此类不能被其他类继承
* 3. final 用来修饰方法： 方法不能再进行重写
*         比如： Object 中的 getClass
* 4. final 用来修饰变量，变成“常量”
*   4.1 final 修饰属性： 可以考虑值的位置有：显示初始化,代码块中初始化
*
* */
public class FinalTest {

  final int WIDTH = 0;
  final int LEFT;
  final int RIGHT;
//  final int DOWN;

  {
    LEFT = 1;
  }


  public void doWidth() {
//    width = 20;
  }

  public FinalTest() {
    RIGHT = 2;
  }

  public FinalTest(int n) {
    RIGHT = n;
  }

//  public void setDOWN(int down) {
//    this.DOWN = down;
//  }


  public static void main(String[] args) {
    int num = 10;
    num = num + 5;
  }
}


final class FinalA {

}

class AA {
  final public void show() {

  }
}

class BB extends AA {
//  public void show() {
//
//  }
}
