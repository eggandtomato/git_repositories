package com.hzit.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hzit.entity.Manager;
import com.hzit.entity.Student;
import com.hzit.servlet.base.BaseServlet;
import com.hzit.util.HBUtil;

public class ManagerServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public String login(HttpServletRequest request, HttpServletResponse response) {

		String userName = request.getParameter("manager.userName");
		String password = request.getParameter("manager.password");
		System.out.println("用户：" + userName + "。。。正在登录。。。");
		Session session = HBUtil.getCurrentSession();
		Transaction ts = session.beginTransaction();
		try {
			Manager result = (Manager) session
					.createQuery("from Manager m where m.userName=:name and m.password = :password")
					.setString("name", userName).setString("password", password).uniqueResult();

			ts.commit();
			if (result != null) {
				HttpSession httpSession = request.getSession(true);

				httpSession.setAttribute("userLevel", 0);

				httpSession.setAttribute("currentUser", result);

				return "main.jsp";
			} else {
				request.setAttribute("error", "账号或者密码错误!");
				return "login2.jsp";
			}
		} catch (Exception e) {

			System.out.println("login:rollback");
			e.printStackTrace();
			ts.rollback();
		}

		return null;

	}
}
