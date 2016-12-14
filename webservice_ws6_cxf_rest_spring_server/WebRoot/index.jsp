<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
    <script type="text/javascript">
	function queryStudent(){
		//创建XMLHttpRequest对象
		var xhr = new XMLHttpRequest();
		//打开连接
		xhr.open("get","http://localhost:8080/webservice_ws6_cxf_rest_spring_server/ws/user/student/queryList/114",true);
		//设置回调函数
		xhr.onreadystatechange=function(){
			//判断是否发送成功和判断服务端是否响应成功
			if(4 == xhr.readyState && 200 == xhr.status){
				alert(eval("("+xhr.responseText+")").studentName[0].birthday);
			}
		}
		//发送数据
		xhr.send(null);
	}
  </script>
  
  <body>
    <input type="button" value="查询" onclick="queryStudent()"/>
  </body>
</html>
