<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="writeOk.do" method="post">
		<table>
			<tr>
				<th>글제목 : </th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>내용 : </th>
				<td><textarea name="content" cols="40" rows="10"></textarea></td>
			</tr>
			<tr>
				<th>첨부파일 : </th>
				<td><input type="file"></td>
				<td>취소</td>
			</tr>
		</table>
		<button>작성</button>
	</form>
		<button>취소</button>
</body>
</html>