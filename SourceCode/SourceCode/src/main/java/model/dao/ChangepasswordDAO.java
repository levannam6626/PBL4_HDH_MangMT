package model.dao;

import java.sql.SQLException;

public class ChangepasswordDAO {
	public void changepwDAO(String username, String password) throws ClassNotFoundException, SQLException {
		String query = "Update TAIKHOAN set MatKhau ='"+password+"' where TaiKhoan = '"+username+"'";
		DBHelper.getInstance().ExcuteDB(query);
	}
}
