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
		<br>
		<form action="info/insert" method="post" target="_parent" onsubmit="return check()">
			<input class="top" id="title" name = "title" type="text" placeholder="此处写标题" > <br>
			<br>
			<textarea id="infos" name="infos"
				style="width: 100%; height: 100%;"
				onblur="this.value=this.value.trim()">正文...</textarea>
			<input id="button" type="submit" )>
		</form>
	</div>
	
	<script type="text/javascript">
			function check() {
				var title = document.getElementById("title").value;
				var infos = document.getElementById("infos").value;
				if (title.length == 0 || infos.length == 0) {
					alert("请完善信息");
					return false;
				}
				return true;
			}
	</script>
</body>
</html>
<!-- onclick=top.location.replace("main.action") -->