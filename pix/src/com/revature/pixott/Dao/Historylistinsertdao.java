package com.revature.pixott.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Historylistinsertdao {
	public static void insert(String adder) {
		String sql="insert into history(movies) values(?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			 stmt.setString(1,adder);
			 stmt.executeUpdate();
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
			
		
	}

}
