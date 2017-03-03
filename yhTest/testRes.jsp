<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="res.css">

<html>
<head>
<title>ƒŒƒX“Še</title>
</head>
	<body>
		<img src="obi2.png"height="120"width="1336">
			<img src="asd.png"width="400" height="200">

	<h1>${tname}</h1>
	<a href="#toukou">ƒRƒƒ“ƒg“Še‚Ö</a>
	<% try{ %>
	<c:forEach var="res1" items="${res}">

		<table>
			<tr><th>${res1.resId}</th><td>${res1.resName}</td><td>  ${res1.resDate}</td></tr>
			<tr><td colspan="2">${res1.resContents}</td></tr>
		</table>
		<hr>
	</c:forEach>
	<% }catch(Exception e){
				e.printStackTrace();
				System.out.println("forEach‚Å—áŠO");
	   } %>

	<a name="toukou"> <h2>ƒRƒƒ“ƒg</h2>
	<form method="POST" action="ResServlet?id=<%=request.getParameter("id")%>&tname=<%=request.getParameter("tname") %>">
	<textarea name="ResContent"></textarea>
		<br>
		<input type="hidden" name="threadId"  value="<%=request.getParameter("id") %>" />
		<input type="submit" value="“Še‚·‚é‚æ`" />
	</form>
	</a>
	<%@ include file="login.jsp" %>
</body>
</html>
