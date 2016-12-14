package com.lm.ws.cxf.client.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lm.ws.cxf.client.WeatherInterface;

/**
 * �����
 * @author ly
 *
 */
public class WeatherClient {
	public static void main(String[] args) {
		//��ʼ��spring��������
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		//��ȡ����ʵ����
		WeatherInterface weatherInterface = (WeatherInterface) applicationContext.getBean("weatherClient");
		//���ò�ѯ����
		String weather = weatherInterface.queryWeather("����");
		
		System.out.println(weather);
	}
}
