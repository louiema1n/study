package com.lm.ws.cxf.weather.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;


/**
 * SEI�ӿ�
 * @author ly
 *
 */

@WebService	//�����ӿ�
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public interface WeatherInterface {
	public String queryWeather(String cityName);
}
