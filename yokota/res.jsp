<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" 
	import="java.util.*,rjptest.*" %>
	
<html>
<head><title>���[�U�[�o�^</title></head>
<body>
	<h1>���X���e</h1>
		<% ArrayList<ResBean> list = (ArrayList<ResBean>)request.getAttribute("res");
  		for(ResBean rb:list){
		  	out.print(rb.getResId());
		  	out.print(rb.getResContents());
		  	out.print(rb.getResDate());
  		} %>
		

</body>
</html>
