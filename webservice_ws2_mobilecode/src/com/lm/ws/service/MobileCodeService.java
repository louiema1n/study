package com.lm.ws.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import cn.com.webxml.MobileCodeWSSoap;

/**
 * ͨ��service����
 * @author ly
 *
 */
public class MobileCodeService {

	public static void main(String[] args) throws IOException {
		//wsdlDocumentLocation��wsdl��ַ
		URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
		
		//serviceName�Ƿ�������
		QName qname = new QName("http://WebXml.com.cn/", "MobileCodeWS");
		
		//1.����������ͼ
		Service service = Service.create(url, qname);
		//2.��ȡ����ʵ����
		MobileCodeWSSoap codeWSSoap = service.getPort(MobileCodeWSSoap.class);
		//3.���ò�ѯ����
		String info = codeWSSoap.getMobileCodeInfo("1528511", "");
		
		System.out.println(info);
	}
	
}
