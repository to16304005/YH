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
	<h1>スレッド一覧</h1>
	<form method="POST" action="ThreadServlet">
		<input type="text" name="ThreadName" �/><input type="submit" value="スレッドを立てる" />
	</form>
    <g>
    <table border="1" align="center" style="font-size: 20pt;">
    <tr><th>スレッド名</th><th>作成日</th><th>最終更新日時</th></tr>
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

			<!--右側面メニュータブ-->
				<table border="1"><th>
					<h2></h2>
				<h3>MENU</h3>
				<ul>
				<li><a href="">スレ一覧へ</a></li>
				<li><a href="">ヘルプページへ</a></li>
				<br>
				<li>ログイン</a></li>
				<form method="post" action="">
<li>ユーザーネーム:<input type="text" name="http://localhost:510/yhTest/index" /></li>
<li>パスワード：   <input type="text" name=""/></li>
<li><input type="submit" value="登録" /></li></from>
				</ul></th></table>
		</div>
	</div>
<br>
<br>

</body>
</html>
