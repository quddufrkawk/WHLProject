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
		상품 등록 페이지<br>
		이름 : <input type="text" id="productName" placeholder="이름"/><br>
		가격 : <input type="text" onkeyup="this.value=this.value.replace(/[^0-9]/g,'');" id="productPrice" placeholder="가격(원)"/><br>
		갯수 : <input type="text" onkeyup="this.value=this.value.replace(/[^0-9]/g,'');" id="productCount" placeholder="갯수"/>
			  <button onclick="countUpDown('plus')">+</button> <button onclick="countUpDown('minus')">-</button><br>
		<button id="returnProduct" onclick="returnProduct()">취소</button>
		<button id="inProduct" onclick="inProduct()">등록하기</button>
</body>
<script type="text/javascript" src="/js/ProductHome.js" charset="UTF-8"></script>
</html>