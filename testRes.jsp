<%@ page pageEncoding="Windows-31J"
	contentType="text/html;chareset=Windows-31J" %>
<link rel="stylesheet" href="res.css">
<html>
<head><title>れすとう</title></head>
	<body background="img2.png">




		<div style="text-align:center">
	<img src="img.png" width="500" height="150" alt="">
	</div>
	<h1>スレッド名</h1>
	<form method="POST" action="ResServlet">
	<c:forEach var="res" items="${res}">

		<table>
			<tr><th>名無しさん</th>
			<tr><td>日時</td><td>内容</td>
		</table>
		<hr>
	</c:forEach>
	<a href="#toukou">コメント投稿へ</a>

	<a name="toukou"> <h2>コメント</h2>
	<textarea name="ResContent" ></textarea>
		<br>
		<input type="submit" value="投稿するよ～" />
	</a>
	</form>
</body>
</html>
