<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>Session Attribute</title>
	</head> 
<body> Role: ${role}
<br /><hr /> Counter: ${counter}
<br /><hr /> MaxInactiveInterval: ${pageContext.session.maxInactiveInterval}
<br/> ID session: ${pageContext.session.id}
<br/> Lifecycle: ${lifecycle}
<br/> <a href="index.jsp">Back to index.jsp</a> 
</body>
</html>
