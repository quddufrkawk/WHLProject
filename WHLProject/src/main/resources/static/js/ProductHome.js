// 상품 리스트 페이지

//쿠키 삭제하는 함수
var deleteCookie = function(name) {
     document.cookie = name + '=; expires=Thu, 01 Jan 1999 00:00:10 GMT;';
};

//쿠키 값 가져오는 함수
var getCookie = function(name) {
     var value = document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)');
     return value? value[2] : null;
};

// 쿠키 나 세션값이 없으면 로그인 화면으로 돌아가기
$(document).ready(function(){
	if(getCookie("id") == null){
		if(sessionStorage.getItem("id") == null){
			location.href="/";
		}
	}
	seProduct();
});

// 상품 리스트 출력
function seProduct(){
	$.ajax({
			url : "/seProduct",
			data : {},
			success : function(response){
				var result = "";
				response.forEach((a) =>{
					result += '<tr onclick="deProduct('+a.productCode+')">';
					result += '<td>'+a.productCode+' | </td>';
					result += '<td>'+a.productName+'</td>';
					result += '<td>'+ a.productPrice + '</td>';
					result += '<td>' + a.productSeller + '</td>';
					result += '<td>' + a.productViewCount + '</td>';
					result += '</tr>';
					
					$("#productHomeList").html(result);				
				});
			},
			error : function(response) {
				console.log(response.responseText);
			}
		});
}

async function getIpClient() {
  try {
    const response = await axios.get('https://api.ipify.org?format=json');
    return response.data.ip;
  } catch (error) {
    console.error(error);
  }
}

// 클릭 시 상품 미리보기 페이지
function deProduct(code){
	// 조회수 증가
	getIpClient().then(function(result){
		var ip = result;
		var id = "";
		
		if(getCookie("id") != null){
			id = getCookie("id");
		}else if(sessionStorage.getItem("id") != null){
			id = sessionStorage.getItem("id");
		}else{
			
		}
	
		$.ajax({
			url : "/deProduct",
			data : {code : code, ip : ip, id : id},
			success : function(){
				
				location.href="/productDeView?code="+code;
			},
			error : function(response) {
				console.log(response.responseText);
			}
		});
		
	});
}

// 상품 등록
function inProduct(){
	var name = document.getElementById("productName").value;
	var price = document.getElementById("productPrice").value;
	var count = document.getElementById("productCount").value;
	var id = "";
	
	if(getCookie("id")){
		id = getCookie("id");
	}else if(sessionStorage.getItem("id")){
		id = sessionStorage.getItem("id")
	}else{
		alert(" 비 정상적인 접근입니다. ");
		return;
	}
	
	$.ajax({
			url : "/inProduct",
			data : {name : name, price : price, count : count, id : id},
			success : function(response){
				alert("상품 등록이 완료되었습니다.");
				location.href = "/productHome";
			},
			error : function(response) {
				console.log(response.responseText);
			}
		});
}

// 로그아웃 기능
function productLogout(){
	deleteCookie("id");
	sessionStorage.clear();
	location.href = "/home";
}

// 상품 추가
function productAdd(){
	location.href = "/productAdd";
}

function returnProduct(){
	location.href = "/productHome";
}

// 상품 갯수 증감 버튼
function countUpDown(type){
	var productCount = document.getElementById("productCount");
	var countUpDown = productCount.value;
	
	if(countUpDown == "" || countUpDown == null || countUpDown == "NaN"){
		countUpDown = 1;
	}
	
	if(type=="plus"){
		document.getElementById("productCount").value = parseInt(countUpDown) + 1;
	}else if(type=="minus"){
		if(countUpDown >= 2 ){
			document.getElementById("productCount").value = parseInt(countUpDown) - 1;
		}else{
			return;
		}
	}
}

// 상품 목록 - 미리보기