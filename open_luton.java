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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;




@SuppressWarnings("serial")
public class open_luton extends JFrame implements ActionListener {
	JLabel imageLabel;
	JButton btnAbout;
	
	public open_luton() {
		this.setTitle("Welcome To Luton Hotel");
		this.setSize(600, 400);
		this.setResizable(false);
		this.setLayout(null);
		
		

		
		JMenuBar menuBar = new JMenuBar();

        this.add(menuBar);
        
        JMenu menu = new JMenu("Menu");
		menuBar.setBounds(450,50,50,30);
		menuBar.setBackground(new Color(204,204,204));
		menuBar.setForeground(Color.white);
		
        menuBar.add(menu);
        
        
        
        final JMenuItem menuItem1 = new JMenuItem("Login");
        menuItem1.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent ae) {
        		if (ae.getSource()== menuItem1) {
        		dispose();
        			new Login();
        		}
        	}
        });
        menu.add(menuItem1);
        
        final JMenuItem menuItem2 = new JMenuItem("Signup");
        menuItem2.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent ae) {
        		if (ae.getSource()== menuItem2) {
        		dispose();
        			new cust_Regii();
        		}
        	}
        });
        menu.add(menuItem2);

        // Add the ActionListener to each JMenuItem
      
        


        // Add the JMenuBar to the JPanel
        this.add(menuBar);
        					
        
        
        JLabel title = new JLabel("Welcome To Luton Hotel", JLabel.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 25));
		title.setForeground(Color.CYAN);
		title.setPreferredSize(new Dimension(600, 100));
		title.setBounds(140,160,400,50);
		this.add(title);

        
        

		
		
		
        btnAbout = new JButton("About Us");
        btnAbout.setBounds(320, 50, 90, 30);
        btnAbout.setBackground(new Color(204,204,204));
        btnAbout.setForeground(Color.BLACK);
        btnAbout.addActionListener(this);
		
		

		this.add(btnAbout);
		
		imageLabel = new JLabel();
		ImageIcon ig = new ImageIcon(getClass().getResource("opn145.jpg"));
		imageLabel.setIcon(ig);
        imageLabel.setBounds(0, 0, 600, 400);
        this.add(imageLabel, BorderLayout.CENTER);
        
        
      

		this.setVisible(true);
	}
	


    // Implement the actionPerformed method from the ActionListener interface
    public void actionPerformed(ActionEvent e) {
        // Handle the button click event
    	if (e.getSource() == btnAbout) {
			this.dispose();
			new about_us().setVisible(true);
			}
    }
    
    
	public static void main(String[] args) {
		new open_luton();
	}
	
	

}
