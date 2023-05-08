package lutonhotelsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JLabel;

public class Booking_jdbc {
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

	
	public boolean insert(Booking booking) {
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/luton_hotel", "root", "");
			String strSql = "INSERT INTO booking( cid, name, mobileno, address, age, gender, checkindate, checkoutdate, roomtype) VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstat = conn.prepareStatement(strSql);
//			pstat.setInt(1, booking.getBid());
			pstat.setInt(1, booking.getCid());
			pstat.setString(2, booking.getName());
			pstat.setString(3, booking.getMobileno());
			pstat.setString(4, booking.getAddress());
			pstat.setString(5, booking.getAge());
			pstat.setString(6, booking.getGender());
			pstat.setString(7, booking.getCheckindate());
			pstat.setString(8, booking.getCheckoutdate());
			pstat.setString(9, booking.getRoomtype());
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
	
	public Booking search(int bid) {
		Booking booking=new Booking();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/luton_hotel", "root", "");
			String strSql = "SELECT * FROM booking WHERE bid=?";
			PreparedStatement pstat = conn.prepareStatement(strSql);
			pstat.setInt(1, bid);
			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {
				booking.setBid(rs.getInt("bid"));
				booking.setName(rs.getString("name"));
				booking.setMobileno(rs.getString("mobileno"));
				booking.setAddress(rs.getString("address"));
				booking.setAge(rs.getString("age"));
				booking.setGender(rs.getString("gender"));
				booking.setCheckindate(rs.getString("checkindate"));
				booking.setCheckoutdate(rs.getString("checkoutdate"));
				booking.setRoomtype(rs.getString("roomtype"));
			}
			rs.close();
			pstat.close();			
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return booking;
	}
	
	public ArrayList all(int cid) {
		ArrayList bookings =new ArrayList<Booking>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/luton_hotel", "root", "");
			String strSql = "SELECT * FROM booking where cid = ?";
			PreparedStatement pstat = conn.prepareStatement(strSql);	
			pstat.setInt(1, cid);

			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {
				Booking booking = new Booking();
				booking.setBid(rs.getInt("bid"));
				booking.setName(rs.getString("name"));
				booking.setMobileno(rs.getString("mobileno"));
				booking.setAddress(rs.getString("address"));
				booking.setAge(rs.getString("age"));
				booking.setGender(rs.getString("gender"));
				booking.setCheckindate(rs.getString("checkindate"));
				booking.setCheckoutdate(rs.getString("checkoutdate"));
				booking.setRoomtype(rs.getString("roomtype"));
				bookings.add(booking);
			}
			rs.close();
			pstat.close();			
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return bookings;
	}
	
	public boolean update(Booking booking) {
		boolean result=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/luton_hotel", "root", "");
			String strSql = "UPDATE booking SET  name=?, mobileno=?, address=?, age=?, gender=?, checkindate=?, checkoutdate=?, roomtype=? WHERE bid=?";
			PreparedStatement pstat = conn.prepareStatement(strSql);
			pstat.setString(1, booking.getName());
			pstat.setString(2, booking.getMobileno());
			pstat.setString(3, booking.getAddress());
			pstat.setString(4, booking.getAge());
			pstat.setString(5, booking.getGender());
			pstat.setString(6, booking.getCheckindate());
			pstat.setString(7, booking.getCheckoutdate());
			pstat.setString(8, booking.getRoomtype());
			pstat.setInt(9, booking.getBid());

			//pstat.setInt(10, booking.getBid());
			pstat.executeUpdate();
			conn.close();
			System.out.println("Record Updated!");
			result=true;
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
			result=false;
		}
		return result;
	}
	public boolean delete(int bid) {
		boolean result=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/luton_hotel", "root", "");
			String strSql = "DELETE FROM booking WHERE bid=?";
			PreparedStatement pstat = conn.prepareStatement(strSql);
			pstat.setInt(1, bid);
			
			pstat.execute();
			conn.close();
			System.out.println("Record Deleted!");
			result=true;
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
			result=false;
		}
		return result;
	}
}
