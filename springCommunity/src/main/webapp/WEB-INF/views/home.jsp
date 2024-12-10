<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ include file="./include/header.jsp" %>
	
	<table class="menu_table">
		<tr>
			<th><a href="notice/list.do">공지사항</a></th>
			<th><a href="board/list.do">사내 커뮤니티</a></th>
			<th><a href="">나의 부서 업무 상황</a></th>
		</tr>
	</table>
	
</body>
</html>