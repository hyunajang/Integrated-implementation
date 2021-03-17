<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insertUser.do" method="post">
		<input type="text" name="uName" class="form-control" id="uName"
			placeholder="홍길동"> 
	<input type="text" name="uNick"
			class="form-control" id="uNick" placeholder="홍판서"> 
		<input	type="text" name="uEmail" class="form-control" id="uEmail"
			placeholder="email@bit.com">
		 <input type="text" name="uPhone"
						class="form-control" id="uPhone"
						placeholder="010-1234-5678">	
						
						<input type="password" name="uPwd"
						class="form-control" id="uPwd"
						placeholder="영문+숫자 조합 8자리 이상 입력해주세요">
						
						 <input type="password" name="uPwd"
						class="form-control" id="uPwd" placeholder="">
						
						<input type="text" name="uAddress"
							class="form-control" id="uAddress"
							placeholder="서울시 마포구">
							
							<input type="checkbox" class="uAgreecheck" id="uAgreecheck" name="uAgreecheck"
							checked="">
							
							<input type="submit" class="btn-secondary" value="회 원 가 입" />
	</form>
</body>
</html>