package lutonhotelsystem;


import java.io.Serializable;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int cid;
	String name;
	String email;
	String dob;
	String mobile_no;
	String gender;
	String password;
	String address;
	String creditcardno;
	String expiryon;
	
	public Customer() {	
		this.name = "";
		this.email = "";
		this.dob = "";
		this.mobile_no = "";
		this.gender = "";
		this.password = "";
		this.address = "";
		this.creditcardno = "";
		this.expiryon = "";
		
	}
	
	public Customer(int cid) {
		Customer.cid = cid;
	}
	
	public Customer( String name, String email, String dob, String mobile_no, String gender, String password, String address, String creditcardno, String expiryon) {	
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.mobile_no = mobile_no;
		this.gender = gender;
		this.password = password;
		this.address = address;
		this.creditcardno = creditcardno;
		this.expiryon = expiryon;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDOB() {
		return dob;
	}
	public void setDOB(String dob) {
		this.dob = dob;
	}
	public String getMobile_No() {
		return mobile_no;
	}
	public void setMobile_No(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreditcardno() {
		return creditcardno;
	}
	public void setCreditcardno(String creditcardno) {
		this.creditcardno = creditcardno;
	}
	public String getExpiryon() {
		return expiryon;
	}
	public void setExpiryon(String expiryon) {
		this.expiryon = expiryon;
	}
	

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + ", dob=" + dob + ", mobile_no=" + mobile_no + ", gender=" + gender + ", password=" + password + ", address=" + address + ", creditcardno=" + creditcardno + ", expiryon=" + expiryon + "]";
	}	
}
