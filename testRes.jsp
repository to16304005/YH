<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
<link rel="stylesheet" href="res.css">
<html>
<head><title>�ꂷ�Ƃ�</title></head>
	<body background="img2.png">




		<div style="text-align:center">
	<img src="img.png" width="500" height="150" alt="">
	</div>
	<h1>${tname}</h1>
	<a href="#toukou">�R�����g���e��</a>

	<c:forEach var="res" items="${res}">

		<table>
			<tr><th>${res.resId}</th>
			<tr><td>${res.resDate}</td><td>${res.Contents}</td>
		</table>
		<hr>
	</c:forEach>


	<a name="toukou"> <h2>�R�����g</h2>
	<form method="POST" action="ResServlet">
	<textarea name="ResContent" ></textarea>
		<br>
		<input type="submit" value="���e�����`" />
	</a>
	</form>
</body>
</html>
