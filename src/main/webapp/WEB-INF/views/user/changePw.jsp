<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'regester.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="<%=path%>/static/css/changePw.css"
	type="text/css">
	
	<script>
		<%-- var message = <%=request.getAttribute("message")%>;
		alert(message);
		if(message != null){
			alert(message);
		}else{
			alert("hahhahahhah");
		}	 --%>
	</script>
	

</head>

<body>
<%-- <p align=center style> <%=request.getAttribute("message")%></p>

 --%>
	<form action="setting/changePw"  id ="changepw" method="post" target="_parent" onsubmit="return check()">

		<div id="div1">
			<H2 id="title">修改密码</H2>
			<div class="user">
				<span>昵称：</span> <span><input id="username" name="username" class="main"
					type="text" readonly="readonly" value="${sessionScope.username}"></span>
			</div>
			<div class="passworld">
				<span>原始密码：</span> <span><input id="password1" name="password1"  class="main"
					type="password" placeholder="输入原始密码"></span>
			</div>
			<div class="passworld">
				<span>新密码：</span> <span><input id="password2" name="password2"  class="main"
					type="password" placeholder="输入新密码"></span>
			</div>
			<div class="passworld">
				<span>确认密码：</span> <span><input id="password3" name="password3"  class="main"
					type="password" placeholder="输入新密码"></span>
			</div>
			<div style="height:1em">
			<p align=center >${requestScope.message}</p>
			</div>
			<div id="bs">
				<span><input class="buttens1" type="submit" value="确定"></span>
				<span><input class="buttens2" type="button" value="重置" onclick="formReset()"></span>
			</div>
			<div id="xxx">
				<!-- a标签是重定向 -->
				<span><a href="main" target="_parent" >返回</a></span>
			</div>
		</div>
	</form>
	<script type="text/javascript">
	function formReset()
	{
	document.getElementById("changepw").reset()
	}
		function check() {
			var u = document.getElementById("username").value;
			var p1 = document.getElementById("password1").value;
			var p2 = document.getElementById("password2").value;
			var p3 = document.getElementById("password3").value;
			/*        alert(u.length);*/

			if (p1.length == 0 || p2.length == 0 || p3.length == 0) {
				alert("请完善信息");
				return false;
			} else if (p1.length < 6 || p2.length < 6) {
				alert("密码长度不能少于六位");
				return false;
			} else if (p2 != p3) {
				alert("两次输入密码不一致");
				return false;
			}else if (p3 == p1) {
				alert("新密码与旧密码不能相同");
				return false;
			}
			return true;
		}
	</script>
</body>
</html>