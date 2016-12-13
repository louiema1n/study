package com.lm.ws.client;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

/**
 * ����������ѯ
 * @author ly
 *
 */
public class WeatherClient {

	public static void main(String[] args) {
		//1.����������ͼ
		WeatherWS weatherWS = new WeatherWS();
		//2.��ȡ����ʵ����
		WeatherWSSoap weatherWSSoap = weatherWS.getPort(WeatherWSSoap.class);
		//3.���ò�ѯ����
		ArrayOfString result = weatherWSSoap.getWeather("����", null);
		
		List<String> list = result.getString();
		
		for (String string : list) {
			System.out.println(string);
		}
	}
	
}
