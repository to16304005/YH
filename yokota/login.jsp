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
				<a href="javascript:void(0)" id="category_�܂肽����A" onclick="show('�܂肽����A');">
				<p>���O�C���t�H�[��</p></a>
				<div id="layer_�܂肽����A" style="display: none;position:relative;margin-left:15pt" class="close">
				<input type="text" name="id" placeholder="���O�C��ID�����" /><br>
				<input type="password" name="pass" placeholder="�p�X���[�h�����" /><br>
				<input type="submit" value="���O�C��" />
			</form></div><br>

			<form method="post" action="CreateAccountServlet">
					<a href="javascript:void(0)" id="category_�܂肽����B" onclick="show('�܂肽����B');">
				<p>�A�J�E���g�쐬</p></a>
				<div id="layer_�܂肽����B" style="display: none;position:relative;margin-left:15pt" class="close">
				<input type="text" name="id" placeholder="ID" /><br>
				<input type="password" name="pass" placeholder="�p�X���[�h" /><br>
				<input type="submit" value="�A�J�E���g�쐬" />
			</form></div>
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
