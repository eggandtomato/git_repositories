package com.hzit.servlet;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hzit.servlet.base.BaseServlet;

/**
 * Servlet implementation class Dispatcher
 */
public class Dispatcher extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
	public String dispatch(HttpServletRequest request, HttpServletResponse response) {
		String action = request.getParameter("action");
		System.out.println("action="+action);
		String data = null;
		if(action!=null||action.length()!=0) {
			data = action+".jsp";
		}
		request.setAttribute("mainPage", data);
		return "main.jsp";
	}

}
