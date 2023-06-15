package marmara;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ShowDetails {

	private JFrame frame;
	private JLabel lblName_data, lblCoordinator_data,lblTicket_data,lblSeating_data,lblDate_data,lblTime_data;
	
	public ShowDetails(String event) {
		fillDetails(event);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void fillDetails(String event)
	{
		EventDetails ed = new EventDetails(event);					//Taking event details form EventDetails class
		lblName_data=new JLabel(ed.name());
		lblCoordinator_data = new JLabel(ed.coordinator());
		lblTicket_data = new JLabel(ed.ticket());
		lblSeating_data = new JLabel(ed.seating());
		lblDate_data = new JLabel(ed.date());
		lblTime_data = new JLabel(ed.time());
		
	}
	private void initialize() {
		frame = new JFrame("Details");								    //Creating Details frame
		frame.setBounds(100, 100, 484, 478);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name :");							//Content of Details frame
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setBounds(40, 50, 110, 40);
		frame.getContentPane().add(lblName);
		
		JLabel lblCoordinator = new JLabel("Co-ordinator :");
		lblCoordinator.setHorizontalAlignment(SwingConstants.LEFT);
		lblCoordinator.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCoordinator.setBounds(40, 100, 113, 37);
		frame.getContentPane().add(lblCoordinator);
		
		JLabel lblTicket = new JLabel("Ticket price :");
		lblTicket.setHorizontalAlignment(SwingConstants.LEFT);
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTicket.setBounds(40, 150, 113, 37);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblSeating = new JLabel("Seating :");
		lblSeating.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeating.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSeating.setBounds(40, 200, 130, 37);
		frame.getContentPane().add(lblSeating);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDate.setBounds(40, 250, 113, 37);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time :");
		lblTime.setHorizontalAlignment(SwingConstants.LEFT);
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime.setBounds(40, 300, 130, 37);
		frame.getContentPane().add(lblTime);
		
		lblName_data.setHorizontalAlignment(SwingConstants.LEFT);
		lblName_data.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName_data.setBounds(170, 52, 180, 37);
		frame.getContentPane().add(lblName_data);
		
		lblCoordinator_data.setHorizontalAlignment(SwingConstants.LEFT);
		lblCoordinator_data.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCoordinator_data.setBounds(170, 100, 180, 37);
		frame.getContentPane().add(lblCoordinator_data);
		
		lblTicket_data.setHorizontalAlignment(SwingConstants.LEFT);
		lblTicket_data.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTicket_data.setBounds(170, 150, 180, 37);
		frame.getContentPane().add(lblTicket_data);
		
		lblSeating_data.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeating_data.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSeating_data.setBounds(170, 200, 180, 37);
		frame.getContentPane().add(lblSeating_data);
		
		lblDate_data.setVerticalAlignment(SwingConstants.TOP);
		lblDate_data.setHorizontalAlignment(SwingConstants.LEFT);
		lblDate_data.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate_data.setBounds(170, 258, 264, 101);
		frame.getContentPane().add(lblDate_data);
		frame.setVisible(true);
		
		lblTime_data.setVerticalAlignment(SwingConstants.TOP);
		lblTime_data.setHorizontalAlignment(SwingConstants.LEFT);
		lblTime_data.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTime_data.setBounds(170, 310, 264, 101);
		frame.getContentPane().add(lblTime_data);
		frame.setVisible(true);
		
		JButton btnNewButton = new JButton("Book Tickets");					//Opens Sale frame by clicking the button
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					TicketSale shw = new TicketSale();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(170, 350, 148, 51);
		frame.getContentPane().add(btnNewButton);
	}
}
