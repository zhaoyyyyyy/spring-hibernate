<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table  width="100%" >
	<tr>
		<td align="center">
		<form action="../regist.do"  method="post">
		<table>
			<tr>
				<td>
				<h1>注册</h1>
				<td>
			</tr>
			<tr>
				<td>
				登录名：
				</td>
				<td>
				<input type="text" name="loginName"  value=""/>
				</td>
			</tr>
			<tr>
				<td>
				真实姓名：
				</td>
				<td>
				<input type="text" name="realName"  value=""/>
				</td>
			</tr>
			<tr>
				<td>
				性别：
				</td>
				<td>
				<input type="text" name="sex"  value=""/>
				</td>
			</tr>
			<tr>
				<td>
				年龄：
				</td>
				<td>
				<input type="text" name="age"  value=""/>
				</td>
			</tr>
			<tr>
				<td>
				密码：
				</td>
				<td>
				<input type="password" name="password1" value="" />
				</td>
			</tr>
			<tr>
				<td>
				再次输入密码：
				</td>
				<td>
				<input type="password" name="password2" value="" />
				</td>
			</tr>
			<tr>
				<td>
				<input type="submit" value="注册"/>
				</td>
			</tr>
			</table>
		</form>
		</td>
				<td>
				<form action="login.jsp">
				<input type="submit" value="返回登陆">
				</form>
				</td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</body>
</html>