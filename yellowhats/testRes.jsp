<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="design/res.css">

<html>
<head>
<title>レス投稿</title>
</head>
	<body>
		<img src="design/obi2.png"height="120"width="1336">
		<div style="position:aboslute; top:126;left:100px;">
		<a href="http://localhost:510/yhtest/ThreadServlet">スレ一覧へ</a></div>
			<img src="design/asd.png"width="400" height="200">
			

	<h1>${tname}</h1>
	<a href="#toukou">コメント投稿へ</a>
	<% try{ %>
	<c:forEach var="res1" items="${res}">

		<table>
			<tr><th>${res1.resId}</th><td>${res1.resName}</td><td>${res1.resDate}</td></tr>
			<tr><td colspan="3">${res1.resContents}</td></tr>
		</table>
		<hr>
	</c:forEach>
	<% }catch(Exception e){
				e.printStackTrace();
				System.out.println("forEachで例外");
	   } %>

	<a name="toukou"> <h2>コメント</h2>
	<form method="POST" action="ResServlet?id=<%=request.getParameter("id")%>&tname=<%=request.getParameter("tname") %>">
	<textarea name="ResContent"></textarea>
		<br>
		<input type="hidden" name="threadId"  value="<%=request.getParameter("id") %>" />
		<input type="submit" value="投稿" />
	</form>
	</a>
	<%@ include file="login.jsp" %>
</body>
</html>
