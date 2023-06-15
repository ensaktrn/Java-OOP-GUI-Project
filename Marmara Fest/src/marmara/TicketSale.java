package marmara;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TicketSale {
	private JFrame fr,f;
	public TicketSale() throws IOException{
		frame();
	}
	public void frame() throws IOException {
		fr = new JFrame("Sale");									//Crates the Sale frame
		fr.setBounds(370, 130, 380, 500);
		fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fr.getContentPane().setLayout(null);
		fr.setVisible(true);
			
		JLabel lblName = new JLabel("Name :");						//Content of the frame
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(20, 50, 113, 37);
		fr.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname :");
		lblSurname.setHorizontalAlignment(SwingConstants.LEFT);
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSurname.setBounds(20, 100, 113, 37);
		fr.getContentPane().add(lblSurname);
		
		JLabel lblStudentNo = new JLabel("Student No :");
		lblStudentNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStudentNo.setBounds(20, 150, 113, 37);
		fr.getContentPane().add(lblStudentNo);
		
		JLabel lblDepartment = new JLabel("Department :");
		lblDepartment.setHorizontalAlignment(SwingConstants.LEFT);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDepartment.setBounds(20, 200, 150, 37);
		fr.getContentPane().add(lblDepartment);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBounds(20, 250, 150, 37);
		fr.getContentPane().add(lblGender);
		
		JLabel lblTicket = new JLabel("Amount of ticket :");
		lblTicket.setHorizontalAlignment(SwingConstants.LEFT);
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTicket.setBounds(20, 300, 150, 37);
		fr.getContentPane().add(lblTicket);
		
		JTextField tName = new JTextField();
		tName.setHorizontalAlignment(SwingConstants.LEFT);
		tName.setBounds(180, 60, 120, 20);
		fr.getContentPane().add(tName);
		
		JTextField tSur = new JTextField();
		tSur.setHorizontalAlignment(SwingConstants.LEFT);
		tSur.setBounds(180, 110, 120, 20);
		fr.getContentPane().add(tSur);
		
		JTextField tNo = new JTextField();
		tNo.setHorizontalAlignment(SwingConstants.LEFT);
		tNo.setBounds(180, 160, 120, 20);
		fr.getContentPane().add(tNo);
		
		JTextField tDepart = new JTextField();
		tDepart.setHorizontalAlignment(SwingConstants.LEFT);
		tDepart.setBounds(180, 210, 120, 20);
		fr.getContentPane().add(tDepart);
		
		JRadioButton gender1=new JRadioButton("Male");
		JRadioButton gender2=new JRadioButton("Female");
		ButtonGroup b=new ButtonGroup();
		b.add(gender1);b.add(gender2);
		gender1.setBounds(140, 255, 80, 30);
		gender2.setBounds(220, 255, 80, 30);
		fr.add(gender1);fr.add(gender2);
		
		String number[]= {null,"1","2","3"};
		JComboBox<String> cb=new JComboBox(number);
		cb.setBounds(180, 310, 50, 20);
		fr.add(cb);
		
		JLabel price=new JLabel("Price: ");
		price.setBounds(260, 305, 100, 30);
		
		fr.add(price);
		cb.addActionListener(new ActionListener() {				//Calculates the price based on the amount of the ticket
			public void actionPerformed(ActionEvent arg0) {
				price.setText("Price: "+ShowEvents.c*cb.getSelectedIndex()+"TL");
			}
		});
	
		
		JButton book = new JButton("Book");
		book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {					//Checks if there are any empty space.If there are it gives error.
			f=new JFrame();										
			if(tName.getText().length() == 0 || tSur.getText().length() == 0 ||tNo.getText().length() == 0 ||tDepart.getText().length() == 0) {
				JOptionPane.showMessageDialog(f,"Please fill in all the blanks","Alert",JOptionPane.WARNING_MESSAGE);
				
			}
			else if(cb.getSelectedItem()==null){
				JOptionPane.showMessageDialog(f,"Please select the amount of tickets","Alert",JOptionPane.WARNING_MESSAGE);
			}
			else {															//If every slot has been filled it gives the info and close the page
		    BookList bookList=new BookList(tName.getText(),tSur.getText(),tNo.getText(),tDepart.getText(),cb.getSelectedIndex());
			JOptionPane.showMessageDialog(f,"Your tickets are succesfully booked.You need to buy them from your department"
					+ " officer within 3 days.(Otherwise you need to book again)");
			fr.dispose();
			}}
			
		});
		
													
		JButton cancel = new JButton("Cancel");				//Close the Sale frame by clicking 
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			fr.dispose();
			}
		});
		book.setBounds(30, 380, 148, 51);
		cancel.setBounds(200, 380, 148, 51);
		fr.add(book);
		fr.add(cancel);
		
		
		

}}
