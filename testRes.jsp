<%@ page pageEncoding="Windows-31J"
	contentType="text/html;chareset=Windows-31J" %>
<link rel="stylesheet" href="res.css">
<html>
<head><title>�ꂷ�Ƃ�</title></head>
	<body background="img2.png">




		<div style="text-align:center">
	<img src="img.png" width="500" height="150" alt="">
	</div>
	<h1>�X���b�h��</h1>
	<form method="POST" action="ResServlet">
	<c:forEach var="res" items="${res}">

		<table>
			<tr><th>����������</th>
			<tr><td>����</td><td>���e</td>
		</table>
		<hr>
	</c:forEach>
	<a href="#toukou">�R�����g���e��</a>

	<a name="toukou"> <h2>�R�����g</h2>
	<textarea name="ResContent" ></textarea>
		<br>
		<input type="submit" value="���e�����`" />
	</a>
	</form>
</body>
</html>
