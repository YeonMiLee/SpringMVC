<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SIGN_IN</title>
</head>
<body>
	
	<h3>This page is SIGN_IN.</h3>
	
	<form action="/hello/signInConfirm">	<!-- RequestMapping -->
		ID: <input type="text" name="m_id"><br/>
		PW: <input type="password" name="m_pw"><br/>		
		<input type="submit" name="SIGN UP">
		<input type="reset" name="CANCEL">
	</form>
	
</body>
</html>