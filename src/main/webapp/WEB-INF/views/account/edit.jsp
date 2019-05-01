<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Atualize sua conta</title>
</head>
<body>
<h3>Atualize sua Conta</h3>
	<s:form method="post" commandName="account" action="${pageContext.request.contextPath }/account/edit" >
	<table>
		<tr>
			<td>Username</td>
			<td><s:input path="username" /></td>
			<td><s:errors path="username"></s:errors></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><s:input path="password" /></td>
			<td><s:errors path="password"></s:errors></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td><input type="submit" value="Save"></td>
		</tr>
	</table>
	</s:form>
</body>
</html>