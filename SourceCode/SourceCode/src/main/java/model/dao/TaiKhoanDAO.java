package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.bean.Account;
import model.bean.GiangVien;
import model.bean.SinhVien;

public class TaiKhoanDAO {
	public ArrayList<SinhVien> getSinhVien() throws ClassNotFoundException, SQLException {
		ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
		
		String query = "Select * from SINHVIEN";
		DefaultTableModel defaultTableModel = DBHelper.getInstance().GetRecords(query);
		if (defaultTableModel != null) {
			for (int i = 0; i < defaultTableModel.getRowCount(); i++) {
				SinhVien sinhVien = new SinhVien();

				sinhVien.setMSSV(defaultTableModel.getValueAt(i, 0).toString());
				sinhVien.setTenSinhVien(defaultTableModel.getValueAt(i, 1).toString());
				sinhVien.setSDT(defaultTableModel.getValueAt(i, 2).toString());
				sinhVien.setNgaySinh(defaultTableModel.getValueAt(i, 3).toString());
				sinhVien.setAccount(getAccountByID(defaultTableModel.getValueAt(i, 4).toString()));
				listSV.add(sinhVien);
			}
		}
		return listSV;
	}
	public ArrayList<GiangVien> getGiangVien() throws ClassNotFoundException, SQLException {
		ArrayList<GiangVien> listGV = new ArrayList<GiangVien>();
		String query = "Select * from GIANGVIEN";
		DefaultTableModel defaultTableModel = DBHelper.getInstance().GetRecords(query);
		if (defaultTableModel != null) {
			for (int i = 0; i < defaultTableModel.getRowCount(); i++) {
				GiangVien giangVien = new GiangVien();

				giangVien.setMaGV(defaultTableModel.getValueAt(i, 0).toString());
				giangVien.setTenGiangVien(defaultTableModel.getValueAt(i, 1).toString());
				giangVien.setSDT(defaultTableModel.getValueAt(i, 2).toString());
				giangVien.setAccount(getAccountByID(defaultTableModel.getValueAt(i, 3).toString()));
				listGV.add(giangVien);
			}
		}
		return listGV;
	}
	public Account getAccountByID(String ID) throws ClassNotFoundException, SQLException {
		Account account = new Account();
		String query = "Select * from TAIKHOAN where IDTaiKhoan ='"+ID+"'";
		DefaultTableModel defaultTableModel = DBHelper.getInstance().GetRecords(query);
		if (defaultTableModel != null) {
			account.setusername(defaultTableModel.getValueAt(0, 1).toString());
			account.setpassword(defaultTableModel.getValueAt(0, 2).toString());
			account.setphanquyen(defaultTableModel.getValueAt(0, 3).toString());
			account.settrangthai((boolean)defaultTableModel.getValueAt(0, 4));
		}
		return account;
	}
}
