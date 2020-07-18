<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	String path = request.getContextPath();

	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="<%=path%>/static/css/login.css"
	type="text/css">

<script type="text/javascript">
	
</script>

</head>

<body>
	<form id="login" action="login" method="post" target="_parent"onsubmit="return check()">
		<div id="div1">
			<H2 id="title">注 册 / 登 录</H2>


			<div class="user">
				<span><img src="<%=path%>/static/images/login_01.png"></span>
				<span><input id="username" class="main" name="user"
					type="text" placeholder="请输入用户名"></span>
			</div>
			<div class="passworld">
				<span><img src="<%=path%>/static/images/login_02.png"></span>
				<span><input id="password" class="main" name="password"
					type="password" placeholder="请输入密码"></span>
			</div>

			<div id="message">
				<p align=center style="color: red">
					<c:if test="${requestScope.result != null}">
        	
        	   ${requestScope.result }
        	</c:if>
				</p>
			</div>


			<div id="bs">
				<span><input class="buttens1" type="submit" value="登录"></span>
				<span><input class="buttens2" type="button" value="重置" onclick="formReset()"></span>
			</div>
			<div id="xxx">

				<!-- <span><a >忘记密码</a></span>  -->
				<!-- <span>
					&nbsp;|&nbsp; </span> -->
					 <span><a href="register">注册</a></span>
				



			</div>



		</div>
	</form>
	<script type="text/javascript">
		function check() {

			var u = document.getElementById("username").value;
			var p = document.getElementById("password").value;

			if (u.length == 0 || p.length == 0) {
				alert("请完善信息");
				return false;
			}
			return true;
		}
		
		function formReset()
		{
		document.getElementById("login").reset()
		}
	</script>

</body>
</html>
