// 제품 page 로그인 기능

//쿠키 저장하는 함수
var setCookie = function(name, value, exp) {
     var date = new Date();
     date.setTime(date.getTime() + exp*24*60*60*1000);
     document.cookie = name + '=' + value + ';expires=' + date.toUTCString() + ';path=/';
};

//쿠키 값 가져오는 함수
var getCookie = function(name) {
     var value = document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)');
     return value? value[2] : null;
};

// 쿠키 값이 있으면 자동 로그인
$(document).ready(function(){
	if(getCookie("id")){
		let url="/productHome";
		location.replace(url);
	}
});

// 자동 로그인 check 확인
function loginCheck(){
	var id = document.getElementById("id").value;
	var pw = document.getElementById("password").value;
	
	$.ajax({
			url : "/loginCheck",
			type : "post",
			data : { id : id, pw : pw},
			success : function(response){
				if(response.length <= 0){
					alert(" 아이디 혹은 비밀번호 틀림 ");
					
					document.getElementById("id").value="";
					document.getElementById("password").value="";
					
				}else{
					// 자동 로그인 버튼에 따른 세션, 쿠키 로그인 분기
					if(document.getElementById("autoLogin").checked){
						//쿠키
						setCookie("id", response[0].id, 30);
						console.log(getCookie("id"));
					}else{
						//세션
					}
					
					let url="/productHome";
					location.replace(url);
				}
			},
			error : function(response) {
				console.log("fail : " + response);
			}
		});
}