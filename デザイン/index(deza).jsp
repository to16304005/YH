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
      <tr><th colspan="2">�X���b�h������`</th></tr>
      <c:forEach var="thread" items="${thread}">
      <tr><td>�X���b�h��</td><td>�ŏI�X�V����</td><hr>
      </c:forEach>
    </table>
</g>
	</form>
</div>
<div id="a" style="right:130px; top:500px;position:absolute">
	<div id="sub">

			<!--�E���ʃ��j���[�^�u-->
				<table border="1"><th>
					<h2></h2>
				<h3>MENU</h3>
				<ul>
				<li><a href="">�X���ꗗ��</a></li>
				<li><a href="">�w���v�y�[�W��</a></li>
				<br>
				<li>���O�C��</a></li>
				<form method="post" action="">
<li>���[�U�[�l�[��:<input type="text" name="http://localhost:510/yhTest/index" /></li>
<li>�p�X���[�h�F   <input type="text" name=""/></li>
<li><input type="submit" value="�o�^" /></li></from>
				</ul></th></table>
		</div>
	</div>
<br>
<br>

</body>
</html>
