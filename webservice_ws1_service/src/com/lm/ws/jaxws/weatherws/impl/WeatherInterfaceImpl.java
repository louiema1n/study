package com.lm.ws.jaxws.weatherws.impl;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import com.lm.ws.jaxws.weatherws.WeatherInterface;

@WebService		//@WebService��ʾ����Ϊһ��webservice��,��Ҫ�������е�public����
//@BindingType(SOAPBinding.SOAP12HTTP_BINDING)	//����SOAP1.2��Ҫ���������jar
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		System.out.println("from client" + cityName);
		String weather = "��";
		return weather;
	}

}
