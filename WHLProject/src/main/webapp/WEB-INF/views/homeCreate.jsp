<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<form name="createUserForm" action="/createUser">
		아이디 : <input type="text" name="id" placeholder="ID"/><br>
		비밀번호 : <input type="text" name="password" placeholder="Password"/><br>
		이름 : <input type="text" name="name" placeholder="Name"/><br>
		이메일 : <input type="text" name="email" placeholder="Email"/><br>
		주소 : <input type="text" name="address" placeholder="Address"/><br>
		<input type="submit" value="회원가입" />
	</form>
</body>
<script type="text/javascript" src="/js/HomeLogin.js" charset="UTF-8"></script>
</html>