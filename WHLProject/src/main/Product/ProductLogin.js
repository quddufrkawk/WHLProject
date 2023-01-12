// 제품 page 로그인 기능

// 자동 로그인 check 확인
function productLoginCheck(){
	if(sessionStorage!=null){
		return productLoginDataSet();
	}else{
		loginPwEncoding();
		
		loginPwDecoding(id, pw);
		productLoginCheck(id, pw);
	}
}

function loginPwEncoding(id, pw){
	sessionStorage.clear();
	
	const idEncoded = encodeURI(id);
	const pwEncoded = encodeURI(pw);
	console.log(idEncoded, pwEncoded);
}

function loginPwDecoding(idEncoded, pwEncoded){
	const idDecoded = decodeURI(idEncoded);
	const pwDecoded = decodeURI(pwEncoded);
	console.log(idDecoded, pwDecoded);
}

function productLoginCheck(idDecoded, pwDecoded){
	if(idDecoded=="admin" && pwDecoded=="1"){
		console.log(" login success ");
		return alert(" login success ");
	}else{
		console.log(" login failed ");
		return alert(" login failed ");
	}
}

// 자동 로그인 체크 시
function productAutoLogin(idDecoded, pwDecoded){
	sessionStorage.setItem("id",idDecoded);
	sessionStorage.setItem("pw",pwDecoded);
}

// 로그인 후 데이터를 page에 전송 - 상단 이름 부분에 아이디 출력
function productLoginDataSet(){
	return sessionStorage.getItem(id);
}

// 상품 추가, 삭제, 변경
function inProduct(){
	
}

function deProduct(){
	
}

function upProduct(){
	
}