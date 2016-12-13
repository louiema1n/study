package com.lm.ws.jaxws.weatherws.impl;

import javax.jws.WebService;

import com.lm.ws.jaxws.weatherws.WeatherInterface;

@WebService		//@WebService表示该类为一个webservice类,需要发布其中的public方法
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		System.out.println("from client" + cityName);
		String weather = "晴";
		return weather;
	}

}
