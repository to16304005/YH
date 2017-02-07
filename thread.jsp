<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
	
<html>
<head><title>ユーザー登録</title></head>
<body>

	<h1>スレッドの一覧</h1>
		<table border="1">
		<c:forEach var="thread" items="${thread}">
		<tr><td>${thread.threadName}</td>
		</c:forEach>
		
</body>
</html>
