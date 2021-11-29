package model.bo;

import java.sql.SQLException;

import model.dao.ChangepasswordDAO;

public class ChangepasswordBO {
	ChangepasswordDAO changepwDAO = new ChangepasswordDAO();
	public void changpwBO(String username, String password) throws ClassNotFoundException, SQLException {
		changepwDAO.changepwDAO(username,password);
	}
}
