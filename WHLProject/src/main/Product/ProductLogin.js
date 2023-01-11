// 제품 page 로그인 기능
function loginPwEncoding(id, pw){
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

// 상품 추가, 삭제, 변경
function inProduct(){
	
}

function deProduct(){
	
}

function upProduct(){
	
}