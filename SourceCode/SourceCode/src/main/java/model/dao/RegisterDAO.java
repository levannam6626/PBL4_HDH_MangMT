package model.dao;

import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

public class RegisterDAO {
	public void RegisterSV(String taikhoan, String matkhau, String mssv,String tensv, String ngaysinh, String sdt) throws ClassNotFoundException, SQLException {
		String id ="SV";
		int num = (Integer.parseInt(LastID("select top 1 IDTaiKhoan from TAIKHOAN Where IDTaiKhoan like 'SV%' order by IDTaiKhoan desc").replace("SV", ""))+1);
		if(num<10)
		{
			id+="0";
		}
		id += num;
		String query1 = "Insert into TAIKHOAN Values('"+id+"','"+taikhoan+"','"+matkhau+"','sinhvien','true')";
		String query2 = "Insert into SINHVIEN Values('"+mssv+"','"+tensv+"','"+sdt+"','"+ngaysinh+"','"+id+"')";
		DBHelper.getInstance().ExcuteDB(query1);
		DBHelper.getInstance().ExcuteDB(query2);
	}
	public void RegisterGV(String taikhoan, String matkhau, String tengv, String sdt) throws NumberFormatException, ClassNotFoundException, SQLException {
		String idtk ="GV";
		int numtk = (Integer.parseInt(LastID("select top 1 IDTaiKhoan from TAIKHOAN Where IDTaiKhoan like 'GV%' order by IDTaiKhoan desc").replace("GV", ""))+1);
		if(numtk<10)
		{
			idtk+="0";
		}
		idtk += numtk;
		String magv = "GV";
		int numgv = (Integer.parseInt(LastID("select top 1 MaGV from GIANGVIEN Where MaGV like 'GV%' order by MaGV desc").replace("GV", ""))+1);
		if(numgv<10)
		{
			magv+="0";
		}
		magv += numgv;
		String query1 = "Insert into TAIKHOAN Values('"+idtk+"','"+taikhoan+"','"+matkhau+"','giangvien','true')";
		String query2 = "Insert into GIANGVIEN Values('"+magv+"','"+tengv+"','"+sdt+"','"+idtk+"')";
		DBHelper.getInstance().ExcuteDB(query1);
		DBHelper.getInstance().ExcuteDB(query2);
	}
	public String LastID(String query) throws ClassNotFoundException, SQLException
	{
		DefaultTableModel defaultTableModel = (DBHelper.getInstance().GetRecords(query) != null)
				? DBHelper.getInstance().GetRecords(query)
				: null;
		return (defaultTableModel != null) ? defaultTableModel.getValueAt(0, 0).toString() : "0";
	}
}
