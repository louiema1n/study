package com.lm.ws.rest.server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import com.lm.ws.rest.server.impl.StudentInterfaceImpl;

/**
 * 服务端
 * @author ly
 *
 */
public class StudentServer {

	public static void main(String[] args) {
		//1.创建REST发布服务类
		JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
		//2.1设置服务实现类
		jaxrsServerFactoryBean.setServiceBean(new StudentInterfaceImpl());
		//2.2设置资源类
		jaxrsServerFactoryBean.setResourceClasses(StudentInterfaceImpl.class);
		//2.3设置服务地址
		jaxrsServerFactoryBean.setAddress("http://127.0.0.1:18658/user");
		//3.发布服务
		jaxrsServerFactoryBean.create();
	}
}
