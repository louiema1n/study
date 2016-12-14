package com.lm.ws.rest.spring.server;

import java.util.List;

import javax.jws.WebService;
import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lm.ws.rest.spring.domain.Student;


/**
 * ѧ���ӿ�
 * @author ly
 *
 */
@WebService
@Path("/student")										//��������·���е�"/student"ӳ�䵽�ӿ���
public interface StudentInterface {
	
	//��ѯ����ѧ��
	@GET												//ָ������ʽ,����������������һ��
	@Produces(MediaType.APPLICATION_XML)				//ָ����������
	@Path("/query/{id}")								//������·���е�"/queryӳ�䵽����;"/{id}"������յ��Ĳ���;�������ʱ"/{id}/{id}/{id}"
	public Student query(@PathParam("id")Long id);		//�������ʱ@PathParam("id")String id, @PathParam("id2")String id2
	
	//��ѯ���ѧ��
	@GET
	@Produces("application/json;charset=utf-8")			//����JSon��������    MediaType.APPLICATION_JSON == "application/json"
	@Path("/queryList/{name}")
	public List<Student> queryList(@PathParam("name")String name);
	
}
