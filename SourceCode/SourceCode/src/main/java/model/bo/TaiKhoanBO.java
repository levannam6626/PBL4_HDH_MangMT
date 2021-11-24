package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.GiangVien;
import model.bean.SinhVien;
import model.dao.TaiKhoanDAO;

public class TaiKhoanBO {
	TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
	public ArrayList<SinhVien> getSinhVien() throws ClassNotFoundException, SQLException {
		return taiKhoanDAO.getSinhVien();
	}
	public ArrayList<GiangVien> getGiangVien() throws ClassNotFoundException, SQLException {
		return taiKhoanDAO.getGiangVien();
	}
}
