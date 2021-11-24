package model.dao;

import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;
import model.bean.Account;

public class CheckLoginDAO {
	public Account isExistUser(String taikhoan,String matkhau) throws ClassNotFoundException, SQLException {
		Account account = new Account();
		String query = "Select * from TAIKHOAN where TaiKhoan ='"+taikhoan+"' and MatKhau = '"+matkhau+"'";
		DefaultTableModel defaultTableModel = DBHelper.getInstance().GetRecords(query);
		if (defaultTableModel != null) {
			account.setusername(defaultTableModel.getValueAt(0, 1).toString());
			account.setpassword(defaultTableModel.getValueAt(0, 2).toString());
			account.setphanquyen(defaultTableModel.getValueAt(0, 3).toString());
		}
		return account;
	}
}
