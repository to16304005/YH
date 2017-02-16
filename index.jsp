<%@ page pageEncoding="Windows-31J"
	contentType="text/html;chareset=Windows-31J" %>
	<link rel="stylesheet" href="index.css">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>TOP</title></head>
<body background="haikei.png">
	<div style="text-align:center">
	<img src="img.png" width="500" height="150" alt="">
	</div>
	<h1>スレッド一覧</h1>
	<form method="POST" action="ThreadServlet">
    <g>
    <table border="1" align="center" style="font-size: 20pt;">
      <tr><th colspan="2">スレッド名だよ～</th></tr>
      <c:forEach var="th" items="${thread}">
      <tr><td>${th.threadName}</td><td>${th.threadCreatedDate}</td>
      </c:forEach>
    </table>
  </g>
	</form>
</body>
</html>
