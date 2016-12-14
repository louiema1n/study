package com.lm.ws.mobile.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lm.ws.mobile.server.MobileInterface;

public class MobileServlet extends HttpServlet {
	
	private MobileInterface mobileServer;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phoneNum = request.getParameter("phoneNum");
		if(null != phoneNum && !"".equals(phoneNum)){
			ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
			mobileServer = (MobileInterface) context.getBean("mobileServer");
			String result = mobileServer.queryMobile(phoneNum);
			request.setAttribute("result", result);
		}
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}