# Airline
## Flight中的数据类型
#### `String ID;` 航班号
#### `String company;` 航空公司名称
#### `String depart;` 出发地
#### `String depart_time;`  起飞时间
#### `String arrive;` 目的地
#### `String arrive_time;`  到达时间
#### `int quantity;`  机票数量
#### `int price;` 机票价格<br><br>
## 用户功能 (com.yanzu.plane_company.out)
### BuyTicket类 (com.yanzu.plane_company.out.BuyTicket)
* #### 调用接口：`public boolean buyticket(String ID);`
* #### 输入类型：`String ID`  航班编号
* #### 返回值：`boolean`
### SearchDate类 (com.yanzu.plane_company.out.SearchDate)
* #### 调用接口：`public ArrayList<Flight> searchdepart_time(String depart_time);`
* #### 输入类型：`String depart_time`  起飞时间
* #### 返回值：`ArrayList<Flight> flight_list=new ArrayList<Flight>();`
### SearchFlight类 (com.yanzu.plane_company.out.SearchFlight)
* #### 调用接口：`public ArrayList<Flight> searchflight();`
* #### 输入类型：`无`
* #### 返回值：`ArrayList<Flight> flight_list=new ArrayList<Flight>();`
### SearchPlace类 (com.yanzu.plane_company.out.SearchPlace)
* #### 调用接口：`public ArrayList<Flight> searchplace(String depart, String arrive);`
* #### 输入类型：`String depart, String arrive`  出发地，目的地
* #### 返回值：`ArrayList<Flight> flight_list=new ArrayList<Flight>();`
### SearchPrice类 (com.yanzu.plane_company.out.SearchPrice)
* #### 调用接口：`public ArrayList<Flight> searchprice(int price);`
* #### 输入类型：`int price`机票价格
* #### 返回值：`ArrayList<Flight> flight_list=new ArrayList<Flight>();`
### SearchQuantity类 (com.yanzu.plane_company.out.SearchQuantity)
* #### 调用接口：`public ArrayList<Flight> searchquantity(String ID);`
* #### 输入类型：`String ID`  航班编号
* #### 返回值：`ArrayList<Flight> flight_list=new ArrayList<Flight>();`<br><br>
## 航空公司功能 (com.yanzu.plane_company.Interface)
### PlaneCompany类下的login()为登入功能
* #### 调用接口：`public boolean checklogin(String company, String password);`
* #### 输入类型：`String company, String password` 用户名，密码
* #### 返回值：`boolean`
### PlaneCompany类下的operation()为操作功能，包括增删改查
* #### 增加机票信息
  * ##### 调用接口：`public boolean addflight(Flight flight);`
  * ##### 输入类型：`Flight flight` 包含上面Flight中所有数据类型
  * ##### 返回值：`boolean`
* #### 删除机票信息
  * ##### 调用接口：`public boolean deleteflight(String ID);`
  * ##### 输入类型：`String ID`
  * ##### 返回值：`boolean`
* #### 检查航班编号是否存在
  * ##### 调用接口：`public boolean checkfightid(String company, String ID);`
  * ##### 输入类型：`String company, String ID`
  * ##### 返回值：`boolean`
* #### 更新航班信息
  * ##### 调用接口：`public boolean updateflight(Flight flight);`
  * ##### 输入类型：`Flight flight`  包含上面Flight中所有数据类型
  * ##### 返回值：`boolean`
