<%@ page pageEncoding="Windows-31J"
	contentType="text/html;chareset=Windows-31J" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="res.css">

<html>
<head><title>レス投稿</title></head>
<body>
<img src="obi2.png"height="120"width="1336">
	<img src="asd.png"width="400" height="200">


	<h1>${tname}</h1>
	<a href="#toukou">コメント投稿へ</a>
	<% try{ %>
	<c:forEach var="res1" items="${res}">

		<table>
			<tr><th>${res1.resId}</th><td>  ${res1.resDate}</td></tr>
			<tr><td colspan="2">${res1.resContents}</td></tr>
		</table>
		<hr>
	</c:forEach>
	<% }catch(Exception e){
				e.printStackTrace();
				System.out.println("forEachで例外");
	   } %>

	<a name="toukou"> <h2>コメント</h2>
	<textarea name="ResContent" ></textarea>
		<br>
		<input type="submit" value="投稿するよ～" />
	</a>

<div id="a" style="right:130px; top:500px;position:absolute">
	<div id="sub">

			<!--右側面メニュータブ-->
				<table border="1"><th>
					<h2></h2>
				<h3>MENU</h3>
				<ul>
				<li><a href="http://localhost:510/rjptest/index">スレ一覧へ</a></li>
				<li><a href="">ヘルプページへ</a></li>
				<li><a href="">ログイン</a></li>
				<form method="post" action="">
<li>ユーザーネーム:<input type="text" name="" /></li>
<li>パスワード:<input type="text" name=""/></li>
<li><input type="submit" value="登録" /></li></from>
				</ul></th></table>
			</div>
		</div>

	</form>
</body>

</html>
