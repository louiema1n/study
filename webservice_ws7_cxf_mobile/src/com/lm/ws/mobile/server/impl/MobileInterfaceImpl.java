package com.lm.ws.mobile.server.impl;

import com.lm.ws.mobile.server.MobileCodeWSSoap;
import com.lm.ws.mobile.server.MobileInterface;

public class MobileInterfaceImpl implements MobileInterface {

	private MobileCodeWSSoap mobileClient;
	public MobileCodeWSSoap getMobileClient() {
		return mobileClient;
	}

	public void setMobileClient(MobileCodeWSSoap mobileClient) {
		this.mobileClient = mobileClient;
	}

	public String queryMobile(String phoneNum) {
		return mobileClient.getMobileCodeInfo(phoneNum, "");
	}

}
