package com.lm.ws.rest.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 学生实体类
 * @author ly
 *
 */
@XmlRootElement(name="studentName")			//实现对象和XML数据之间的转换
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
