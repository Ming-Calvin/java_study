package day12.exer2;

public class checkAccount extends Account {

  private double overdraft; // 可透支限额

  public checkAccount(int id, double balance, double annualInterestRate, double overdraft) {
    super(id, balance, annualInterestRate);
    this.overdraft = overdraft;
  }

  @Override
  public void withdraw(double amount) {
    if (getBalance() >= amount) { // 余额够
//      setBalance(getBalance() - amount)
      super.withdraw(amount);
    } else if(overdraft >= (amount - getBalance())){ // 透支额度
      overdraft -= (amount - getBalance());

      setBalance(0);
    } else {
      System.out.println("超过限额");
    }

  }

  public double getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(double overdraft) {
    this.overdraft = overdraft;
  }
}
