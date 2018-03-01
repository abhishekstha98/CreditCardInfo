/*
 * Labels are present to notify the
 * user of the required fields
 */
package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import useraccount.UserAccount;
import useraccount.UserAccount;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.JPasswordField;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class CCInfo extends JFrame {

	private JPanel contentPane;
	private JTextField UsernametextField;
	private JTextField PasswordtextField;
	private JTextField UseremailtextField;
	private JTextField CCtextField;
	private JTextField BDtextField;
	private JTextField ZIPtextField;
	public static String s = new String();
	public static JEditorPane TXTeditorPane = new JEditorPane();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CCInfo frame = new CCInfo();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CCInfo() {
		s="";
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(10, 10, 726, 253);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Names");
		lblNewLabel.setBounds(69, 44, 116, 16);
		panel.add(lblNewLabel);
		
		UsernametextField = new JTextField();
		UsernametextField.setBounds(69, 73, 182, 22);
		panel.add(UsernametextField);
		UsernametextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(286, 44, 116, 16);
		panel.add(lblNewLabel_1);
		
		PasswordtextField = new JTextField();
		PasswordtextField.setBounds(286, 75, 182, 22);
		panel.add(PasswordtextField);
		PasswordtextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(69, 108, 116, 16);
		panel.add(lblNewLabel_2);
		
		UseremailtextField = new JTextField();
		UseremailtextField.setBounds(69, 137, 399, 22);
		panel.add(UseremailtextField);
		UseremailtextField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Credit Card no.");
		lblNewLabel_3.setBounds(69, 172, 116, 16);
		panel.add(lblNewLabel_3);
		
		CCtextField = new JTextField();
		CCtextField.setBounds(69, 201, 399, 22);
		panel.add(CCtextField);
		CCtextField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Birth Date");
		lblNewLabel_4.setBounds(510, 46, 116, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ZipCode");
		lblNewLabel_5.setBounds(510, 110, 56, 16);
		panel.add(lblNewLabel_5);
		
		ZIPtextField = new JTextField();
		ZIPtextField.setBounds(510, 139, 182, 22);
		panel.add(ZIPtextField);
		ZIPtextField.setColumns(10);
		
		JButton btnOkay = new JButton("Okay");
		btnOkay.setBounds(510, 189, 116, 36);
		panel.add(btnOkay);
		
		BDtextField = new JTextField();
		BDtextField.setBounds(510, 73, 182, 22);
		panel.add(BDtextField);
		BDtextField.setColumns(10);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(12, 13, 101, 18);
		panel.add(toolBar);
		
		JMenuBar menuBar = new JMenuBar();
		toolBar.add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem AboutMNTM = new JMenuItem("About");
		mnFile.add(AboutMNTM);
		AboutMNTM.addActionListener(new ActionListener() {//action listener for showing about screen
			public void actionPerformed(ActionEvent arg0) {
				About dialog = new About();
				dialog.setVisible(true);
			}
		});
		
		JMenuItem RetrieveMNTM = new JMenuItem("Retrieve");
		mnFile.add(RetrieveMNTM);
		RetrieveMNTM.addActionListener(new ActionListener() {//action listener for showing frame for doing retrieval works
			public void actionPerformed(ActionEvent arg0) {
				Retrieve dialog = new Retrieve();
				dialog.setVisible(true);
			}
		});
		
		JMenuItem mntmEdit = new JMenuItem("Edit");
		mnFile.add(mntmEdit);
		mntmEdit.addActionListener(new ActionListener() {//action listener for showing dialog box for editing works
			public void actionPerformed(ActionEvent arg0) {
				Validate dialog = new Validate();
				dialog.setVisible(true);
			}
		});
		
		JMenuItem ExitMNTM = new JMenuItem("Exit");
		mnFile.add(ExitMNTM);
		ExitMNTM.addActionListener(new ActionListener() {//action listener for exiting the system 
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		JButton btnShow = new JButton("Show");
		btnShow.setBounds(639, 558, 97, 25);
		contentPane.add(btnShow);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 269, 726, 213);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(TXTeditorPane);
		
		JButton btnShow_1 = new JButton("Show");
		btnShow_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnShow_1.setBounds(639, 495, 97, 25);
		contentPane.add(btnShow_1);
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserAccount ao = new UserAccount();//class containing getters and setters for containing all the listed information 
				ao.setUser_email(UseremailtextField.getText());
				ao.setUser_names(UsernametextField.getText());
				ao.setPassword(PasswordtextField.getText());
				ao.setBirthdate(BDtextField.getText());
				ao.setCc_no(CCtextField.getText());
				ao.setZip_code(ZIPtextField.getText());
				
				ArrayList<String> info = new ArrayList<>();//custom data structure for listing information according to user names 
				info.add(UsernametextField.getText());
				info.add(UseremailtextField.getText());
				info.add(ZIPtextField.getText());
				info.add(PasswordtextField.getText());
				info.add(BDtextField.getText());
				HashT.ac.put(CCtextField.getText(), info);
				
				ArrayList<String> info1 = new ArrayList<>();//custom data structure for listing information according to email
				info1.add(UsernametextField.getText());
				info1.add(CCtextField.getText());
				info1.add(ZIPtextField.getText());
				info1.add(PasswordtextField.getText());
				info1.add(BDtextField.getText());
				HashT.ec.put(UseremailtextField.getText(), info);
				
				ArrayList<String> info2 = new ArrayList<>();//custom data structure for listing information according to credit card number
				info2.add(CCtextField.getText());
				info2.add(UseremailtextField.getText());
				info2.add(ZIPtextField.getText());
				info2.add(PasswordtextField.getText());
				info2.add(BDtextField.getText());
				HashT.nc.put(UsernametextField.getText(), info);
				
				HashT.pu.put(UsernametextField.getText(), PasswordtextField.getText());
				
				s =s + UsernametextField.getText() + " " + PasswordtextField.getText() + " " + UseremailtextField.getText() + " " + BDtextField.getText() + " " + CCtextField.getText() + " " + ZIPtextField.getText() +" \n";
				TXTeditorPane.setText(s);
				UseremailtextField.setText("");//all of the following codes are for clearing out the fields for re-entering
				CCtextField.setText("");
				UsernametextField.setText("");
				ZIPtextField.setText("");
				BDtextField.setText("");
				PasswordtextField.setText("");
			}
		});
	}
}
