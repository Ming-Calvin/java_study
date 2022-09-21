package day14.exer;

public class AccountTest {
  public static void main(String[] args) {
    Account acct1 = new Account();
    Account acct2 = new Account("qwerty", 2000);

    System.out.println(acct1);
    System.out.println(acct2);

    Account.setInterestRate(0.012);
    Account.setMinMonty(100);


  }
}
