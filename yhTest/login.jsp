<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J"
	import="pac.*" %>

<% UserBean loginUser = (UserBean)session.getAttribute("loginUser"); %>

  <div style="position:fixed;right:0;top:0;">

		<% if(loginUser == null) { %>
			<form method="post" action="LoginServlet">
				<p>ログインフォーム</p>
				<input type="text" name="id" placeholder="ログインIDを入力" /><br>
				<input type="password" name="pass" placeholder="パスワードを入力" /><br>
				<input type="submit" value="ログイン" />
			</form>
			<form method="post" action="CreateAccountServlet">
				<p>アカウント作成</p>
				<input type="text" name="id" placeholder="ID" /><br>
				<input type="password" name="pass" placeholder="パスワード" /><br>
				<input type="submit" value="アカウント作成" />
			</form>
			<% if(request.getAttribute("mess") != null ){ %>
				<p>${mess}</p>
			<% } %>

		<% }else{ %>
			<p>ようこそ<%= loginUser.getUserName() %>さん</p><br>
			<form method="get" action="LoginServlet">
				<input type="submit" value="ログアウト"　/>
			</form>
		<% } %>


	</div>
