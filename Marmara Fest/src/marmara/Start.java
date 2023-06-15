package marmara;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import marmara.ShowEvents;
import marmara.Start;

public class Start {
private JFrame frame;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {					//Launch the program
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Start() {			
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();											//Create the main frame
		frame.setBounds(100, 100, 606, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel marmara = new JLabel("Marmara University Fest");			//Content of frame	
		marmara.setHorizontalAlignment(SwingConstants.CENTER);	
		marmara.setFont(new Font("Tahoma", Font.BOLD, 20));
		marmara.setBounds(12, 13, 564, 81);
		frame.getContentPane().add(marmara);
		
		ImageIcon img=new ImageIcon("marmara.png");
		JLabel pic=new JLabel(img);
		pic.setBounds(20, 90, 250, 250);
		frame.add(pic);
		
		
		JButton concert = new JButton("Concert");
		concert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ShowEvents shw = new ShowEvents("concert");
				
			}
		});
		concert.setBounds(330, 143, 148, 51);
		frame.getContentPane().add(concert);
		
		JButton theatre = new JButton("Theatre");
		theatre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ShowEvents shw = new ShowEvents("theatre");
			}
		});
		theatre.setBounds(330, 233, 148, 51);
		frame.getContentPane().add(theatre);
		JOptionPane.showMessageDialog(null, "Welcome to Marmara University Fest");
	}
}
