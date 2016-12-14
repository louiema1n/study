package com.lm.ws.cxf.weather.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.lm.ws.cxf.weather.WeatherInterface;

/**
 * �ͻ���
 * @author ly
 *
 */
public class WeatherClient {

	public static void main(String[] args) {
		//1.���÷����
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		//2.1���÷���ӿ�
		jaxWsProxyFactoryBean.setServiceClass(WeatherInterface.class);
		//2.2���÷����ַ
		jaxWsProxyFactoryBean.setAddress("http://127.0.0.1:18658/weather");
		//3.��ȡ����ӿ�ʵ��
		WeatherInterface weatherInterface = (WeatherInterface) jaxWsProxyFactoryBean.create();
		//4.���ò�ѯ����
		String weather = weatherInterface.queryWeather("����");
		
		System.out.println(weather);
	}
	
}
