package com.lm.ws.service;
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;


public class MobileCodeClient {

	/**
	 * �����ֻ���������ز�ѯ
	 */
	public static void main(String[] args) {
		//1.����������ͼ
		MobileCodeWS mobileCodeWS = new MobileCodeWS();
		//2.��ȡ����ʵ����
		MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getPort(MobileCodeWSSoap.class);
		//3.���ò�ѯ����
		String mobileCodeInfo = mobileCodeWSSoap.getMobileCodeInfo("1556550", "");
		
		System.out.println(mobileCodeInfo);
	}
	
}
