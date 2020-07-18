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
#info {
	height: 400px;
	width: 600px;
	margin: 0 auto;
}

#info .top {
	width: 100%;
}

#button {
	float: right;
}

#titel{
		height:2em;
		background-color:lightgray;
	}
</style>
</head>
<body>
<div id = "titel">
	
		</div>
	<div id="info">
		
		<h2 align="center">${info.title}</h2>
		<p>${info.infos }</p>
	</div>
	<script>

	</script>
</body>
</html>