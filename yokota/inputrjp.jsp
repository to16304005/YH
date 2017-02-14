<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
	
<html>
<head><title>RJP表示テスト</title></head>
<body>
	<h1>掲示板</h1>
	<form method="get" action="rjpServlet">
		<input type="submit" value="スレ表示" />
	</form>
	
	<form method="get" action="rjpResServlet">
		<input type="text" name="threadid" />
		<input type="submit" value="レス表示" />
	</form>	
</body>
</html>
