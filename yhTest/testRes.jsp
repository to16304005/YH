<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
<title>�ꂷ�Ƃ�</title>
<link rel="stylesheet" href="res.css">
</head>
	<body background="img2.png">

		<div style="text-align:center">
	<img src="img.png" width="500" height="150" alt="">
	</div>
	<h1>${tname}</h1>
	<a href="#toukou">�R�����g���e��</a>
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
				System.out.println("forEach�ŗ�O");
	   } %>

	<a name="toukou"> <h2>�R�����g</h2>
	<form method="POST" action="ResServlet?id=<%=request.getParameter("id")%>&tname=<%=request.getParameter("tname") %>">
	<textarea name="ResContent"></textarea>
		<br>
		<input type="hidden" name="threadId"  value="<%=request.getParameter("id") %>" />
		<input type="submit" value="���e�����`" />
	</form>
	</a>
	<%@ include file="login.jsp" %>
</body>
</html>
