package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.GiangVien;
import model.bean.SinhVien;
import model.bo.TaiKhoanBO;

@WebServlet("/DanhSachTK")
public class DanhSachTK extends HttpServlet{
	private static final long serialVersionUID = 2L;
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws IOException, ServletException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String destination = null;
		String taikhoan = request.getParameter("tk");
		destination = "/Danhsachtk.jsp?tk="+taikhoan;
		TaiKhoanBO taiKhoanBO = new TaiKhoanBO();
		try {
			if(taikhoan.equals("GV"))
			{
				ArrayList<GiangVien> listGV = taiKhoanBO.getGiangVien();
				request.setAttribute("listGV", listGV);
			}else {
				ArrayList<SinhVien> listSV = taiKhoanBO.getSinhVien();
				request.setAttribute("listSV", listSV);
			}
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		} catch (Exception e) {
			destination = "/Danhsachtk.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
	}
}
