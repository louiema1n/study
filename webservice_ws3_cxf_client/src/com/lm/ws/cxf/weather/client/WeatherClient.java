package com.lm.ws.cxf.weather.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.lm.ws.cxf.weather.WeatherInterface;

/**
 * 客户端
 * @author ly
 *
 */
public class WeatherClient {

	public static void main(String[] args) {
		//1.调用服务端
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		//2.1设置服务接口
		jaxWsProxyFactoryBean.setServiceClass(WeatherInterface.class);
		//2.2设置服务地址
		jaxWsProxyFactoryBean.setAddress("http://127.0.0.1:18658/weather");
		//3.获取服务接口实例
		WeatherInterface weatherInterface = (WeatherInterface) jaxWsProxyFactoryBean.create();
		//4.调用查询方法
		String weather = weatherInterface.queryWeather("广州");
		
		System.out.println(weather);
	}
	
}
