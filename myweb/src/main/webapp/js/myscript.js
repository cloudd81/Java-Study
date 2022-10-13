/**
 * myscript.js 
 */
 
 function bbsCheck(){ // 게시판 유효성 검사
	// 1) 작성자 체크 - 2글자 이상 입력
	let wname = document.getElementById("wname").value; // 작성자 가져오기
	wname = wname.trim();
	if(wname.length<2){
		alert("이름은 2글자 이상 입력해주세요");
		document.getElementById("wname").focus(); // 작성자칸에 커서 생성하기
		return false;
	} // if end
	
	// 2) 제목 체크 - 2글자 이상 입력
	let subject = document.getElementById("subject").value; // 작성자 가져오기
	subject = subject.trim();
	if(subject.length<2){
		alert("제목은 2글자 이상 입력해주세요");
		document.getElementById("subject").focus(); // 작성자칸에 커서 생성하기
		return false;
	} // if end

	// 3) 내용 체크 - 2글자 이상 입력
	let content = document.getElementById("content").value; // 작성자 가져오기
	content = content.trim();
	if(content.length<2){
		alert("내용에 2글자 이상 입력해주세요");
		document.getElementById("content").focus(); // 작성자칸에 커서 생성하기
		return false;
	} // if end
	
	// 4) 비밀번호 체크 - 4글자 이상이면서, 숫자형 기호만 입력 
	let passwd = document.getElementById("passwd").value;
	passwd = passwd.trim();
	if(passwd.length<4 || isNaN(passwd)){
		alert("비밀번호는 4글자 이상 숫자로 입력해주세요");
		document.getElementById("passwd").focus();
		return false;
	}
	
	return true; // onsubmit 이벤트에서 서버로 전송
}// bbsCheck() end

function pwCheck(){
	let passwd = document.getElementById("passwd").value;
	passwd = passwd.trim();
	if(passwd.length<4 || isNaN(passwd)){
		alert("비밀번호는 4글자 이상 숫자로 입력해주세요");
		document.getElementById("passwd").focus();
		return false;
	} // if end
	
	let message = "진행된 내용은 복구되지 않습니다\n계속 진행할까요?";
	if(confirm(message)){ // 확인 true, 취소 false
		return true;
	} else {
		return false;
	} // if end
	
} // pwChechk() end

 function updateCheck(){
	let wname = document.getElementById("wname").value;
	wname = wname.trim();
	if(wname.length<2){
		alert("이름은 2글자 이상 입력해주세요");
		document.getElementById("wname").focus();
		return false;
	} // if end
	
	let subject = document.getElementById("subject").value;
	subject = subject.trim();
	if(subject.length<2){
		alert("제목은 2글자 이상 입력해주세요");
		document.getElementById("subject").focus();
		return false;
	} // if end

	let content = document.getElementById("content").value;
	content = content.trim();
	if(content.length<2){
		alert("내용에 2글자 이상 입력해주세요");
		document.getElementById("content").focus();
		return false;
	} // if end
	
	let passwd = document.getElementById("passwd").value;
	passwd = passwd.trim();
	if(passwd.length<4 || isNaN(passwd)){
		alert("비밀번호는 4글자 이상 숫자로 입력해주세요");
		document.getElementById("passwd").focus();
		return false;
	}
	
	let message = "수정하면 이전 내용은 사라집니다\n계속 진행할까요?";
	if(confirm(message)){ // 확인 true, 취소 false
		return true;
	} else {
		return false;
	} // if end
	
}// updateCheck() end