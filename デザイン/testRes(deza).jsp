<%@ page pageEncoding="Windows-31J"
	contentType="text/html;chareset=Windows-31J" %>
<link rel="stylesheet" href="res.css">
<html>
<head><title>���X���e</title></head>
<body>
<img src="obi2.png"height="120"width="1336">
	<img src="asd.png"width="400" height="200">


	<h1>�X���b�h��</h1>
	<form method="POST" action="ResServlet">
	<c:forEach var="res" items="${res}">

		<table>
			<tr><th>����������</th>
			<tr><td>����</td><td>���e</td>
		<hr>
	</c:forEach>
</table>
	<a href="#toukou">�R�����g���e��</a>

	<a name="toukou"> <h2>�R�����g</h2>
	<textarea name="ResContent" ></textarea>
		<br>
		<input type="submit" value="���e�����`" />
	</a>

<div id="a" style="right:130px; top:500px;position:absolute">
	<div id="sub">

			<!--�E���ʃ��j���[�^�u-->
				<table border="1"><th>
					<h2></h2>
				<h3>MENU</h3>
				<ul>
				<li><a href="http://localhost:510/yhTest/index">�X���ꗗ��</a></li>
				<li><a href="">�w���v�y�[�W��</a></li>
				<li><a href="">���O�C��</a></li>
				<form method="post" action="">
<li>���[�U�[�l�[��:<input type="text" name="" /></li>
<li>�p�X���[�h:<input type="text" name=""/></li>
<li><input type="submit" value="�o�^" /></li></from>
				</ul></th></table>
			</div>
		</div>

	</form>
</body>

</html>
