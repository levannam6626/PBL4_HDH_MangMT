<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}
/SourceCode/public/css/style.css">
</head>
<body>
	<div class="center-container">
	<!--header-->
	<div class="header-w3l">
		<h1>ĐĂNG NHẬP</h1>
	</div>
	<!--//header-->
	<div class="main-content-agile">
		<div class="sub-main-w3">
			<form action="CheckLoginServlet" method="post">
				<div class="pom-agile">
					<input placeholder="Tài khoản" name="taikhoan" class="user" type="text" required="">
					<span class="icon1"><i class="fa fa-user" aria-hidden="true"></i></span>
				</div>
				<div class="pom-agile">
					<input  placeholder="Mật khẩu" name="matkhau" class="pass" type="password" required="">
					<span class="icon2"><i class="fa fa-unlock" aria-hidden="true"></i></span>
				</div>
				<div class="sub-w3l">
					<div class="right-w3l">
						<input type="submit" value="Đăng nhập">
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>