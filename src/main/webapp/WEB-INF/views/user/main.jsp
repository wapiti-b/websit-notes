<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>

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
<link rel="stylesheet" href="<%=path%>/static/css/main.css"
	type="text/css">
	<style type="text/css">
	.name{
		float:right;
		
		height:3em;
		width:4em;
		text-align:right;
		padding-top:0.9em;
		text-decoration:none;
		
	}
	.name a{
		text-decoration:none;
	}
	</style>

</head>

<body>
	<div id="page">
		<div id="python-toolbar">
			<div id="container_tool">
				<ul>
					<li><a href="main" >查看文章</a></li>
					<li><a href="info/insert" target="mainFrame" onclick="demo()">发布文章</a></li>
					<li><a >社区</a></li>
					<li><a >文档</a></li>
					<li><a >资源下载</a></li>
				</ul>

			</div>
			<div id="user-login">
				<c:choose>
					<c:when test="${sessionScope.username != null}">
						<div class="login">
						
							<a id="logout" href="setting/manage"  target="mainFrame"><img src="<%=path%>/static/userImg/default.jpg" style="height:31px;" alt="">
								
								<div class="ul">
									<object>
										<a href="setting/manage" target="mainFrame">个人中心</a><br>
									</object>
									
									<object>
										<a href="article/my"  target="mainFrame">我的文章</a><br>
									</object>
									
									
									<object>
										<a href="setting/changePw" target="mainFrame">修改密码</a><br>
									</object>
									
									<object>
										<a href="main" >我的关注</a><br>
									</object>
									
									<object>
										<a href="main" >我的收藏</a><br>
									</object>
				
									
									
									<object>
										<a href="main" >帮 &nbsp;&nbsp;助</a><br>
									</object>
									

									<object>
										<a href="logout" >退 &nbsp;&nbsp;出</a><br>
									</object>
									
									
								</div>
							</a>
							<div class="name"><a href="setting/manage" target="mainFrame">${sessionScope.username}:</a></div>
						</div>
					</c:when>
					<c:otherwise>
						<div class="login">
							<a id = "logout1" style=":hover{background-color: lightgrey;}" href="login" target="mainFrame" >登录/注册</a>
						</div>
					</c:otherwise>
				</c:choose>

			</div>

		</div>
<!-- 		<div id="python-body">
			<iframe class="main" onload="this.height=this.contentWindow.document.body.scrollHeight" 
			frameborder="0" width="100%" name="mainFrame" src="boke" ></iframe>
		</div> -->
		
					<iframe class="main" onload="this.height=this.contentWindow.document.body.scrollHeight" 
			frameborder="0" width="100%" name="mainFrame" src="boke" allowtransparency="true" style="background-color:#EDEDED"; height="600px"></iframe>

	</div>

<script>
    function demo() {
    	var userId = '<%=request.getSession().getAttribute("userId")%>';
    	if(userId == null || userId =="null"){
    		alert("请先登录");  	
    	}
    }

</script>
</body>
</html>