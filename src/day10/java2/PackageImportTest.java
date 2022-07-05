package day10.java2;

import day10.exer4.Account;

import java.lang.reflect.Field;
import java.util.*;

// 导入类中的 **结构**
import static java.lang.System.*;

/*
* package
* 1. 为了更好管理项目中的类, 提供包的概念呢
* 2. 使用package声明类或接口所属的包，声明在原文件的首行
* 3. 包属于标识符，遵循标识符的命名规则，规范（xxxyyyzzz）,“见名知意”
* 4. 每“."代表一层文件目录
*
* 补充： 同一个包下，不能命名同名的接口或类
*       不同的包下，可以命名同名的接口或类
*
* model view controller -- mvc
*
* import 导入
* 1. 在源文件中显示的使用import导入指定包下的结构
* 2. 声明在包的声明和类的声明之间
* 3. 如果需要导入多个结构，则并列写出即可
* 4. 可以使用 xxx.* 的方式，可以表示导入 xxx 包下的所有结构
* 5. 如果使用的类或接口是java定义的lang包下定义的，则可以省略import结构
* 6. 如果使用的类和接口是本包下定义的，则可以省略import结构
* 7. 如果在源文件中，使用了不同包下的同名的类，则必须至少有一个类需要以全类名的方式显示
* 8. 如果使用“xxx.*"方式表明可以调用xxx包下的所有结构，如果使用xxx子包下的结构，则仍需要显示导入
* 9. import static : 导入了指定类或接口中的静态结构
* */


import java.util.ArrayList;
import java.util.Arrays;
import day10.exer4.*;

public class PackageImportTest {
  public static void main(String[] args) {
    String info = Arrays.toString(new int[]{1, 2, 3});

    Bank bank = new Bank();

    ArrayList list = new ArrayList();
    HashMap map = new HashMap();

    System.out.println("hello");

    Account account = new Account(1000);
    // 全类名的方式显示
    day10.exer3.Account account1 = new day10.exer3.Account(1000,2000,3000);

//    Dog dog = new Dog();

    System.out.println("hello");

    out.println("aa");


  }
}
