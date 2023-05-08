package lutonhotelsystem;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class hotelbook extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel  lblName, lblMobileno, lblAddress, lblAge, lblGender, lblCheckindate, lblCheckoutdate, lblRoomtype;
	JTextField  txtName, txtMobileno, txtAddress, txtAge, txtGender, txtCheckindate, txtCheckoutdate, txtRoomtype,txtbid;
	JButton btnSave, btnSelect, btnEdit, btnDelete, btnClose;
	JLabel imageLabel;
	// Table
	String[] columnNames = { "BID", "Name", "Mobile No", "Address", "Age", "Gender", "Check-in Date", "Check-out Date", "Room Type", "Booking Status" };
	JTable table1;
	DefaultTableModel tableModel;
	JScrollPane scroll;

	public hotelbook() {
		this.setTitle("Booking System");
		this.setSize(1000, 750);
		this.setResizable(false);
		this.setLayout(null);

		lblName = new JLabel("Name : ");
		lblName.setBounds(250, 165, 75, 25);
		lblMobileno = new JLabel("Mobile No. : ");
		lblMobileno.setBounds(550, 165, 75, 25);
		lblAddress = new JLabel("Address : ");
		lblAddress.setBounds(250, 205, 75, 25);
		lblAge = new JLabel("Age : ");
		lblAge.setBounds(550, 205, 75, 25);
		lblGender = new JLabel("Gender : ");
		lblGender.setBounds(400, 245, 75, 25);
		lblCheckindate = new JLabel("Check-in Date : ");
		lblCheckindate.setBounds(250, 285, 95, 25);
		lblCheckoutdate = new JLabel("Check-out Date : ");
		lblCheckoutdate.setBounds(550, 285, 115, 25);
		lblRoomtype = new JLabel("Room Type : ");
		lblRoomtype.setBounds(400, 325, 75, 25);

		

		txtName = new JTextField();
		txtName.setBounds(330, 165, 175, 25);
		txtName.setBackground(new Color(51, 204, 255));
		txtName.setForeground(Color.BLACK);
		
		txtMobileno = new JTextField();
		txtMobileno.setBounds(630, 165, 175, 25);
		txtMobileno.setBackground(new Color(51, 204, 255));
		txtMobileno.setForeground(Color.BLACK);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(330, 205, 175, 25);
		txtAddress.setBackground(new Color(51, 204, 255));
		txtAddress.setForeground(Color.BLACK);
		
		txtAge = new JTextField();
		txtAge.setBounds(630, 205, 175, 25);
		txtAge.setBackground(new Color(51, 204, 255));
		txtAge.setForeground(Color.BLACK);
		
		txtGender = new JTextField();
		txtGender.setBounds(500, 245, 175, 25);
		txtGender.setBackground(new Color(51, 204, 255));
		txtGender.setForeground(Color.BLACK);
		
		txtCheckindate = new JTextField();
		txtCheckindate.setBounds(360, 285, 175, 25);
		txtCheckindate.setBackground(new Color(51, 204, 255));
		txtCheckindate.setForeground(Color.BLACK);
		
		txtCheckoutdate = new JTextField();
		txtCheckoutdate.setBounds(680, 285, 175, 25);
		txtCheckoutdate.setBackground(new Color(51, 204, 255));
		txtCheckoutdate.setForeground(Color.BLACK);
		
		txtRoomtype = new JTextField();
		txtRoomtype.setBounds(500, 325, 175, 25);
		txtRoomtype.setBackground(new Color(51, 204, 255));
		txtRoomtype.setForeground(Color.BLACK);
		txtbid = new JTextField();
		txtbid.setBounds(0,0,120,20);
		btnSave = new JButton("BOOK");
		btnSave.setBounds(150, 125, 80, 25);
		btnSave.addActionListener(this);
		add(txtbid);
		txtbid.setVisible(false);

		

		btnSelect = new JButton("SELECT");
		btnSelect.setBounds(320, 125, 100, 25);
		btnSelect.addActionListener(this);

		btnEdit = new JButton("EDIT");
		btnEdit.setBounds(505, 125, 90, 25);
		btnEdit.addActionListener(this);

		btnDelete = new JButton("DELETE");
		btnDelete.setBounds(650, 125, 100, 25);
		btnDelete.addActionListener(this);

		btnClose = new JButton("CLOSE");
		btnClose.setBounds(825, 125, 90, 25);
		btnClose.addActionListener(this);

		// Table
		tableModel = new DefaultTableModel();
		tableModel.setColumnIdentifiers(columnNames);
		table1 = new JTable();
		table1.setModel(tableModel);
		table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table1.setFillsViewportHeight(true);
		scroll = new JScrollPane(table1);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(0, 455, 1000, 325);
		scroll.setBackground(new Color(51, 204, 255));
		scroll.setForeground(Color.BLACK);
		

		updateTable();

		
		this.add(lblName);
		this.add(txtName);
		this.add(lblMobileno);
		this.add(txtMobileno);
		this.add(lblAddress);
		this.add(txtAddress);
		this.add(lblAge);
		this.add(txtAge);
		this.add(lblGender);
		this.add(txtGender);
		this.add(lblCheckindate);
		this.add(txtCheckindate);
		this.add(lblCheckoutdate);
		this.add(txtCheckoutdate);
		this.add(lblRoomtype);
		this.add(txtRoomtype);
		this.add(btnSave);
		this.add(btnSelect);
		this.add(btnEdit);
		this.add(btnDelete);
		this.add(btnClose);
		this.add(scroll);
		
		
		imageLabel = new JLabel();
		ImageIcon ig = new ImageIcon(getClass().getResource("book.jpg"));
		imageLabel.setIcon(ig);
        imageLabel.setBounds(0, 0, 1000, 720);
        this.add(imageLabel, BorderLayout.CENTER);
		
		
		
		
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new hotelbook();
	}

	public void updateTable() {
		tableModel.setRowCount(0);
		int cid = Customer.cid;
		ArrayList bookings = new Booking_jdbc().all(cid);
		for (int i = 0; i < bookings.size(); i++) {
			Booking booking = (Booking) bookings.get(i);
			tableModel.addRow(new Object[] { booking.getBid(), booking.getName(), booking.getMobileno(), booking.getAddress(), booking.getAge(), booking.getGender(), booking.getCheckindate(), booking.getCheckoutdate(), booking.getRoomtype(), "pending"});
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClose) {
			this.dispose();
		} else if (e.getSource() == btnSave) {
			// save
			String name = txtName.getText();
			String mobileno = txtMobileno.getText();
			String address = txtAddress.getText();
			String age = txtAge.getText();
			String gender = txtGender.getText();
			String checkindate = txtCheckindate.getText();
			String checkoutdate = txtCheckoutdate.getText();
			String roomtype = txtRoomtype.getText();
			int cid = Customer.cid;
			System.out.println(cid);
			
			if ( name.equals("") || mobileno.equals("") || address.equals("") || age.equals("") || gender.equals("") || checkindate.equals("") || checkoutdate.equals("") || roomtype.equals("")) {
	            JOptionPane.showMessageDialog(null, "All Fields are Required!");
			}
	        else {
			Booking b1 = new Booking(cid,name, mobileno, address, age, gender, checkindate, checkoutdate, roomtype);
			boolean result = new Booking_jdbc().insert(b1);
			if (result) {
				updateTable();
				JOptionPane.showMessageDialog(this, "Record Saved");
			} else {
				JOptionPane.showMessageDialog(this, "Error to save record");
			}
	        }
		} else if (e.getSource() == btnEdit) {
			// edit
			//int bid = Integer.parseInt(txtID.getText());
			//String email = txtEmail.getText();
			String name = txtName.getText();
			String mobileno = txtMobileno.getText();
			String address = txtAddress.getText();
			String age = txtAge.getText();
			String gender = txtGender.getText();
			String checkindate = txtCheckindate.getText();
			String checkoutdate = txtCheckoutdate.getText();
			String roomtype = txtRoomtype.getText();
			int bid = Integer.parseInt(txtbid.getText());
			int cid = Customer.cid;

			Booking booking = new Booking(cid,bid,name, mobileno, address, age, gender, checkindate, checkoutdate, roomtype);
			boolean result = new Booking_jdbc().update(booking);
			if (result) {
				updateTable();
				JOptionPane.showMessageDialog(this, "Record updated!");
			} else {
				JOptionPane.showMessageDialog(this, "Error to update record");
			}
		} else if (e.getSource() == btnDelete) {
			// delete
			
			int bid = Integer.parseInt(txtbid.getText());
			boolean result = new Booking_jdbc().delete(bid);
			if (result=true) {
				updateTable();
				//txtID.setText("");
				//txtEmail.setText("");
				txtName.setText("");
				txtMobileno.setText("");
				txtAddress.setText("");
				txtAge.setText("");
				txtGender.setText("");
				txtCheckindate.setText("");
				txtCheckoutdate.setText("");
				txtRoomtype.setText("");
				JOptionPane.showMessageDialog(this, "Record Deleted!");
			} else {
				JOptionPane.showMessageDialog(this, "Error to delete record");
			}
		}
		else if (e.getSource() == btnSelect) {
			// Select
			int rowID = table1.getSelectedRow();
			
			txtbid.setText(table1.getValueAt(rowID, 0).toString());
			txtName.setText(table1.getValueAt(rowID, 1).toString());
			txtMobileno.setText(table1.getValueAt(rowID, 2).toString());
			txtAddress.setText(table1.getValueAt(rowID, 3).toString());
			txtAge.setText(table1.getValueAt(rowID, 4).toString());
			txtGender.setText(table1.getValueAt(rowID, 5).toString());
			txtCheckindate.setText(table1.getValueAt(rowID, 6).toString());
			txtCheckoutdate.setText(table1.getValueAt(rowID, 7).toString());
			txtRoomtype.setText(table1.getValueAt(rowID, 8).toString());
		}
	}
}
