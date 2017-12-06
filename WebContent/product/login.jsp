<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<form action="user/login.do"  method="post">
		<table>
			<tr>
				<td>
				<h1>登录</h1>
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
				密码：
				</td>
				<td>
				<input type="password" name="password" value="" />
				</td>
			</tr>
			<tr>
				<td>
				<input type="submit" value="登录"/>
				</td>
			</tr>
			</table>
		</form>
		</td>
				<td>
				<form action="regist.jsp">
				<input type="submit" value="前往注册">
				</form>
				</td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</body>
</html>