<%@ page pageEncoding="Windows-31J"
	contentType="text/html;chareset=Windows-31J" %>
	<link rel="stylesheet" href="thread.css">

<html>
<head><title>すれたて</title></head>
<body background="haikei.png">
	<div style="text-align:center">
	<img src="img.png" width="500" height="150" alt="">
	</div>
	<h1> スレ作成ページ</h1>
	<form method="POST" action="ThreadServlet">
		<h3>スレ名を入れてね</h3>

		<textarea name="ThreadName" ></textarea><br><br>
		<input type="submit" value="スレ立てるよ~" />
	</form>
</body>
</html>
