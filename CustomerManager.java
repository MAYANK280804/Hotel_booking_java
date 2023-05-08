package lutonhotelsystem;
import lutonhotelsystem.Customer;
public class CustomerManager {
	public int login(Customer customer) {
		//Receive user info from UI
		//Validate user info
		//Send user info to DB
		//Receive user status from DB
		//Return Login status to UI
		cust_jdbc cust_jdbc = new cust_jdbc();
		int result = cust_jdbc.login(customer);
		return result;
	}

}
