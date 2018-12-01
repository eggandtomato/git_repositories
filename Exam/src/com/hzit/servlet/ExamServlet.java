package com.hzit.servlet;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hzit.entity.Exam;
import com.hzit.entity.Student;
import com.hzit.servlet.base.BaseServlet;

public class ExamServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public String getExams(HttpServletRequest request, HttpServletResponse response) {
//		String studentId = request.getParameter("s_exam.student.id");
		HttpSession session = request.getSession();
		Student currentUser = (Student) session.getAttribute("currentUser");
		request.setAttribute("currentUser", currentUser);
		Set<Exam> exam = currentUser.getExam();
		request.setAttribute("examList", exam);
		request.setAttribute("mainPage", "exam/myExam.jsp");
		return "main.jsp";
	}

}
