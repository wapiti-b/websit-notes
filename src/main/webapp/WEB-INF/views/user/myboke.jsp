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
.demo .title a{
	text-decoration:none;
	
}
 a:hover{
	color:red;
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
	height: 2em;
	background-color: lightgray;
}

.bu {
	float: right;
}
</style>
</head>
<body>
	<div id="titel"></div>

	<c:forEach var="info" items="${infolist}" varStatus="status">
		<div class="demo">
				<div class="title" name="title">
					<a href="info/display?infoId=${info.infoId }">	${info.title }</a>
				</div>
				<div class="body" name="infos">${info.infos }</div>
				<div class="foot" name="time">${info.time }
					<div class="bu">
						<a href="info/display?infoId=${info.infoId }">查看更多</a>
						<a href="article/update?infoId=${info.infoId }">编辑</a>
						<a href="article/delete?infoId=${info.infoId }" onclick="del()">删除</a> 
						<%-- <a href="{location.href='info/display?id=${infolist.infoId}'}">删除</a> --%>
					</div>
				</div>
			</div>

	</c:forEach>
	<script type="text/javascript">
     function del() {
         if(confirm("确实要删除吗？"));
     }
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