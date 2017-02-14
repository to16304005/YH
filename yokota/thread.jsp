<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J"
	import="java.util.*,rjptest.*" %>
	
<html>
<head><title>ユーザー登録</title></head>
<body>

	<h1>スレッドの一覧</h1>
		<% ArrayList<ThreadBean> list = (ArrayList<ThreadBean>)request.getAttribute("thread");
  		for(ThreadBean tb:list){
		  	out.print(tb.getThreadName());
  		} %>

		
</body>
</html>
