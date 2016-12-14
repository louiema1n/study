package com.lm.ws.cxf.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.lm.ws.cxf.server.impl.WeatherInterfaceImpl;

/**
 * �����
 * @author ly
 *
 */
public class WeatherServer {
	
	public static void main(String[] args) {
		//1.��������
		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
		//2.1���÷���ӿ�
		jaxWsServerFactoryBean.setServiceClass(WeatherInterface.class);
		//2.2���÷���ʵ����
		jaxWsServerFactoryBean.setServiceBean(new WeatherInterfaceImpl());
		//2.3���÷����ַ
		jaxWsServerFactoryBean.setAddress("http://127.0.0.1:18659/weather");
		//3.����
		jaxWsServerFactoryBean.create();
		
	}
}
