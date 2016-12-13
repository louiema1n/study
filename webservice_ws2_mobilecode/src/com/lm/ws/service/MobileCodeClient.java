package com.lm.ws.service;
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;


public class MobileCodeClient {

	/**
	 * 公网手机号码归属地查询
	 */
	public static void main(String[] args) {
		//1.创建服务视图
		MobileCodeWS mobileCodeWS = new MobileCodeWS();
		//2.获取服务实现类
		MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getPort(MobileCodeWSSoap.class);
		//3.调用查询方法
		String mobileCodeInfo = mobileCodeWSSoap.getMobileCodeInfo("1556550", "");
		
		System.out.println(mobileCodeInfo);
	}
	
}
