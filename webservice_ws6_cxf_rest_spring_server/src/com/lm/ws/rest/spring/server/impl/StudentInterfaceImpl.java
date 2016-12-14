package com.lm.ws.rest.spring.server.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lm.ws.rest.spring.domain.Student;
import com.lm.ws.rest.spring.server.StudentInterface;


public class StudentInterfaceImpl implements StudentInterface {

	public Student query(Long id) {
		Student st = new Student();
		
		st.setId(110L);
		st.setName("����");
		st.setBirthday(new Date());
		
		return st;
	}

	public List<Student> queryList(String name) {
		Student st = new Student();
		
		st.setId(110L);
		st.setName("����");
		st.setBirthday(new Date());
		
		Student st2 = new Student();
		
		st2.setId(120L);
		st2.setName("����");
		st2.setBirthday(new Date());
		
		List<Student> list = new ArrayList<Student>();
		list.add(st);
		list.add(st2);
		
		return list;
	}

}
