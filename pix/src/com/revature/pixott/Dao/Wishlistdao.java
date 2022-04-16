package com.revature.pixott.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Wishlistdao {
	public static void wish() {
		String sql = "select * from watchlist";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			  ResultSet rs =stmt.executeQuery();
			  while(rs.next()) {
				  System.out.print(rs.getInt("no")+"  ");
				  System.out.println(rs.getString("Movies"));
			  }
			 
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		
		
	}
	

}