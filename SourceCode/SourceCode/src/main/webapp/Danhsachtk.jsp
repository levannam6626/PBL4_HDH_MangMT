<%@page import="model.bean.GiangVien"%>
<%@page import="model.bean.SinhVien"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}
/SourceCode/public/css/styleXDS.css">

</head>
<body>
	<div class="danhsachtk">
		<% if(request.getParameter("tk")!=null){ %>
			<form action="">
                <table border="1" align="center">
			<%
				switch(request.getParameter("tk"))
				{
					case "GV":{%>
					<tr>
	                    <th>Tài khoản</th>
	                    <th>Tên Giảng Viên</th>
	                    <th>SDT</th>
	                    <th>Trạng thái</th>
	                </tr>
	                <%
					ArrayList<GiangVien> listGV =(ArrayList<GiangVien>)request.getAttribute("listGV");
					for(int i=0; i < listGV.size(); i++) {
					%>
					<tr>
					    <td><%= listGV.get(i).getAccount().getusername()%></td>
					    <td><%= listGV.get(i).getTenGiangVien()%></td>
					    <td align="center"><%= listGV.get(i).getSDT()%></td>
					    <td align="center"><%= listGV.get(i).getAccount().gettrangthai()%></td>
					</tr>
					<% }
						break;
					}case "SV":{%>
					<tr>
	                    <th>Tài khoản</th>
	                    <th>MSSV</th>
	                    <th>Tên Sinh Viên</th>
	                    <th>SDT</th>
	                    <th>Trạng thái</th>
	                </tr>
	                 <%
					ArrayList<SinhVien> listSV =(ArrayList<SinhVien>)request.getAttribute("listSV");
					for(int i=0; i < listSV.size(); i++) {
					%>
					<tr>
					    <td><%= listSV.get(i).getAccount().getusername()%></td>
					    <td><%= listSV.get(i).getMSSV()%></td>
					    <td><%= listSV.get(i).getTenSinhVien()%></td>
					    <td align="center"><%= listSV.get(i).getSDT()%></td>
					    <td align="center"><%= listSV.get(i).getAccount().gettrangthai()%></td>
					</tr>
					<% }
						break;
					}
				}%>
				</table>
				<div class="nut">
					<a href="Register.jsp?tk=<%= request.getParameter("tk")%>">Thêm</a>
					<a href="Register_GV.jsp">Sửa</a>
					<a href="Register_GV.jsp">Xóa</a>
				</div>
            </form>
            <% } %>
        </div>
</body>
</html>