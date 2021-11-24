package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.Account;
import model.bo.CheckLoginBO;

@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws IOException, ServletException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String destination = null;
		String taikhoan = request.getParameter("taikhoan");
		String matkhau = request.getParameter("matkhau");
		CheckLoginBO checkLoginBO = new CheckLoginBO();
		HttpSession session = request.getSession(false);
		try {
			if(taikhoan != null && matkhau != null)
			{
				Account account = new Account();
				session.setAttribute("Account", account);
				account = checkLoginBO.isValidUser(taikhoan,matkhau);
				switch(account.getphanquyen())
				{
					case "admin":{
						destination = "/Admin.jsp";
						break;
					}case "giangvien":{
						destination = "/GiangVien.jsp";
						break;
					}case "sinhvien":{
						destination = "/SinhVien.jsp";
						break;
					}default :{
						destination = "/Login.jsp";
						break;
					}
				}
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}else {
				destination = "/Login.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		} catch (Exception e) {
			destination = "/Login.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
	}
}
