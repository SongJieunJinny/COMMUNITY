<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%= request.getContextPath()%>/resources/css/header.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="header1">
		<img id="logo_img" src="<%= request.getContextPath() %>/resources/img/logo.png" alt="회사로고" >
		<div id = "login_info">
			<a href="<%= request.getContextPath() %>/user/logout.jsp">로그아웃</a>
			|
			<a href="<%= request.getContextPath() %>/user/mypage.jsp">마이페이지</a>
		</div>
	</div>
	<hr>
	<div id="header2">
		<div id="bar">
			<div id="working_info_bar">
				<div id="working_info">근태정보</div><br>
				<div id="working_info">2024-12-05 11:51</div><br>
				<div id="working_info">출근시각 : </div><br>
				<div id="working_info">퇴근시각 : </div>
				<div id="alarm"><img id="alarm_icon" src="<%= request.getContextPath() %>/resources/img/icon/alarm.png" alt="알림"></div>
			</div>
			<div id="menu_bar">
				<div id="menu"><img id="menu_icon" src="<%= request.getContextPath() %>/resources/img/icon/groups.png" alt="조직도"></div>
				<div id="menu"><img id="menu_icon" src="<%= request.getContextPath() %>/resources/img/icon/calendar.png" alt="근태"></div>
				<div id="menu"><img id="menu_icon" src="<%= request.getContextPath() %>/resources/img/icon/talk.png" alt="대화"></div>
				<div id="menu"><img id="menu_icon" src="<%= request.getContextPath() %>/resources/img/icon/setting.png" alt="관리자"></div>
			</div>
		</div>
		<div id="member">
			<img id="member_img" src="<%= request.getContextPath() %>/resources/img/member1.jpeg" alt="회사원1">
			<div id="member_name">JJ417976 홍길자</div>
		</div>
	</div>
	<hr>