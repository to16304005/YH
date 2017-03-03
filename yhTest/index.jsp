<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title>TOP</title>
	<link rel="stylesheet" href="index.css">
</head>
<body>
	<img src="obi2.png"height="120"width="1350">
		<div style="position:absolute; top:126px; left:50px;">

	<table border="2">
		<td><a href="">ƒXƒŒˆê——‚Ö</a></td>
			</table>
		</div>

		<div style="position:absolute; top:126px; left:150px;">

	<table border="2">
			<td><a href="">ƒwƒ‹ƒvƒy[ƒW‚Ö</a></td>
	</table>
 </div>
</div>
<br>
		<br>
		<hr>
	<img src="asd.png"width="400" height="200">
		<div id="super">
	<h1>ƒXƒŒƒbƒhˆê——</h1>
	<form method="POST" action="ThreadServlet">
		<input type="text" name="ThreadName" €/><input type="submit" value="ƒXƒŒƒbƒh‚ğ—§‚Ä‚é" />
	</form>
    <table border="1" align="center" style="font-size: 20pt;">
      <tr><th>ƒXƒŒƒbƒh–¼</th><th>ì¬“ú</th></tr>
			<% try{ if(request.getAttribute("thread")==null){
						response.sendRedirect("ThreadServlet");} %>
      <c:forEach var="th" items="${thread}">
      <tr><td><a href="ResServlet?id=${th.threadId}&tname=${th.threadName}">${th.threadName}</a></td><td>${th.threadCreatedDate}</td></tr>
      </c:forEach>
			<% }catch(Exception e){
			   } %>
    </table>
		<%@ include file="login.jsp" %>
		<div/>
</body>
</html>
