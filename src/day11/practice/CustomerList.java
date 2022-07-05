package day11.practice;

public class CustomerList {
  private Customer[] customers;
  private int total = 0;

  public CustomerList(int customersTotal) {
    customers = new Customer[customersTotal];
  }

  /*
   * @Author Calvin_Ming
   * @Description
   * @Date 14:49 2022/7/4
   * @Param [customer] 客户对象
   * @return boolean
   **/
  public boolean addCustomer(Customer customer) {
    if(total >= customers.length ) {
      return false;
    }

    customers[total++] = customer;
    return true;
  }

  /*
   * @Author Calvin_Ming
   * @Description 
   * @Date 14:56 2022/7/4
   * @Param [index, customer]
   * @return boolean
   **/
  public boolean replaceCustomer(int index, Customer customer) {


    customers[index] = customer;
    return true;
  }

  public boolean deleteCustomer(int index) {
    if (index >= total || index < 0) {
      return false;
    }

    for(int i = index; i < total - 1; i++) {
      customers[i] = customers[ i + 1 ];
    }

    customers[total] = null;
    total--;
    return true;
  }

  public Customer[] getAllCustomer() {
    Customer[] cust = new Customer[total];
    for (int i = 0; i < total; i++) {
      cust[i] = customers[i];
    }

    return cust;
  }

  public int getTotal() {
    return total;
  }
}
