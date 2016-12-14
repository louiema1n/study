package com.lm.ws.cxf.client.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lm.ws.cxf.client.WeatherInterface;

/**
 * 服务端
 * @author ly
 *
 */
public class WeatherClient {
	public static void main(String[] args) {
		//初始化spring的上下文
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		//获取服务实现类
		WeatherInterface weatherInterface = (WeatherInterface) applicationContext.getBean("weatherClient");
		//调用查询方法
		String weather = weatherInterface.queryWeather("广州");
		
		System.out.println(weather);
	}
}
