<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
	<section>
		<div class="view-container">
			<div class="post-view">
				<c:if test="${param.post_type eq 1}">
					<h2 class="menu-title">공지사항</h2>
				</c:if>
				<c:if test="${param.post_type eq 0}">
					<h2 class="menu-title">사내커뮤니티</h2>
				</c:if>
				<table class="post-table">
						<tr>
							<td class="post-title">제목 </td>
							<td colspan="3">${vo.post_title }</td>
						</tr>
						<tr>
							<td class="post-title">작성자 </td>
							<td>${vo.user_name } ${vo.job_position_name}[${vo.department_name}]</td>
							<td class="post-title">작성일 </td>
							<td>${vo.post_date }</td>
						</tr>
 						<tr>
							<td class="post-content" colspan="99" >${vo.post_content}</td>
						</tr>
				</table>
				<div class="post-actions">
					<c:if test="${sessionScope.SPRING_SECURITY_CONTEXT.authentication.principal.user_id == vo.user_id}">
						<button class="edit-button" onclick="location.href='<%=request.getContextPath() %>/post/modify.do?post_no=${vo.post_no }&post_type=${param.post_type}'">수정</button>
						<button class="delete-button" onclick="document.deletefrm.submit();">삭제</button>
						<form name="deletefrm" action="delete.do" method="post">
							<input type="hidden" name="post_no" value="${vo.post_no }">
						</form>
					</c:if>
					<button class="back-button" onclick="location.href='<%=request.getContextPath() %>/post/list.do?post_type=${param.post_type}'">목록으로</button>
				</div>
				
			</div>
		</div>
	</section>
</body>
</html>