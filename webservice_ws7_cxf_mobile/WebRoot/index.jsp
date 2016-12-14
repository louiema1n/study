<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>手机号归属地查询</title>
  </head>
  
  <body>
    <form action="queryMobile.action" method="post">
    	请输入手机号码至少前7位:<input type="text" name="phoneNum"/><input type="submit" value="查询"/><br/>
    	查询结果:${result}
    </form>
  </body>
</html>
