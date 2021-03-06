import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class addPhysicianMenu {

	//initialize form elements
	JFrame frame = new JFrame("Main Menu");
	JPanel MainPanel = new JPanel();
	JPanel topPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	
	//initialize form contents	
	JLabel infoLabel1 = new JLabel("Add a new Physician");
	JLabel firstNameLabel = new JLabel("First Name");
	JLabel lastNameLabel = new JLabel("Last Name");
	JLabel addressLabel = new JLabel("Address");
	JLabel phoneLabel = new JLabel("Phone Number");
	JTextField firstNameText = new JTextField();
	JTextField lastNameText = new JTextField();
	JTextField addressText = new JTextField();
	JTextField phoneText = new JTextField();
	JButton submitButton = new JButton("Save Changes");
	JButton exitButton = new JButton("Exit Program");

	public void startGui(){
		
		//Set up form and panels
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,600);
		frame.add(topPanel,BorderLayout.NORTH);
		frame.add(MainPanel,BorderLayout.CENTER);
		frame.add(bottomPanel,BorderLayout.SOUTH);
		topPanel.setBorder(new EmptyBorder(10, 10, 0, 10));
		MainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		bottomPanel.setBorder(new EmptyBorder(0, 10, 10, 10));
		frame.setLocationRelativeTo(null);
		
		//Add items to panel. Grid layout means rows, columns, horizontal padding, vertical padding
		topPanel.setLayout(new GridLayout(1,1,0,0));
	    MainPanel.setLayout(new GridLayout(4,2,10,10));
	    bottomPanel.setLayout(new GridLayout(1,2,10,10));
	    topPanel.add(infoLabel1);
		MainPanel.add(firstNameLabel);
		MainPanel.add(firstNameText);
		MainPanel.add(lastNameLabel);
		MainPanel.add(lastNameText);
		MainPanel.add(addressLabel);
		MainPanel.add(addressText);
		MainPanel.add(phoneLabel);
		MainPanel.add(phoneText);
		bottomPanel.add(submitButton);
		bottomPanel.add(exitButton);
		
		submitButton.addActionListener(new submitButtonListener());
	    exitButton.addActionListener(new exitButtonListener());
	    
		frame.setVisible(true);
	}
	class submitButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//Physician aDoctor = new Physician;
		}
	}
	class exitButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}
