package day14.exer;

public class Account {
  private int id;
  public String pwd = "000000";
  private double balance;

  private static double interestRate;
  private static double minMonty = 1.0;
  private static int init = 1001; // 自动id

  public Account() {
    id = init++;
  }

  public Account(String pwd, double balance) {
    this();
    this.pwd = pwd;
    this.balance = balance;
  }

  public int getId() {
    return id;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public double getBalance() {
    return balance;
  }

  public static double getInterestRate() {
    return interestRate;
  }

  public static void setInterestRate(double interestRate) {
    Account.interestRate = interestRate;
  }

  public static double getMinMonty() {
    return minMonty;
  }

  public static void setMinMonty(double minMonty) {
    Account.minMonty = minMonty;
  }

  @Override
  public String toString() {
    return "Account{" +
        "id=" + id +
        ", pwd='" + pwd + '\'' +
        ", balance=" + balance +
        '}';
  }
}
