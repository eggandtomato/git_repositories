package com.hzit.servlet.base;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaseServlet
 */
public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BaseServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// 1.获取方法名
			String methodName = request.getParameter("method");
			System.out.println("请求方法："+methodName);
			// 1.1判断参数是否为空
			if (methodName == null || methodName.trim().length() == 0) {
				methodName = "index";
			}
			// 2.获取方法对象
			Method method = this.getClass().getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
			// 3.执行方法 ，接受方法返回值
			String path = (String) method.invoke(this, request, response);
			// 4.判断返回值是否为空，若为不空统一处理
			if (path != null) {
				request.getRequestDispatcher(path).forward(request, response);
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String index(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("执行了Index(),客户请求路径为空");
		return null;
	}

}
