package com.lm.ws.jaxws.weatherws.client;

import com.lm.ws.jaxws.weatherws.impl.WeatherInterfaceImpl;
import com.lm.ws.jaxws.weatherws.impl.WeatherInterfaceImplService;

/**
 * webservice客户端
 * @author ly
 *
 */
public class WeatherClient {

	public static void main(String[] args) {
		//创建服务视图
		WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();
		//获取服务实现类
		WeatherInterfaceImpl weatherInterfaceImpl = weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class);
		//调用查询方法,打印
		String weather = weatherInterfaceImpl.queryWeather("广州");
		
		System.out.println(weather);
	}
	
}
