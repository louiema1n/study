package com.lm.ws.jaxws.weatherws.impl;

import javax.jws.WebService;

import com.lm.ws.jaxws.weatherws.WeatherInterface;

@WebService		//@WebService��ʾ����Ϊһ��webservice��,��Ҫ�������е�public����
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		System.out.println("from client" + cityName);
		String weather = "��";
		return weather;
	}

}
