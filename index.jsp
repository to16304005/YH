<%@ page pageEncoding="Windows-31J"
	contentType="text/html;chareset=Windows-31J" %>
	<link rel="stylesheet" href="index.css">

<html>
<head><title>TOP</title></head>
<body background="haikei.png">
	<div style="text-align:center">
	<img src="img.png" width="500" height="150" alt="">
	</div>
	<h1>�X���b�h�ꗗ</h1>
	<form method="POST" action="ThreadServlet">
    <g>
    <table border="1" align="center" style="font-size: 20pt;">
      <tr><th colspan="2">�X���b�h������`</th></tr>
      <c:forEach var="thread" items="${thread}">
      <tr><td>�X���b�h��</td><td>�ŏI�X�V����</td>
      </c:forEach>
    </table>
  </g>
	</form>
</body>
</html>
