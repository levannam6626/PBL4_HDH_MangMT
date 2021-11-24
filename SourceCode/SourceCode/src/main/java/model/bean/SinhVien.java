package model.bean;

public class SinhVien {
	private String MSSV;
	private String TenSinhVien;
	private String SDT;
	private String NgaySinh;
	private Account account;
	public void setMSSV(String MSSV){
		this.MSSV = MSSV;
	}
	public String getMSSV() {
		return MSSV;
	}
	public void setTenSinhVien(String TenSinhVien){
		this.TenSinhVien = TenSinhVien;
	}
	public String getTenSinhVien() {
		return TenSinhVien;
	}
	public void setSDT(String SDT){
		this.SDT = SDT;
	}
	public String getSDT() {
		return SDT;
	}
	public void setNgaySinh(String NgaySinh){
		this.NgaySinh = NgaySinh;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setAccount(Account account){
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
}
