<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ include file="./include/header.jsp" %>
	<sec:authorize access="isAnonymous()"><!-- 로그인 X -->
		<div style="font-size:18px; text-decoration: none; color:black; font-weight: bold;">
			<a href="join.do">회원가입</a> |   <!-- 첫 관리자 회원가입하기위해 만든부분. 가입 후 주석처리하면 됩니다 --> 
			<a href="login.do">로그인</a><br>
		</div>
	</sec:authorize>
	<sec:authorize access="isAuthenticated()"><!-- 로그인 O -->
		<sec:authentication property="principal.user_authority"/>
		<div style="font-size:18px; text-decoration: none; color:black; font-weight: bold;">
			<a href="logout.do">로그아웃</a><br>
			<sec:authorize access="hasAnyRole('ROLE_ADMIN')">
				<!-- 관리자 페이지 -->
			</sec:authorize>
		</div>
	</sec:authorize>
	
</body>
</html>