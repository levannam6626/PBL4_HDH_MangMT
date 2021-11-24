<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://localhost:8081/SourceCode/public/css/styleDK.css">
</head>
<body>
	<div class="login-form w3_form">
            <div class="login w3_login">
                <h2 class="login-header w3_header">Đăng ký tài khoản sinh viên</h2>
                <div class="w3l_grid">
                    <form class="login-container" action="" method="post">
                        <input type="text" placeholder="Tài khoản" Name="taikhoan" required="">
                        <input type="password" placeholder="Mật khẩu" Name="matkhau" required="">
                        <input type="password" placeholder="Xác nhận mật khẩu" Name="xacnhanmk" required="">
                        <input type="text" placeholder="Mã số sinh viên" Name="mssv" required="">
                        <input type="text" placeholder="Tên sinh viên" Name="tenSV" required="">
                        <input type="text" placeholder="Ngày sinh" Name="ngaysinh" required="">
                        <input type="text" placeholder="Số điện thoại" Name="sdt" required="">
                        <div style="display: flex;">
                            <input type="reset" value="Reset">
                            <input type="submit" value="Đăng ký">
                            <input type="button" value="Thoát">
                        </div>
                    </form>
                </div>
            </div>
        </div>
</body>
</html>