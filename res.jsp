<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
	
<html>
<head><title>ユーザー登録</title></head>
<body>
		<table border="1">
		<c:forEach var="res" items="${res}">
		<tr><td>${res.resContents}</td>
		</c:forEach>


	<h3>レス投稿</h3>
	<form method="post" action="ResServlet">
		スレッド名:<input type="text" name="res_content" /><br>
		<input type="submit" value="投稿" />
	</form>
</body>
</html>
