package lutonhotelsystem;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;




public class cust_jdbc {
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/luton_hotel", "root", "");
			conn.close();
			System.out.println("Connect and Close database connection!");
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
	public boolean insert(Customer customer) {
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/luton_hotel", "root", "");
			String strSql = "INSERT INTO customer(name, email, dob, mobile_no, gender, password, address, creditcardno, expiryon) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstat = conn.prepareStatement(strSql);
			//pstat.setInt(1, customer.getCid());
			pstat.setString(1, customer.getName());	
			pstat.setString(2, customer.getEmail());
			pstat.setString(3, customer.getDOB());
			pstat.setString(4, customer.getMobile_No());
			pstat.setString(5, customer.getGender());
			pstat.setString(6, customer.getPassword());
			pstat.setString(7, customer.getAddress());
			pstat.setString(8, customer.getCreditcardno());
			pstat.setString(9, customer.getExpiryon());
			pstat.executeUpdate();
			pstat.close();
			conn.close();
			System.out.println("Record inserted!");
			result = true;
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
			result = false;
		}
		return result;
	}
	public int login(Customer customer) {
		//receive user info
		int cid = 0;
		try {
			//connect with db
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/luton_hotel","root", "");
			String sql = "SELECT cid FROM customer WHERE email=? and password=?";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setString(1, customer.getEmail());
			pstat.setString(2, customer.getPassword());
			//search user in db table
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				cid = rs.getInt(1);	
				System.out.println(cid);
				
				new Customer(cid);
				}
			
			//return result
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}

		return cid;
		
	}
}
