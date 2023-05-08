package lutonhotelsystem;

import java.io.Serializable;

public class Booking  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int bid;
	int cid;
	String name;
	String mobileno;
	String address;
	String age;
	String gender;
	String checkindate;
	String checkoutdate;
	String roomtype;

	public Booking() {	
		this.bid = 0;
		this.cid = 0;
		this.name = "";
		this.mobileno = "";
		this.address = "";
		this.age = "";
		this.gender = "";
		this.checkindate = "";
		this.checkoutdate = "";
		this.roomtype = "";
		
	}
	
	public Booking(int cid, int bid,String name, String mobileno, String address, String age, String gender, String checkindate, String checkoutdate, String roomtype) {	
		this.bid = bid;
		this.cid = cid;
		this.name = name;
		this.mobileno = mobileno;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.checkindate = checkindate;
		this.checkoutdate = checkoutdate;
		this.roomtype = roomtype;
	}
	public Booking(int cid,String name, String mobileno, String address, String age, String gender, String checkindate, String checkoutdate, String roomtype) {	
		this.cid = cid;
		this.name = name;
		this.mobileno = mobileno;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.checkindate = checkindate;
		this.checkoutdate = checkoutdate;
		this.roomtype = roomtype;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCheckindate() {
		return checkindate;
	}
	public void setCheckindate(String checkindate) {
		this.checkindate = checkindate;
	}
	public String getCheckoutdate() {
		return checkoutdate;
	}
	public void setCheckoutdate(String checkoutdate) {
		this.checkoutdate = checkoutdate;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	@Override
	public String toString() {
		return "Booking [bid=" + bid + ", cid=" + cid +" name=" + name + ", mobileno=" + mobileno + ", address=" + address + ", age=" + age + ", gender=" + gender + ", checkindate=" + checkindate + ", checkoutdate=" + checkoutdate + ", roomtype=" + roomtype + "]";
	}	
}
