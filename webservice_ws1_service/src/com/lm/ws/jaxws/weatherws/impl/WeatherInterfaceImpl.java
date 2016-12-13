package com.lm.ws.jaxws.weatherws.impl;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import com.lm.ws.jaxws.weatherws.WeatherInterface;

@WebService		//@WebService表示该类为一个webservice类,需要发布其中的public方法
//@BindingType(SOAPBinding.SOAP12HTTP_BINDING)	//发布SOAP1.2需要导入第三方jar
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		System.out.println("from client" + cityName);
		String weather = "晴";
		return weather;
	}

}
