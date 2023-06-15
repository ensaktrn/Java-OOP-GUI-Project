package marmara;


import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowEvents {
	String concert_list[]= {"Uzi","Billie Elish","Manga"};
	String theatre_list[]= {"Romeo ve Juliet","Hamlet","12.Night"};
	
	public static int c;
	private JFrame frame;
	JComboBox<String> jcb;
	String func;
	int a=0,b=0;
	
	private void concert()
	{
		jcb=new JComboBox<String>(concert_list);
	}
	private void theathre()
	{
		jcb=new JComboBox<String>(theatre_list);
	}
	public ShowEvents(String db) {						
		this.func=db;									//Opens concert or theater page
		if(func.equalsIgnoreCase("concert")) {
			concert();
			a=1;}
		else {
			theathre();
			b=3;}
		initialize();
	}

	
	private void initialize() {								
		frame = new JFrame("Events");								//Creates Events frame
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		jcb.setBounds(158, 89, 212, 30);
		frame.getContentPane().add(jcb);
		if(a==1) {
			JLabel lblEvents = new JLabel("Artist");
			lblEvents.setHorizontalAlignment(SwingConstants.CENTER);
			lblEvents.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblEvents.setBounds(45, 92, 101, 27);
			frame.getContentPane().add(lblEvents);
		}
		else {
		JLabel lblEvents = new JLabel("Play");
		lblEvents.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvents.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEvents.setBounds(45, 92, 101, 27);
		frame.getContentPane().add(lblEvents);
		}
		
		JButton btnSubmit = new JButton("SUBMIT");			//Opens detail page that user picked by clicking 
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c=Integer.valueOf(EventDetails.event_ticket[jcb.getSelectedIndex()+b]);
				ShowDetails sd = new ShowDetails((String) jcb.getSelectedItem());
			}
		});
		btnSubmit.setBounds(155, 176, 127, 39);
		frame.getContentPane().add(btnSubmit);
		frame.setVisible(true);
		
		
		
	}
}
