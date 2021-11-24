package model.bo;

import java.sql.SQLException;

import model.bean.Account;
import model.dao.CheckLoginDAO;

public class CheckLoginBO {
	CheckLoginDAO checkLoginDAO = new CheckLoginDAO();
	public Account isValidUser(String taikhoan,String matkhau) throws ClassNotFoundException, SQLException
	{
		return checkLoginDAO.isExistUser(taikhoan,matkhau);
	}
}
