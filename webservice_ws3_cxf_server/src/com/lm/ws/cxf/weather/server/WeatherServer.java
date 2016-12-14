package com.lm.ws.cxf.weather.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.lm.ws.cxf.weather.server.impl.WeatherInterfaceImpl;

/**
 * 服务端
 * @author ly
 *
 */
public class WeatherServer {
	
	public static void main(String[] args) {
		//1.发布服务
		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
		//2.1设置服务接口
		jaxWsServerFactoryBean.setServiceClass(WeatherInterface.class);
		//2.2设置服务实现类
		jaxWsServerFactoryBean.setServiceBean(new WeatherInterfaceImpl());
		//2.3设置服务地址
		jaxWsServerFactoryBean.setAddress("http://127.0.0.1:18658/weather");
		//3.发布
		jaxWsServerFactoryBean.create();
		
	}
}
