<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J"
	import="pac.*" %>

	<script language=javascript>
<!--
function show(inputData){
    var objID=document.getElementById( "layer_" + inputData );
    var buttonID=document.getElementById( "category_" + inputData );
    if(objID.className=='close') {
        objID.style.display='block';
        objID.className='open';
    }else{
        objID.style.display='none';
        objID.className='close';
    }
}
//-->
</script>

<% UserBean loginUser = (UserBean)session.getAttribute("loginUser"); %>

  <div style="position:fixed;right:0;top:150;">

		<% if(loginUser == null) { %>
			<form method="post" action="LoginServlet">
				<a href="javascript:void(0)" id="category_折りたたみA" onclick="show('折りたたみA');">
				<p>ログインフォーム</p></a>
				<div id="layer_折りたたみA" style="display: none;position:relative;margin-left:15pt" class="close">
				<input type="text" name="id" placeholder="ログインIDを入力" /><br>
				<input type="password" name="pass" placeholder="パスワードを入力" /><br>
				<input type="submit" value="ログイン" />
			</form></div><br>

			<form method="post" action="CreateAccountServlet">
					<a href="javascript:void(0)" id="category_折りたたみB" onclick="show('折りたたみB');">
				<p>アカウント作成</p></a>
				<div id="layer_折りたたみB" style="display: none;position:relative;margin-left:15pt" class="close">
				<input type="text" name="id" placeholder="ID" /><br>
				<input type="password" name="pass" placeholder="パスワード" /><br>
				<input type="submit" value="アカウント作成" />
			</form></div>
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
