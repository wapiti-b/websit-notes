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

<style>
#info {
	
	width: 800px;
	margin: 0 auto;
}

#info .top {
	width: 100%;
}

#button {
	float: right;
}

#titel {
	height: 2em;
	background-color: lightgray;
}
</style>
</head>
<body>
	<div id="titel"></div>
	<div id="info">

		<h2 align="center">${info.title}</h2>
		<p>${info.infos }</p>
		 <%-- <input class="top" id="title" name="title" type="text"
				placeholder="${info.title}"><br><br>
 --%>
			<%-- <textarea id="infos" name="infos" style="width: 100%; height: 100%;"
				onblur="this.value=this.value.trim()">${info.infos }</textarea>
 --%>
 		<%-- <p>${info.infos }</p> --%>
			
	</div>
	<script type="text/javascript">

	</script>
</body>
</html>
