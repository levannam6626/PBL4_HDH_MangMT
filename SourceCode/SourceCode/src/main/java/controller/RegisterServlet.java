package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.Account;
import model.bo.ChangepasswordBO;
import model.bo.RegisterBO;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet{
	private static final long serialVersionUID = 4L;
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws IOException, ServletException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String destination = null;
		String taikhoan = request.getParameter("taikhoan");
		String matkhau = request.getParameter("matkhau");
		String matkhauxacthuc = request.getParameter("xacnhanmk");
		RegisterBO registerBO = new RegisterBO();
		try {
			if(matkhau.equals(matkhauxacthuc))
			{
				switch(request.getParameter("tk"))
				{
					case "GV":{
						String tengv = request.getParameter("tenGV");
						String sdt = request.getParameter("sdt");
						registerBO.registerGV(taikhoan, matkhau, tengv, sdt);
						break;
					}
					case "SV":{
						String mssv = request.getParameter("mssv");
						String tensv = request.getParameter("tenSV");
						String ngaysinh = request.getParameter("ngaysinh");
						String sdt = request.getParameter("sdt");
						registerBO.registerSV(taikhoan, matkhau, mssv, tensv, ngaysinh, sdt);
						break;
					}
				}
				destination = "/Danhsachtk.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}else {
				destination = "/Register.jsp?thongbao=matkhau&&tk="+request.getParameter("tk");
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		} catch (Exception e) {
			destination = "/Register.jsp?thongbao=loi&&tk="+request.getParameter("tk");
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
	}
}
