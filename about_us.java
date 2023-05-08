package lutonhotelsystem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;






public class about_us extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel imageLabel;
	JButton btnHome;
	
	
	
	public about_us() {
		this.setTitle("About LUTON HOTEL");
		this.setSize(1000, 750);
		this.setResizable(false);
		this.setLayout(null);
		
		
		JLabel[] labels = new JLabel[32];
		
		labels[0] = new JLabel("Welcome to the Luton Hotel, a premier destination for travelers seeking comfort, convenience, and style. ");
		labels[1] = new JLabel("Located in the heart of the bustling city, our hotel offers easy access to a range of attractions, including local restaurants, ");
		labels[2] = new JLabel("shopping centers, and cultural hotspots. At Luton Hotel, we strive to provide our guests with an unforgettable experience that will make them");
		labels[3] = new JLabel("want to return again and again. Our hotel features a range of spacious and elegantly appointed guest rooms, each designed to provide the ultimate");
		labels[4] = new JLabel("in relaxation and comfort. Whether you're traveling alone or with a group, our rooms are designed to meet your needs, with amenities such as ");
		labels[5] = new JLabel("plush bedding, flat-screen TVs, and complimentary Wi-Fi access. ");
		labels[6] = new JLabel("For those seeking relaxation and rejuvenation, Luton Hotel offers a range of wellness facilities, including a state-of-the-art fitness center, ");
		labels[7] = new JLabel("a sauna, and a Jacuzzi. Our friendly and knowledgeable staff is always on hand to help you make the most of your stay, whether you're looking for ");
		labels[8] = new JLabel("recommendations on local attractions or need help with any aspect of your visit.");
		labels[9] = new JLabel("At Luton Hotel, we're committed to providing our guests with an exceptional experience that exceeds their expectations. Whether you're traveling for business");
		labels[10] = new JLabel("or pleasure, we invite you to discover the charm and elegance of our hotel and make it your home away from home.At Luton Hotel, we strive to provide our guests ");
		labels[11] = new JLabel("with a comfortable and enjoyable stay. To ensure that all our guests have a pleasant experience, we have outlined some important terms and policies ");
		labels[12] = new JLabel("that we ask all our guests to adhere to.");
		labels[13] = new JLabel("Check-in and Check-out:");
		labels[14] = new JLabel("- Check-in time is at 3:00 PM and check-out time is at 11:00 AM. Early check-in and late check-out are subject to availability and may incur additional charges.");
		labels[15] = new JLabel("- A valid government-issued ID and a credit card are required at check-in. The credit card will be authorized for incidental charges, and the guest will be ");
		labels[16] = new JLabel("responsible for any damages or additional charges incurred during their stay.");
		labels[17] = new JLabel("- Guests must be at least 18 years of age to check-in.");
		labels[18] = new JLabel("Cancellation and Reservation Policies:");
		labels[19] = new JLabel("- Reservations must be canceled at least 24 hours prior to the check-in time to avoid a penalty charge of one night's room and tax.");
		labels[20] = new JLabel("- Rates are subject to change without notice and are based on availability at the time of booking.");
		labels[21] = new JLabel("- All reservations must be guaranteed by a credit card or advance payment.");
		labels[22] = new JLabel("Pet Policy:");
		labels[23] = new JLabel("- We understand that pets are part of the family, but unfortunately, we do not allow pets at Luton Hotel, with the exception of service animals.");
		labels[24] = new JLabel("- Guests found with unauthorized pets in their room will be charged a $250 cleaning fee.");
		labels[25] = new JLabel("Smoking Policy:");
		labels[26] = new JLabel("- Luton Hotel is a smoke-free hotel, and smoking is not allowed in any of the guest rooms or public areas.");
		labels[27] = new JLabel("- A $250 cleaning fee will be charged to guests who smoke in their room or in any other prohibited areas.");
		labels[28] = new JLabel("Damage or Theft:");
		labels[29] = new JLabel("- Guests will be held responsible for any damage or theft caused to the hotel's property or furnishings during their stay.");
		labels[30] = new JLabel("- Luton Hotel reserves the right to charge the guest's credit card on file for any damages or theft caused during their stay.");
		labels[31] = new JLabel("We appreciate your cooperation with these policies, and we hope you have a pleasant stay at Luton Hotel.");
		
		
		for (int i = 0; i < labels.length; i++) {
		    labels[i].setForeground(Color.DARK_GRAY);
		    labels[i].setBounds(new Rectangle(10, 00 + i * 20, 1070, 120));
		    labels[i].setFont(new Font("Tahoma",Font.BOLD,12));
		}
		for (JLabel label : labels) {
		    this.add(label);
		}
		
		btnHome = new JButton("HOME");
		btnHome.setBounds(790, 10, 80, 25);
		btnHome.setBackground(new Color(47,79,79));
		btnHome.setForeground(Color.white);
		btnHome.addActionListener(this);
		
		
		
		
		this.add(btnHome);
		
		
		imageLabel = new JLabel();
		ImageIcon ig = new ImageIcon(getClass().getResource("abss1.jpeg"));
		imageLabel.setIcon(ig);
        imageLabel.setBounds(0, 0, 1250, 750);
        this.add(imageLabel, BorderLayout.CENTER);

		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnHome) {
			this.dispose();
			new open_luton().setVisible(true);
		} 
	}
	public static void main(String[] args) {
		new about_us();
	}
	

}
