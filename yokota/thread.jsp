<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J"
	import="java.util.*,rjptest.*" %>
	
<html>
<head><title>���[�U�[�o�^</title></head>
<body>

	<h1>�X���b�h�̈ꗗ</h1>
		<% ArrayList<ThreadBean> list = (ArrayList<ThreadBean>)request.getAttribute("thread");
  		for(ThreadBean tb:list){
		  	out.print(tb.getThreadName());
  		} %>

		
</body>
</html>
