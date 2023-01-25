// 상품 리스트 페이지

//쿠키 삭제하는 함수
var deleteCookie = function(name) {
     document.cookie = name + '=; expires=Thu, 01 Jan 1999 00:00:10 GMT;';
};

// 로그아웃 기능
function productLogout(){
	deleteCookie("id");
	location.href = "/home";
}

// 상품 추가
function productAdd(){
	var url = "/productAdd";
	location.replace(url);
}


// 상품 추가, 삭제, 변경
function inProduct(){
	document.getElementById("productName");
	document.getElementById("productPrice");
	document.getElementById("productCount");
	
	// DB에 상품 데이터 올리기
	$.ajax({
			url : "/inProduct",
			success : function(response){
				
			},
			error : function() {
				console.log(response.responseText);
			}
		});
}

function deProduct(){
	document.getElementById("productName");
	document.getElementById("productPrice");
	document.getElementById("productKinds");
	
	// DB에 상품 데이터 내리기
	$.ajax({
			url : "deProduct.action",
			success : function(response){				
			let json = JSON.parse(response.responseText);

			$("#productName").text(json.productName);
			$("#productPrice").html(json.productPrice);
			$("#productKinds").val(json.productKinds);
			},
			error : function() {
				console.log(response.responseText);
			}
		});
	
}

function upProduct(){
	document.getElementById("productName");
	document.getElementById("productPrice");
	document.getElementById("productKinds");
	
	// DB에 상품 데이터 변경
	$.ajax({
			url : "upProduct.action",
			type : "get",
			success : function(response){
			let json = JSON.parse(response.responseText);

			$("#productName").text(json.productName);
			$("#productPrice").html(json.productPrice);
			$("#productKinds").val(json.productKinds);
			},
			error : function() {
				console.log(response.responseText);
			}
		});
	
}

// 상품 자동 슬라이드 기능
function autoProductImg(){
	var productImg = [];
	
	for(var i=0; i<productImg.length; i++){
		console.log(productImg[i]);
	}
}

// 상품 상세 보기

// 상품 목록 - 미리보기