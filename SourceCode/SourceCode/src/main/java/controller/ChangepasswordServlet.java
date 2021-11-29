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

@WebServlet("/ChangepasswordServlet")
public class ChangepasswordServlet extends HttpServlet{
	private static final long serialVersionUID = 3L;
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws IOException, ServletException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String destination = null;
		String matkhaucu = request.getParameter("old-pass");
		String matkhaumoi = request.getParameter("new-pass");
		String matkhauxacthuc = request.getParameter("confirm");
		ChangepasswordBO changepwBO = new ChangepasswordBO();
		HttpSession session = request.getSession(true);
		Account account = new Account();
		account = (Account)session.getAttribute("Account");
		if(account.getpassword().equals(matkhaucu)) {
			try {
				if(matkhaumoi.equals(matkhauxacthuc))
				{
					changepwBO.changpwBO(account.getusername(), matkhaumoi);
					destination = "/ChangePassword.jsp?thongbao=Success";
					RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
					rd.forward(request, response);
				}else {
					destination = "/ChangePassword.jsp?";
					RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
					rd.forward(request, response);
				}
			} catch (Exception e) {
				destination = "/ChangePassword.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		}else {
			destination = "/ChangePassword.jsp?thongbao=Mkcukhongdung";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
	}
}
