<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
	
<html>
<head><title>���[�U�[�o�^</title></head>
<body>
		<table border="1">
		<c:forEach var="res" items="${res}">
		<tr><td>${res.resContents}</td>
		</c:forEach>


	<h3>���X���e</h3>
	<form method="post" action="ResServlet">
		�X���b�h��:<input type="text" name="res_content" /><br>
		<input type="submit" value="���e" />
	</form>
</body>
</html>
