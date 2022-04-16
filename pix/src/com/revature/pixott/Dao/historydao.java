package com.revature.pixott.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class historydao {
	public static void ans() {
		String sql = "select * from history";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			  ResultSet rs =stmt.executeQuery();
			  while(rs.next()) {
				  System.out.print(rs.getInt("no")+"  ");
				  System.out.println(rs.getString("movies"));
			  }
			 
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
	}

}
