<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
	<section>
		<h2>공지사항 뷰 페이지</h2>
		<table>
			<tr>
				<th>제목 : </th>
				<td>${vo.post_title }</td>
			</tr>
			<tr>
				<th>프로필이미지</th>
				<%-- <td>${vo. }</td> --%>
				<th>작성자 : </th>
				<td>${vo.post_title }</td>
				<th>댓글 개수 </th>
			</tr>
			<tr>
				<th>내용 : </th>
				<td>${vo.post_content}</td>
			</tr>
		</table>
		<button onclick="document.modifyfrm.submit();">수정</button>
		<form name="modifyfim" action="modify.do" method="get">
			
		</form>
		
		<button onclick="document.deletefrm.submit();">삭제</button>
		<form name="deletefrm" action="delete.do" method="post">
			<input type="hidden" name="post_no" value="${vo.post_no }">
		</form>
		
	<button>목록으로</button>
	</section>
</body>
</html>