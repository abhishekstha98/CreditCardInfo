package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Edit extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nametextField;
	private JTextField passwordtextField;
	private JTextField zipcodetextField;
	private JTextField bdtextField;
	private JTextField emailtextField;
	private JTextField cctextField;
	public String user_names;
	public String user_email;
	public String password;
	public String birthdate;
	public String cc_no;
	public String zip_code;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Edit dialog = new Edit();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Edit() {
		setBounds(100, 100, 469, 408);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("Names");
		label.setBounds(12, 13, 116, 16);
		contentPanel.add(label);
		
		nametextField = new JTextField();
		nametextField.setColumns(10);
		nametextField.setBounds(12, 42, 182, 22);
		contentPanel.add(nametextField);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setBounds(229, 13, 116, 16);
		contentPanel.add(label_1);
		
		passwordtextField = new JTextField();
		passwordtextField.setColumns(10);
		passwordtextField.setBounds(229, 44, 182, 22);
		contentPanel.add(passwordtextField);
		
		JButton button = new JButton("Okay");//action listener for editing
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<String> info = new ArrayList<>();//all of the following lines of codes are for updating the existing fields 
				info.add(nametextField.getText());
				info.add(emailtextField.getText());
				info.add(zipcodetextField.getText());
				info.add(passwordtextField.getText());
				info.add(bdtextField.getText());
				HashT.ac.put(cctextField.getText(), info);
				ArrayList<String> info1 = new ArrayList<>();
				info1.add(nametextField.getText());
				info1.add(cctextField.getText());
				info1.add(zipcodetextField.getText());
				info1.add(passwordtextField.getText());
				info1.add(bdtextField.getText());
				HashT.ec.put(emailtextField.getText(), info);
				ArrayList<String> info2 = new ArrayList<>();
				info2.add(cctextField.getText());
				info2.add(emailtextField.getText());
				info2.add(zipcodetextField.getText());
				info2.add(passwordtextField.getText());
				info2.add(bdtextField.getText());
				HashT.nc.put(nametextField.getText(), info);
				CCInfo.s =CCInfo.s + nametextField.getText() + " " + passwordtextField.getText() + " " + emailtextField.getText() + " " + bdtextField.getText() + " " + cctextField.getText() + " " + zipcodetextField.getText() +" \n";
				
				CCInfo.TXTeditorPane.setText(CCInfo.s);
			}
		});
		button.setBounds(326, 306, 116, 36);
		contentPanel.add(button);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 77, 430, 217);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		zipcodetextField = new JTextField();
		zipcodetextField.setText("-");
		zipcodetextField.setColumns(10);
		zipcodetextField.setBounds(229, 42, 182, 22);
		panel.add(zipcodetextField);
		
		JLabel label_2 = new JLabel("ZipCode");
		label_2.setBounds(229, 13, 56, 16);
		panel.add(label_2);
		
		bdtextField = new JTextField();
		bdtextField.setText("-");
		bdtextField.setColumns(10);
		bdtextField.setBounds(12, 40, 182, 22);
		panel.add(bdtextField);
		
		JLabel label_3 = new JLabel("Birth Date");
		label_3.setBounds(12, 13, 116, 16);
		panel.add(label_3);
		
		emailtextField = new JTextField();
		emailtextField.setText("-");
		emailtextField.setColumns(10);
		emailtextField.setBounds(12, 104, 399, 22);
		panel.add(emailtextField);
		
		JLabel label_4 = new JLabel("Email");
		label_4.setBounds(12, 75, 116, 16);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Credit Card no.");
		label_5.setBounds(12, 139, 116, 16);
		panel.add(label_5);
		
		cctextField = new JTextField();
		cctextField.setText("-");
		cctextField.setColumns(10);
		cctextField.setBounds(12, 168, 399, 22);
		panel.add(cctextField);
		
	}
}
