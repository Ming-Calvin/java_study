package day12.exer2;

/*
*
*
*
* */

public class checkAccountTest {
  public static void main(String[] args) {
    checkAccount acct = new checkAccount(1122, 20000, 0.045, 5000);

    acct.withdraw(5000);
    System.out.println("余额" + acct.getBalance());
    System.out.println("可透支余额" + acct.getOverdraft());

    acct.withdraw(18000);
    System.out.println("余额" + acct.getBalance());
    System.out.println("可透支余额" + acct.getOverdraft());

    acct.withdraw(3000);
    System.out.println("余额" + acct.getBalance());
    System.out.println("可透支余额" + acct.getOverdraft());
  }
}
