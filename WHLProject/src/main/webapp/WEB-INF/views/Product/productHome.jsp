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
		상품 머시깽이 페이지
		<button id="productLogout" onclick="productLogout()">로그아웃</button>
		<button id="productAdd" onclick="productAdd()">상품 등록</button><br/>
		<table id="seProduct">
			<tr>
				<td></td>
				<td>[ 상품명 ]</td>
				<td>[ 가격 ]</td>
				<td>[ 판매자 ]</td>
				<td>[ 조회수 ]</td>
			</tr>
			<tbody id="productHomeList" style="cursor:pointer">
			</tbody>
		</table>
</body>
<script type="text/javascript" src="/js/ProductHome.js" charset="UTF-8"></script>
</html>