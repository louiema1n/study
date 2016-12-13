package com.lm.ws.client;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

/**
 * 公网天气查询
 * @author ly
 *
 */
public class WeatherClient {

	public static void main(String[] args) {
		//1.创建服务视图
		WeatherWS weatherWS = new WeatherWS();
		//2.获取服务实现类
		WeatherWSSoap weatherWSSoap = weatherWS.getPort(WeatherWSSoap.class);
		//3.调用查询方法
		ArrayOfString result = weatherWSSoap.getWeather("广州", null);
		
		List<String> list = result.getString();
		
		for (String string : list) {
			System.out.println(string);
		}
	}
	
}
