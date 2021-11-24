package model.bean;

public class GiangVien {
	private String MaGV;
	private String TenGiangVien;
	private String SDT;
	private Account account;
	public void setMaGV(String MaGV){
		this.MaGV = MaGV;
	}
	public String getMaGV() {
		return MaGV;
	}
	public void setTenGiangVien(String TenGiangVien){
		this.TenGiangVien = TenGiangVien;
	}
	public String getTenGiangVien() {
		return TenGiangVien;
	}
	public void setSDT(String SDT){
		this.SDT = SDT;
	}
	public String getSDT() {
		return SDT;
	}
	public void setAccount(Account account){
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
}
