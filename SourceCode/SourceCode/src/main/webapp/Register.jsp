<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}
/SourceCode/public/css/styleDK.css">
</head>
<body>
	<div class="login-form w3_form">
            <div class="login w3_login">
                <div class="w3l_grid">
                    <form class="login-container" action="RegisterServlet?tk=<%=request.getParameter("tk")%>" method="post">
                    	<%if(request.getParameter("thongbao")!=null){ %>
                    	<h6 align="center" style="color:red;" >Đăng ký không thành công!</h6>
                    	<%} %>
                    	<% if(request.getParameter("tk").equals("SV")){%>
                    	<h2 class="login-header w3_header">Đăng ký tài khoản sinh viên</h2>
                        <input type="text" placeholder="Tài khoản" Name="taikhoan" required="">
                        <input type="password" placeholder="Mật khẩu" Name="matkhau" required="">
                        <input type="password" placeholder="Xác nhận mật khẩu" Name="xacnhanmk" required="">
                        <input type="text" placeholder="Mã số sinh viên" Name="mssv" required="">
                        <input type="text" placeholder="Tên sinh viên" Name="tenSV" required="">
                        <input type="text" placeholder="Ngày sinh" Name="ngaysinh" required="">
                        <input type="text" placeholder="Số điện thoại" Name="sdt" required="">
                        <%}else {%>
                        <h2 class="login-header">Đăng ký tài khoản giảng viên</h2>
                        <input type="text" placeholder="Tài khoản" Name="taikhoan" required="" >
                        <input type="password" placeholder="Mật khẩu" Name="matkhau" required="">
                        <input type="password" placeholder="Xác nhận mật khẩu" Name="xacnhanmk" required="">
                        <input type="text" placeholder="Tên giảng viên" Name="tenGV" required="">
                        <input type="text" placeholder="Số điện thoại" Name="sdt" required="">
                        <% }%>
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