package model.bo;

import java.sql.SQLException;

import model.dao.RegisterDAO;

public class RegisterBO {
	RegisterDAO registerDAO = new RegisterDAO();
	public void registerSV(String taikhoan, String matkhau, String mssv,String tensv, String ngaysinh, String sdt) throws ClassNotFoundException, SQLException
	{
		registerDAO.RegisterSV(taikhoan, matkhau, mssv, tensv, ngaysinh, sdt);
	}
	public void registerGV(String taikhoan, String matkhau, String tengv, String sdt) throws NumberFormatException, ClassNotFoundException, SQLException
	{
		registerDAO.RegisterGV(taikhoan, matkhau, tengv, sdt);
	}
}
