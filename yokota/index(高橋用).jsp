<%@ page pageEncoding="Windows-31J"
	contentType="text/html;chareset=Windows-31J" %>
	<link rel="stylesheet" href="index.css">
	

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>TOP</title></head>
<body>
	<img src="obi2.png"height="120"width="1340">
		<img src="asd.png"width="400" height="200">
	<div id="super">
	<h1>ƒXƒŒƒbƒhˆê——</h1>
	<form method="POST" action="ThreadServlet">
		<input type="text" name="ThreadName" €/><input type="submit" value="ƒXƒŒƒbƒh‚ğ—§‚Ä‚é" />
	</form>
    <g>
    <table border="1" align="center" style="font-size: 20pt;">
    <tr><th>ƒXƒŒƒbƒh–¼</th><th>ì¬“ú</th><th>ÅIXV“ú</th></tr>
			<% try{ if(request.getAttribute("thread")==null){
						response.sendRedirect("ThreadServlet");} %>
      <c:forEach var="th" items="${thread}">
      <tr><td><a href="ResServlet?id=${th.threadId}&tname=${th.threadName}">${th.threadName}</a></td><td>${th.threadCreatedDate}</td></tr>
      </c:forEach>
			<% }catch(Exception e){
			   } %>
    </table>
	</g>
	</div>
<div id="a" style="right:130px; top:500px;position:absolute">
	<div id="sub">

			<!--‰E‘¤–Êƒƒjƒ…[ƒ^ƒu-->
				<table border="1"><th>
					<h2></h2>
				<h3>MENU</h3>
				<ul>
				<li><a href="">ƒXƒŒˆê——‚Ö</a></li>
				<li><a href="">ƒwƒ‹ƒvƒy[ƒW‚Ö</a></li>
				<br>
				<li>ƒƒOƒCƒ“</a></li>
				<form method="post" action="">
<li>ƒ†[ƒU[ƒl[ƒ€:<input type="text" name="http://localhost:510/yhTest/index" /></li>
<li>ƒpƒXƒ[ƒhF   <input type="text" name=""/></li>
<li><input type="submit" value="“o˜^" /></li></from>
				</ul></th></table>
		</div>
	</div>
<br>
<br>

</body>
</html>
