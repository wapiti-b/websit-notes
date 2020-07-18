<%@ page language="java" import="com.promote.website.model.User" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%User user = (User)request.getSession().getAttribute("user");%>

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
<%-- <link rel="stylesheet" href="<%=path %>/static/css/regester.css" type="text/css"> --%>
<style>
#cent {
	width: 400px;
	height: 300px;
	margin: 100px auto 0;
	/* background-color:lightgray; */
	border:1px lightgray solid;
	text-align:left;
	padding-left:3em;
}
</style>
</head>

<body>
	<div id="cent">
		<h4 align="center">个人中心</h4>
		<label>昵称：</label> <label>${userMessage.username }</label>
		<br> <br>
		<label>头像：</label> <label><img src="<%=path%>/static/userImg/default.jpg" style="height:31px;" alt=""></label>
		<br><br>

		<label>邮箱：</label> <label>${userMessage.emil }</label>		
		<br><br>
		<label>最近登录时间：</label>
		<label>${userMessage.lasttime }</label>
		<br><br>
		
		<a href="main" target="_parent" >返回</a>

	</div>
<!-- 	<script>
	function return(){
		window.location.href="main.jsp";
		
	}
	</script> -->
</body>
</html>
