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
		아이디 : <input type="text" id="id" onkeyup="enterkey()" placeholder="ID"/><br>
		비밀번호 : <input type="password" id="password" onkeyup="enterkey()"placeholder="Password"/><br>
		<input type="button" onclick="loginCheck()" value="로그인">
		<input type="button" onclick="createUserForm()" value="회원가입">
		<input id="autoLogin" type="checkbox" value="autoLogin"> 자동 로그인
</body>
<script type="text/javascript" src="/js/HomeLogin.js" charset="UTF-8"></script>
</html>