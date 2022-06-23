package day10.exer4;

public class Account {
  private double balance;

  private Account(double init_balance) {
    this.balance = init_balance;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amt) {
    if (amt > 0) {
      balance += amt;
      System.out.println("success");
    }
  }

  public void withdraw(double amt) {
    if(balance >= amt) {
      balance -= amt;
      System.out.println("getMoneySuccess");
    } else {
      System.out.println("getMoneyError");
    }
  }
}
