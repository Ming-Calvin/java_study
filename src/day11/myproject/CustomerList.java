package day11.myproject;

public class CustomerList {
   private Customer[] customers;
   private int total = 0;

  /*
   * @Author Calvin_Ming
   * @Description 初始化customers数组
   * @Date 17:52 2022/6/30
   * @Param [totalCustomer] 指定数组的长度
   * @return
   **/
   public CustomerList(int totalCustomer) {
     customers = new Customer[totalCustomer];
   }

  /*
   * @Author Calvin_Ming
   * @Description 将指定的客户添加到数组中
   * @Date 17:54 2022/6/30
   * @Param [customer]
   * @return boolean 成功 ; 失败
   **/
   public boolean addCustomer(Customer customer) {
     if (total >= customers.length) {
       return false;
     }

//     customers[total] = customer;
//     total++;
     customers[total++] = customer;
     return true;
   }
   
   /*
    * @Author Calvin_Ming
    * @Description 修改指定索引位置的客户信息
    * @Date 10:24 2022/7/1
    * @Param [index, cust]
    * @return boolean
    **/
   public boolean replaceCustomer(int index, Customer cust) {
     if (index < 0 || index >= total) {
       return false;
     }

     customers[index] = cust;
     return true;
   }

   /*
    * @Author Calvin_Ming
    * @Description 删除指定索引位置上的客户
    * @Date 10:30 2022/7/1
    * @Param [index]
    * @return boolean
    **/
   public boolean deleteCustomer(int index) {
     if (index < 0 || index >= total) {
       return false;
     }

     for(int i = index; i < total - 1; i++){
       customers[i] = customers[i + 1];
     }

      // 最后有数据的元素需要置空
//     customers[total - 1] = null;
//     total--;

     customers[--total] = null;

     return true;
   }

   /*
    * @Author Calvin_Ming
    * @Description 获取所有的客户信息
    * @Date 11:06 2022/7/1
    * @Param []
    * @return day11.myproject.Customer[]
    **/
   public Customer[] getAllCustomers() {
     Customer[] custs = new Customer[total];
     for(int i = 0; i < total; i++) {
       custs[i] = customers[i];
     }

     return custs;
   }

   /*
    * @Author Calvin_Ming
    * @Description 获取指定索引位置的客户信息
    * @Date 11:53 2022/7/1
    * @Param [index]
    * @return day11.myproject.Customer
    **/
   public Customer getCustomer(int index) {
     if(index < 0 || index >= total) {
       return null;
     }

     return customers[index];
   }

   /*
    * @Author Calvin_Ming
    * @Description 获取用户的总数
    * @Date 11:54 2022/7/1
    * @Param []
    * @return int
    **/
   public int getTotal() {
     return total;
   }

}
