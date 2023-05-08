package lutonhotelsystem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;




public class cust_Regii extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lblName, lblEmail, lblDOB, lblMobile_No, lblGender, lblPassword, lblAddress, lblCreditcardno, lblExpiryon;
	JLabel imageLabel;
	JTextField txtName, txtEmail, txtDOB, txtMobile_No, txtGender, txtAddress, txtCreditcardno, txtExpiryon;
	JPasswordField txtPassword;
	JButton btnRegister, btnLogin, btnClose;
	
	public cust_Regii() {
		this.setTitle("Register To Luton Hotel");
		this.setSize(1000, 700);
		this.setResizable(false);
		this.setLayout(null);
		
		
		
		
		lblName = new JLabel("Name : ");
		lblName.setBounds(30, 65, 75, 25);
		lblEmail = new JLabel("Email ID : ");
		lblEmail.setBounds(410, 65, 75, 25);
		lblDOB = new JLabel("D.O.B : ");
		lblDOB.setBounds(30, 105, 75, 25);
		lblMobile_No = new JLabel("Mobile No : ");
		lblMobile_No.setBounds(410, 105, 75, 25);
		lblGender = new JLabel("Gender : ");
		lblGender.setBounds(250, 145, 75, 25);
		lblPassword = new JLabel("Password : ");
		lblPassword.setBounds(30, 185, 75, 25);
		lblAddress = new JLabel("Address : ");
		lblAddress.setBounds(410, 185, 75, 25);
		lblCreditcardno = new JLabel("Card No : ");
		lblCreditcardno.setBounds(30, 225, 75, 25);
		lblExpiryon = new JLabel("Expiry On : ");
		lblExpiryon.setBounds(410, 225, 75, 25);
		
		


		txtName = new JTextField();
		txtName.setBounds(100, 65, 195, 25);
		txtName.setBackground(new Color(102,102,102));
		txtName.setForeground(Color.white);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(500, 65, 195, 25);
		txtEmail.setBackground(new Color(102,102,102));
		txtEmail.setForeground(Color.white);
		
		txtDOB = new JTextField();
		txtDOB.setBounds(100, 105, 175, 25);
		txtDOB.setBackground(new Color(102,102,102));
		txtDOB.setForeground(Color.white);
		
		txtMobile_No = new JTextField();
		txtMobile_No.setBounds(500, 105, 175, 25);
		txtMobile_No.setBackground(new Color(102,102,102));
		txtMobile_No.setForeground(Color.white);
		
		txtGender = new JTextField();
		txtGender.setBounds(340, 145, 175, 25);
		txtGender.setBackground(new Color(102,102,102));
		txtGender.setForeground(Color.white);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(100, 185, 175, 25);
		txtPassword.setBackground(new Color(102,102,102));
		txtPassword.setForeground(Color.white);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(500, 185, 175, 25);
		txtAddress.setBackground(new Color(102,102,102));
		txtAddress.setForeground(Color.white);
		
		txtCreditcardno = new JTextField();
		txtCreditcardno.setBounds(100, 225, 175, 25);
		txtCreditcardno.setBackground(new Color(102,102,102));
		txtCreditcardno.setForeground(Color.white);
		
		txtExpiryon = new JTextField();
		txtExpiryon.setBounds(500, 225, 175, 25);
		txtExpiryon.setBackground(new Color(102,102,102));
		txtExpiryon.setForeground(Color.white);
		
		
		btnRegister = new JButton("REGISTER");
		btnRegister.setBounds(550, 440, 100, 25);
		btnRegister.setBackground(new Color(255,153,0));
		btnRegister.setForeground(Color.white);
		btnRegister.addActionListener(this);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(480, 480, 80, 25);
		btnLogin.setBackground(new Color(255,153,0));
		btnLogin.setForeground(Color.white);
		btnLogin.addActionListener(this);

		btnClose = new JButton("CLOSE");
		btnClose.setBounds(630, 480, 90, 25);
		btnClose.setBackground(new Color(255,153,0));
		btnClose.setForeground(Color.white);
		btnClose.addActionListener(this);
		
		
		this.add(lblName);
		this.add(txtName);
		this.add(lblEmail);
		this.add(txtEmail);
		this.add(lblDOB);
		this.add(txtDOB);
		this.add(lblMobile_No);
		this.add(txtMobile_No);
		this.add(lblGender);
		this.add(txtGender);
		this.add(lblPassword);
		this.add(txtPassword);
		this.add(lblAddress);
		this.add(txtAddress);
		this.add(lblCreditcardno);
		this.add(txtCreditcardno);
		this.add(lblExpiryon);
		this.add(txtExpiryon);
		this.add(btnRegister);
		this.add(btnLogin);
		this.add(btnClose);
		
		
		JLabel title = new JLabel("!! REGISTER NOW !!", JLabel.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 25));
		title.setForeground(Color.CYAN);
		title.setPreferredSize(new Dimension(600, 100));
		title.setBounds(400,540,500,80);
		this.add(title);
		
		
		
		
		
		
		imageLabel = new JLabel();
		ImageIcon ig = new ImageIcon(getClass().getResource("wrest-park.jpg"));
		imageLabel.setIcon(ig);
        imageLabel.setBounds(0, 0, 1250, 755);
        this.add(imageLabel, BorderLayout.CENTER);

		this.setVisible(true);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClose) {
			this.dispose();
		} else if (e.getSource() == btnRegister) {
			// Register
			//int cid = Integer.parseInt(txtID.getText());
			String name = txtName.getText();
			String email = txtEmail.getText();
			String dob = txtDOB.getText();
			String mobile_no = txtMobile_No.getText();
			String gender = txtGender.getText();
			String password = txtPassword.getText();
			String address = txtAddress.getText();
			String creditcardno = txtCreditcardno.getText();
			String expiryon = txtExpiryon.getText();
			
			// customer details validation
	        if ( name.equals("") || email.equals("") || dob.equals("") || mobile_no.equals("") || gender.equals("") || password.equals("") || address.equals("") || creditcardno.equals("") || expiryon.equals("") ) {
	            JOptionPane.showMessageDialog(null, "All Fields are Required!");
	        }
	        else if ( !email.contains("@") || !email.contains(".")  ) {
	            JOptionPane.showMessageDialog(null, "Invalid Email!");
	        }
	        else if ( password.length() < 8 ) {
	            JOptionPane.showMessageDialog(null, "Password must be 8 or more characters!");
	        }
	        else if ( creditcardno.length() != 16 ) {
	            JOptionPane.showMessageDialog(null, "Invalid Credit Card!");
	        }
	        else {
	    
			Customer c1 = new Customer(name, email, dob, mobile_no, gender, password, address, creditcardno, expiryon);
			boolean result = new cust_jdbc().insert(c1);
			if (result) {
				JOptionPane.showMessageDialog(this, "Record Saved");
			} else {
				JOptionPane.showMessageDialog(this, "Error to save record");
			}
	        }
		}
		else if (e.getSource() == btnLogin) {
			this.dispose();
			new Login();
		}
	}
	public static void main(String[] args) {
		new cust_Regii();
	}
	

}
