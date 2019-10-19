<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="sendChat" method="POST">
<s:hidden name="username"  />

<textarea>
<s:iterator value="messages" var="msg">
<s:property value="msg" />
</s:iterator>
</textarea>

<br />

<input type="text" name="message" />
<button type="submit">Send</button>
</form>

</body>
</html>