<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}
								/SourceCode/public/css/changepassword.css" type="text/css">
<title>Change Password</title>

</head>
<body>
 <div class="change-pass">
        <h3> THAY ĐỔI MẬT KHẨU</h3>
        <form action="" method="">
            <label for="old-pass" class="label">Nhập mật khẩu cũ: </label>
            <input type="password" value="" placeholder="Nhập mật khẩu cũ" id="old-pass" class="input">
            <label for="new-pass" class="label" >Nhập mật khẩu mới: </label>
            <input type="password" value="" placeholder="Nhập mật khẩu mới" id="new-pass" class="input">
            <label for="confirm" class="label"> Xác nhận mật khẩu mới: </label>
            <input type="password" value="" placeholder="Nhập lại mật khẩu mới" id="confirm" class="input">
            <button value="" class="btn-capnhat">Cập nhật</button>
        </form>
    </div>
</body>
</html>