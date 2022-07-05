package day11.myproject;

public class CustomerView {
  private CustomerList customerList = new CustomerList(10);

  public CustomerView() {
    Customer customer = new Customer("test", '男', 22, "17378099778", "xxx@qq.com");
    customerList.addCustomer(customer);
  }

  /*
   * @Author Calvin_Ming
   * @Description 显示《客户信息管理软件的方法》
   * @Date 14:29 2022/7/1
   * @Param []
   * @return
   **/
  public void enterMainMenu() {
    boolean isFlag = true;
    while(isFlag) {
      System.out.println("----------客户信息管理软件---------\n");
      System.out.println("          1:添加客户");
      System.out.println("          2:修改客户");
      System.out.println("          3:删除客户");
      System.out.println("          4:客户列表");
      System.out.println("          5:退出\n");
      System.out.println("          请选择（1-5）:");

      // 获取12345
      char menu = CMUtility.readMenuSelection();
      switch (menu) {
        case '1':
          addNewCustomer();
          break;
        case '2':
          modifyCustomer();
          break;
        case '3':
          deleteCustomer();
          break;
        case '4':
          listAllCustomers();
          break;
        case '5':
          System.out.print("确认是否退出(Y/N): ");
          char isExit = CMUtility.readConfirmSelection();
          if (isExit == 'Y') {
            isFlag = false;
          }
          break;
      }
    }

  }

  /*
   * @Author Calvin_Ming
   * @Description 添加用户
   * @Date 15:03 2022/7/1
   * @Param []
   * @return
   **/
  private void addNewCustomer() {
    System.out.println("添加用户");
  }

  /*
   * @Author Calvin_Ming
   * @Description 修改用户
   * @Date 15:03 2022/7/1
   * @Param []
   * @return
   **/
  private void modifyCustomer() {
    System.out.println("修改用户");
  }

  /*
   * @Author Calvin_Ming
   * @Description 删除用户
   * @Date 15:03 2022/7/1
   * @Param []
   * @return
   **/
  private void deleteCustomer() {
    System.out.println("删除用户");
  }

  /*
   * @Author Calvin_Ming
   * @Description 显示客户列表
   * @Date 15:03 2022/7/1
   * @Param []
   * @return
   **/
  private void listAllCustomers() {
    System.out.println("-------------------客户列表--------------------------------");
    int total = customerList.getTotal();
    if (total == 0) {
      System.out.println("没有客户记录");
      return;
    } else {
      System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱\n");
      Customer[] custs = customerList.getAllCustomers();
    }

    System.out.println("-------------------客户列表完成--------------------------------\n");
  }


  public static void main(String[] args) {
    CustomerView view = new CustomerView();
    view.enterMainMenu();
  }

}
