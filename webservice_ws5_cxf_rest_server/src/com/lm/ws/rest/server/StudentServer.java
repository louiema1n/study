package com.lm.ws.rest.server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import com.lm.ws.rest.server.impl.StudentInterfaceImpl;

/**
 * �����
 * @author ly
 *
 */
public class StudentServer {

	public static void main(String[] args) {
		//1.����REST����������
		JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
		//2.1���÷���ʵ����
		jaxrsServerFactoryBean.setServiceBean(new StudentInterfaceImpl());
		//2.2������Դ��
		jaxrsServerFactoryBean.setResourceClasses(StudentInterfaceImpl.class);
		//2.3���÷����ַ
		jaxrsServerFactoryBean.setAddress("http://127.0.0.1:18658/user");
		//3.��������
		jaxrsServerFactoryBean.create();
	}
}
