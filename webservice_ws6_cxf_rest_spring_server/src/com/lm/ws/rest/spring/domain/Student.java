package com.lm.ws.rest.spring.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * ѧ��ʵ����
 * @author ly
 *
 */
@XmlRootElement(name="studentName")			//ʵ�ֶ����XML����֮���ת��
public class Student {

	private Long id;
	private String name;
	private Date birthday;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}