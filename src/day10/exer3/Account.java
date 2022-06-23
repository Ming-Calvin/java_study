package day10.exer3;

public class Account {
  private int id; // 账号
  private double balance; // 余额
  private double annualInterestRate; // 年利率

  public Account(int id, double balance, double annualInterestRate) {
    this.id = id;
    this.balance = balance;
    this.annualInterestRate = annualInterestRate;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public void withdraw(double amount) {
    System.out.println(balance);
    if (balance < amount) {
      System.out.println("amount less");
      return;
    } else {
      balance -= amount;
      System.out.println("excess" + amount);
    }
  }

  public void deposit(double amount) {
    if(amount > 0) {
      balance += amount;
      System.out.println("excess" + amount);
    }
  }
}
