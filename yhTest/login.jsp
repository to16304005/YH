<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J"
	import="pac.*" %>

<% UserBean loginUser = (UserBean)session.getAttribute("loginUser"); %>

  <div style="position:fixed;right:0;top:0;">

		<% if(loginUser == null) { %>
			<form method="post" action="LoginServlet">
				<p>���O�C���t�H�[��</p>
				<input type="text" name="id" placeholder="���O�C��ID�����" /><br>
				<input type="password" name="pass" placeholder="�p�X���[�h�����" /><br>
				<input type="submit" value="���O�C��" />
			</form>
			<form method="post" action="CreateAccountServlet">
				<p>�A�J�E���g�쐬</p>
				<input type="text" name="id" placeholder="ID" /><br>
				<input type="password" name="pass" placeholder="�p�X���[�h" /><br>
				<input type="submit" value="�A�J�E���g�쐬" />
			</form>
			<% if(request.getAttribute("mess") != null ){ %>
				<p>${mess}</p>
			<% } %>

		<% }else{ %>
			<p>�悤����<%= loginUser.getUserName() %>����</p><br>
			<form method="get" action="LoginServlet">
				<input type="submit" value="���O�A�E�g"�@/>
			</form>
		<% } %>


	</div>
