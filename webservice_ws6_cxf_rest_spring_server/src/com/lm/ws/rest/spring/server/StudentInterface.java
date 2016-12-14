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
 * 学生接口
 * @author ly
 *
 */
@WebService
@Path("/student")										//将请求中路径中的"/student"映射到接口上
public interface StudentInterface {
	
	//查询单个学生
	@GET												//指定请求方式,浏览器请求必须与其一致
	@Produces(MediaType.APPLICATION_XML)				//指定服务类型
	@Path("/query/{id}")								//将请求路径中的"/query映射到方法;"/{id}"代表接收到的参数;多个参数时"/{id}/{id}/{id}"
	public Student query(@PathParam("id")Long id);		//多个参数时@PathParam("id")String id, @PathParam("id2")String id2
	
	//查询多个学生
	@GET
	@Produces("application/json;charset=utf-8")			//返回JSon类型数据    MediaType.APPLICATION_JSON == "application/json"
	@Path("/queryList/{name}")
	public List<Student> queryList(@PathParam("name")String name);
	
}
