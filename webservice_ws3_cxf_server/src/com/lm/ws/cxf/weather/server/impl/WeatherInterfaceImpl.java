package com.lm.ws.cxf.weather.server.impl;


import com.lm.ws.cxf.weather.server.WeatherInterface;

public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		System.out.println("from client ..." + cityName);
		return "Çç";
	}

}
