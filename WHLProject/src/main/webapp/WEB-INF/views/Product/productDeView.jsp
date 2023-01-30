<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>

</head>
<body>
		상품 상세보기 페이지
		<button id="productReturn" onclick="returnProduct()">목록으로</button>
		<table id="deProduct">
		<tr id="productName">
			<td> [ 상품명 ] :  </td>
		</tr>
		<tr id="productPrice">
			<td> [ 가격 ] : </td>
		</tr>
		<tr id="productCount">
			<td> [ 갯수 ] : </td>
		</tr>
		<tr id="productSeller">
			<td> [ 판매자 ] : </td>
		</tr>
		</table>
</body>
<script type="text/javascript" src="/js/ProductHome.js" charset="UTF-8">

</script>
</html>