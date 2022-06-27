package day10.exer4;

public class Account {
  private double balance;

  public Account(double init_balance) {
    this.balance = init_balance; // 余额
  }

  public double getBalance() {
    return balance;
  }

  // 存钱
  public void deposit(double amt) {
    if (amt > 0) {
      balance += amt;
      System.out.println("success");
    }
  }

  // 取钱
  public void withdraw(double amt) {
    if(balance >= amt) {
      balance -= amt;
      System.out.println("getMoneySuccess");
    } else {
      System.out.println("getMoneyError");
    }
  }
}
