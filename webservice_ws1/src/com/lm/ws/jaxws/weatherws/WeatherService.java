package com.lm.ws.jaxws.weatherws;

import javax.xml.ws.Endpoint;

import com.lm.ws.jaxws.weatherws.impl.WeatherInterfaceImpl;

/**
 * EndPoint��������
 * @author ly
 *
 */
public class WeatherService {
	
	public static void main(String[] args) {
		
		//address->�����ַ;implementor->ʵ����
		Endpoint.publish("http://127.0.0.1:18658/weather", new WeatherInterfaceImpl());
	}
	
}
