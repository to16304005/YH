<%@ page pageEncoding="Windows-31J"
	contentType="text/html;chareset=Windows-31J" %>
	<link rel="stylesheet" href="index.css">

<html>
<head><title>TOP</title></head>
<body>
	<img src="obi2.png"height="120"width="1340">
		<img src="asd.png"width="400" height="200">
	<h1><cnt><img src="surelist.png"width="400" height="100"></cnt></h1>
	<div id="super">
	<form method="POST" action="ThreadServlet">
    <g>
    <table border="0" align="center" style="font-size: 20pt;">
      <tr><th colspan="2">スレッド名だよ～</th></tr>
      <c:forEach var="thread" items="${thread}">
      <tr><td>スレッド名</td><td>最終更新日時</td><hr>
      </c:forEach>
    </table>
</g>
	</form>
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
