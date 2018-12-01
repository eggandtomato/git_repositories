<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script type="text/javascript">
	function logout() {
		if (confirm('您确定要退出系统吗？')) {
			window.location.href = 'student?method=logout';
		}
	}

	function logout2() {
		if (confirm('您确定要退出系统吗？')) {
			window.location.href = 'manager?method=logout';
		}
	}
</script>
<div class="navbar">
	<div class="navbar-inner">
		<a class="brand" href="main.jsp">首页</a>
		<ul class="nav">
			<c:choose>
				<c:when test="${userLevel==0}">
					<li><a href="${pageContext.request.contextPath}/student?method=showAllStudents">考生信息管理</a>
					</li>
					<li><a href="${pageContext.request.contextPath}/exam!examList">考生成绩查询</a>
					</li>
					<li><a
						href="${pageContext.request.contextPath}/paper!paperList">试卷管理</a>
					</li>
					<li><a href="${pageContext.request.contextPath}/question!list">题目管理</a>
					</li>
					<li><a href="javascript:logout2()">退出系统</a></li>
				</c:when>
				<c:otherwise>
					<li><a
						href="${pageContext.request.contextPath}/paper?method=examType">在线考试</a>
					</li>
					<li><a
						href="${pageContext.request.contextPath}/examScore?method=getExams">成绩查询</a>
					</li>
					<li><a
						href="${pageContext.request.contextPath}/dispatcher?method=dispatch&&action=student/updatePassword">修改密码</a>
					</li>
					<li><a href="javascript:logout()">退出系统</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>
</div>