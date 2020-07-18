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
<link rel="stylesheet" href="<%=path%>/static/css/regester.css"
	type="text/css">
</head>

<body>
	<form id="register" action="register" method="post"
		onsubmit="return check()">
		<div id="div1">
			<H2 id="title">注 册</H2>
			<div class="user">
				<span>昵称：</span> <span><input id="username" class="main"
					name="username" type="text" placeholder="请输入用户名"></span>
			</div>
			<div class="passworld">
				<span>密码：</span> <span><input id="password1" class="main"
					name="password" type="password" placeholder="请输入密码"></span>
			</div>
			<div class="passworld">
				<span>密码：</span> <span><input id="password2" class="main"
					name="password2" type="password" placeholder="请确认密码"></span>
			</div>
			<div class="passworld">
				<span>邮箱：</span> <span><input id="email" class="main"
					name="email" type="text" placeholder="请输入邮箱"></span>
			</div>
			<div id="bs">
				<span><input class="buttens1" type="submit" value="注册"></span>
				<span><input class="buttens2" type="button" value="重置" onclick="formReset()"></span>
			</div>
			<div id="xxx">
				<span><a href="login">去登录</a></span>
				<!--  <span> &nbsp;|&nbsp; </span>
        a标签是重定向
        <span><a href="login">返回</a></span> -->
			</div>
		</div>
	</form>
	<script type="text/javascript">
		function check() {
			var user = document.getElementById("register");
			var u = document.getElementById("username").value;
			var p1 = document.getElementById("password1").value;
			var p2 = document.getElementById("password2").value;
			var e = document.getElementById("email").value;
			if (u.length == 0 || p1.length == 0 || p2.length == 0) {
				alert("请完善信息");
				return false;
			} else if (p1.length < 6) {
				alert("密码长度不能少于六位");
				return false;
			} else if (p2 != p1) {
				alert("两次输入密码不一致");
				return false;
			}
			alert("注册成功，请登陆");
			return true;
		}
		function formReset()
		{
		document.getElementById("register").reset()
		}
	</script>
</body>
</html>
