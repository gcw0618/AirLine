package com.yanzu.plane_company.RPC;


import com.yanzu.plane_company.Interface.PlaneCompany;
import com.yanzu.plane_company.out.*;


public class RPCClientTest {
	public static void main(String[] args) throws Exception {
		//按照日期查找航班 取消注释
		/*SearchDate searchDate=new SearchDate();
		searchDate.main();*/
		
		//按照价格查找航班 取消注释
		/*SearchPrice searchPrice=new SearchPrice();
		searchPrice.main();*/

		//查找所有航班 取消注释
		SearchFlight searchFlight=new SearchFlight();
		searchFlight.main();

		//航空公司功能 取消注释
		/*PlaneCompany planeCompany=new PlaneCompany();
		planeCompany.main();*/

		//查找出发地目的地功能 取消注释
		/*SearchPlace searchPlace=new SearchPlace();
		searchPlace.main();*/

		//查找机票余量功能 取消注释
		/*SearchQuantity searchQuantity=new SearchQuantity();
		searchQuantity.main();*/

		//购买功能 取消注释
		/*BuyTicket buyTicket=new BuyTicket();
		buyTicket.main();*/
		
		
	}
}
