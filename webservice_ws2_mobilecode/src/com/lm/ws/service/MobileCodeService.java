package com.lm.ws.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import cn.com.webxml.MobileCodeWSSoap;

/**
 * 通过service调用
 * @author ly
 *
 */
public class MobileCodeService {

	public static void main(String[] args) throws IOException {
		//wsdlDocumentLocation是wsdl地址
		URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
		
		//serviceName是服务名称
		QName qname = new QName("http://WebXml.com.cn/", "MobileCodeWS");
		
		//1.创建服务视图
		Service service = Service.create(url, qname);
		//2.获取服务实现类
		MobileCodeWSSoap codeWSSoap = service.getPort(MobileCodeWSSoap.class);
		//3.调用查询方法
		String info = codeWSSoap.getMobileCodeInfo("1528511", "");
		
		System.out.println(info);
	}
	
}
