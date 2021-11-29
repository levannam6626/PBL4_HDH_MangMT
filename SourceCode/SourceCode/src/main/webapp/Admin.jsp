<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}
/SourceCode/public/css/style_admin.css">
</head>
<body>
	<div style="width: 100%; height: 100%;">
            <div id="wp" style="width: 100%; height: 25%;">
                <div id="title">
                    <marquee direction="left">ADMIN
                    </marquee>
                </div>
                <div class="clear"></div>
                <div id="wp_center" style="width: 100%;height: 35%;">
                    <nav class="menu">
                        <ul class="parent-menu">
                            <li><a href='ChangePassword.jsp' target = "danhsachtk">Danh Sách</a>
                                <ul class='sub-menu'>
                                    <li><a href='DanhSachTK?tk=SV' target = "danhsachtk">Sinh Viên</a></li>
                                    <li><a href='DanhSachTK?tk=GV' target = "danhsachtk">Giảng Viên</a></li>
                                </ul>
                            </li>
                            <li><a href='Login.jsp' >Đăng Xuất</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
            <div id='danhsach'>
                <iframe name="danhsachtk" src='Danhsachtk.jsp' target="_self" frameborder="0"></iframe>
            </div>
        </div>
</body>
</html>