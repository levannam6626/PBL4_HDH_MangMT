package model.bean;

public class Account {

	private String username;
	private String password;
	private String phanquyen;
	private boolean trangthai;
	public Account()
	{
		username = "";
		password = "";
		phanquyen = "";
	}
	public void setusername(String username)
	{
		this.username = username;
	}
	public String getusername()
	{
		return username;
	}
	public void setpassword(String password)
	{
		this.password = password;
	}
	public String getpassword()
	{
		return password;
	}public void setphanquyen(String phanquyen)
	{
		this.phanquyen = phanquyen;
	}
	public String getphanquyen()
	{
		return phanquyen;
	}
	public void settrangthai(boolean trangthai)
	{
		this.trangthai = trangthai;
	}
	public boolean gettrangthai()
	{
		return trangthai;
	}
}
