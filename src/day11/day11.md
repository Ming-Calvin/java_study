#### 1. 声明Customer类型数组 customers 和记录存储客户的个数的变量

#### 2. 构造器，用于初始化customers数组

传入数组的指定长度，进行数组的初始化

#### 3. 添加指定客户到数组中，return是否成功

public boolean addCustomer(Customer customer) {}



判断客户数量是不是已经达到最大，如果是-false，如果不是，添加客户并返回true

#### 4. 替换指定缩影位置上的数组元素，return是否成功

public boolean relpaceCustomer(int index, Customer cust) {}



判断客户数量是不是小于0或者超过数组长度，如果是-false，如果不是，替换元素并返回true

#### 5. 删除指定索引位置上的元素，return是否成功

public boolean deleteCustomer(int index) {}



判断客户数量是不是小于0或者超过数组长度，如果是-false，如果不是，删除元素并返回true



删除操作：利用循环，将指定位置后一位的数组元素替换原本的数组元素，并将最后一位删除

#### 6. 获取所有customer对象构成的数组

public Customer[] getAllCustomer() {}



新建一个数组，将现有的Customer数组中的数据提取赋值，返回新的数组

#### 7. 返回指定索引位置上的Customer, return如果输入的index位置上的元素不存在，返回null

public Customer getCustomer(int index) {}



判断客户数量是不是小于0或者超过数组长度，如果是-false，如果不是，替换元素并返回true

#### 8. 返回Customer对象的个数

 public int getTotal() {}



#### Customer类

private String name;

private char gender;

private int age;

private String phone;

private String email;