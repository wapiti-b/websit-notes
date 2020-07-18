<%@page import="java.util.List"%>
<%@ page language="java" import="com.promote.website.model.Info"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Insert title here</title>
<style>
.demo {
	/* 	height: 9em; */
	background-color: white;
	width: 60%;
	margin-left: 5em;
	border-bottom: 1px lightgray solid;
	padding-left: 2em;
	padding-right: 2em;
}

.demo .title {
	height: 1.8em;
	/*   background-color: darkcyan;  */
	font-size: 1.1em;
	overflow: hidden;
}

.demo .title a {
	text-decoration: none;
}

 a:hover {
	color: red;
}

.demo .body {
	height: 1.4em;
	/*   background-color: seashell;  */
	overflow: hidden;
	font-size: 0.8em;
}

.demo .foot {
	height: 1.4em;
	/*  background-color: deepskyblue;  */
	font-size: 0.6em;
}

#titel {
	height: 2.2em;
	background-color: lightgray;
	
}

.bu {
	float: right;
}

.find{
	margin-left:44.8em;
	padding-top:0.3em;
	
	width:25em;
/* 	background-color:blue; */
	
	}
.title-tool{
	/* background-color:red; */
	float:left;
	width:10em;
	font-size:1.5em;
	margin-left:3.5em;
}
.title-tool a{
	text-decoration:none;
	
}
.title-tool a:link{color:red;}
.title-tool a:hover{
	color:black;
}
</style>
</head>
<body>
	<div id="titel">
		<div class="title-tool">
			<a href="main" target="_parent">Python 开发者网站</a>
		</div>
		
		<div class="find">
		<form action="info/findByLike" method="post">
			<input type = "text" name="infoName" placeholder="请输入..">
			<input type="submit" value="搜索">
		</form>
		</div>
	</div>
	<br>
	<c:forEach var="info" items="${infolist}" varStatus="status">
		<div class="demo">
			<div class="title" name="title">
				<a href="info/display?infoId=${info.infoId }">${info.title }</a>
			</div>
			<div class="body" name="infos">${info.infos }</div>
			<div class="foot" name="time">${info.time }
				<div class="bu">
						<a href="info/display?infoId=${info.infoId }">点赞</a><label> | </label>
						<a href="info/display?infoId=${info.infoId }">评论</a><label> | </label>
						<a href="info/display?infoId=${info.infoId }">查看更多</a>
					<%-- <a href="{location.href='info/display?id=${infolist.infoId}'}">删除</a> --%>
				</div>
			</div>
		</div>
	</c:forEach>
	<script type="text/javascript">
		
	</script>
</body>
</html>

<%-- <form action="info/display" method="post">

			<input name="title" value="${info.title }" type="hidden"> <input
				name="infos" value="${info.infos }" type="hidden">
			<div class="demo">
				<div class="title" name="title">${info.title }</div>
				<div class="body" name="infos">${info.infos }</div>
				<div class="foot" name="time">${info.time }
					<div class="bu">
						<a href="info/display">查看更多</a>
					</div>
				</div>
			</div>
		</form>
 --%>