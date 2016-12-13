package com.lm.ws.jaxws.weatherws.client;

import com.lm.ws.jaxws.weatherws.impl.WeatherInterfaceImpl;
import com.lm.ws.jaxws.weatherws.impl.WeatherInterfaceImplService;

/**
 * webservice�ͻ���
 * @author ly
 *
 */
public class WeatherClient {

	public static void main(String[] args) {
		//����������ͼ
		WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();
		//��ȡ����ʵ����
		WeatherInterfaceImpl weatherInterfaceImpl = weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class);
		//���ò�ѯ����,��ӡ
		String weather = weatherInterfaceImpl.queryWeather("����");
		
		System.out.println(weather);
	}
	
}
