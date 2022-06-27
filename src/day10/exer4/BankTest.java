package day10.exer4;

public class BankTest {
  public static void main(String[] args) {
    Bank bank = new Bank();

    bank.addCustomer("jane", "smith");

    bank.getCustomer(0).setAccount(new Account(2000));

    bank.getCustomer(0).getAccount().withdraw(500);

    double bankBalance = bank.getCustomer(0).getAccount().getBalance();

    System.out.println(bankBalance);


  }
}
