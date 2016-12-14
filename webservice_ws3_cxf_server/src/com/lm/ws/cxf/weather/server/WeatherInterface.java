package com.lm.ws.cxf.weather.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;


/**
 * SEI接口
 * @author ly
 *
 */

@WebService	//发布接口
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public interface WeatherInterface {
	public String queryWeather(String cityName);
}
