package day13.java1;

import java.util.Date;

/*
*
*
*
*
* */
public class ToString {
  public static void main(String[] args) {
    Customer cust1 = new Customer("tom", 21);
    System.out.println(cust1.toString());

    String str = new String("MM");
    System.out.println(str);

    Date date = new Date(4534534534543L);
    System.out.println(date.toString());


  }
}
