package lutonhotelsystem;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Login extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JCheckBox agreeCheckbox;
    JLabel lblEmail, lblPassword;
    JLabel imageLabel;
    JPasswordField txtPassword;
    JTextField txtEmail;
    JButton btnLogin, btnRegister, btnClose;
    //JFrame frame;
    public Login() {
    	this.setTitle("Login To Luton Hotel");
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		
		
        
        
        JLabel title = new JLabel("LOGIN HERE", JLabel.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 35));
		title.setForeground(Color.ORANGE);
		title.setPreferredSize(new Dimension(600, 100));
		title.setBounds(0,10,300,50);
		this.add(title);
		
		
		
		
		
        
        lblEmail = new JLabel("Email :");
        lblEmail.setForeground(Color.magenta);
        lblEmail.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblEmail.setBounds(5,310,200,30);
        this.add(lblEmail);
        
        
        txtEmail = new JTextField();
        txtEmail.setFont(new Font("Tahoma",Font.PLAIN,20));
        txtEmail.setBounds(105,310,180,30);
        txtEmail.setBackground(new Color(0, 255, 255));
        txtEmail.setForeground(Color.GRAY);
        txtEmail.setBorder(BorderFactory.createLineBorder(Color.white,1));
        this.add(txtEmail);
        
        lblPassword = new JLabel("Password :");
        lblPassword.setForeground(Color.magenta);
        lblPassword.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblPassword.setBounds(5,360,200,30);
        this.add(lblPassword);
        
        
        txtPassword = new JPasswordField();
        txtPassword.setFont(new Font("Tahoma",Font.PLAIN,20));
        txtPassword.setBounds(105,360,180,30);
        txtPassword.setBackground(new Color(0, 255, 255));
        txtPassword.setForeground(Color.GRAY);
        txtPassword.setBorder(BorderFactory.createLineBorder(Color.white,1));
        this.add(txtPassword);
        
        agreeCheckbox = new JCheckBox("I agree to the terms and conditions");
        agreeCheckbox.setFont(new Font("Tahoma",Font.PLAIN,20));
        agreeCheckbox.setBounds(350,80,350,35);
        agreeCheckbox.setBackground(new Color(102, 51, 0));
        agreeCheckbox.setFocusable(false);
        agreeCheckbox.setForeground(Color.YELLOW);
        agreeCheckbox.setBorder(BorderFactory.createLineBorder(Color.white,1));
        this.add(agreeCheckbox);
        
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(this);
     
        btnLogin.setFont(new Font("Tahoma",Font.PLAIN,20));
        btnLogin.setBounds(465,235,90,35);
        btnLogin.setBackground(new Color(47,79,79));
        btnLogin.setFocusable(false);
        btnLogin.setForeground(Color.white);
        btnLogin.setBorder(BorderFactory.createLineBorder(Color.white,1));
        this.add(btnLogin);
        
        
        btnRegister=new JButton("Register");
        btnRegister.addActionListener(this);
        btnRegister.setFont(new Font("Tahoma",Font.PLAIN,20));
        btnRegister.setBounds(465,275,90,35);
        btnRegister.setBackground(new Color(47,79,79));
        btnRegister.setFocusable(false);
        btnRegister.setForeground(Color.white);
        btnRegister.setBorder(BorderFactory.createLineBorder(Color.white,1));
        this.add(btnRegister);
        
        btnClose=new JButton("Close");
        btnClose.addActionListener(this);
        btnClose.setFont(new Font("Tahoma",Font.PLAIN,20));
        btnClose.setBounds(465,320,90,35);
        btnClose.setBackground(new Color(47,79,79));
        btnClose.setFocusable(false);
        btnClose.setForeground(Color.white);
        btnClose.setBorder(BorderFactory.createLineBorder(Color.white,1));
        this.add(btnClose);
        
        //this.add(center);
        this.setSize(750, 450);
        
        imageLabel = new JLabel();
		ImageIcon ig = new ImageIcon(getClass().getResource("logiiiii.jpeg"));
		imageLabel.setIcon(ig);
        imageLabel.setBounds(0, 0, 850, 655);
        this.add(imageLabel, BorderLayout.CENTER);
        
        
        
        
		this.setVisible(true);
		
    }
    
    public static void main(String[] args) {
        new Login();
    }
    @SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClose) {
			this.dispose();
		} 
		else if(e.getSource()==btnLogin) {
			if (agreeCheckbox.isSelected()) {
				//do login

				Customer customer = new Customer();
				customer.setEmail(txtEmail.getText());
				customer.setPassword(txtPassword.getText());
				CustomerManager customerManager=new CustomerManager();
				int result = customerManager.login(customer);
					if(result != 0) {
						this.dispose();
						new hotelbook().setVisible(true);
						//JOptionPane.showMessageDialog(this, "Welcome!");
						
					}
					else {
						JOptionPane.showMessageDialog(this, "Error to Login!");
					}
				
			}
			else {
                JOptionPane.showMessageDialog(Login.this,
                    "You must agree to the terms and conditions to login.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
			
			
		}else if (e.getSource() == btnRegister) {
			this.dispose();
			new cust_Regii().setVisible(true);
		}
	}

}
