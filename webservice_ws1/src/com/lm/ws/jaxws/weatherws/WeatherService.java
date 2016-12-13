package com.lm.ws.jaxws.weatherws;

import javax.xml.ws.Endpoint;

import com.lm.ws.jaxws.weatherws.impl.WeatherInterfaceImpl;

/**
 * EndPoint发布服务
 * @author ly
 *
 */
public class WeatherService {
	
	public static void main(String[] args) {
		
		//address->服务地址;implementor->实现类
		Endpoint.publish("http://127.0.0.1:18658/weather", new WeatherInterfaceImpl());
	}
	
}
