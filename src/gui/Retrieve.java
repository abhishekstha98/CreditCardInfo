package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Retrieve extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField retrievaltextField;
	public Component contentPane = null;
	public String s = new String();
	public CCInfo cc = new CCInfo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Retrieve dialog = new Retrieve();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Retrieve() {
		s="";
		setBounds(100, 100, 498, 266);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter info to retrieve account ( user name / user email / creditcard number)");
		lblNewLabel.setBounds(12, 13, 456, 16);
		contentPanel.add(lblNewLabel);
		
		retrievaltextField = new JTextField();
		retrievaltextField.setBounds(59, 111, 361, 22);
		contentPanel.add(retrievaltextField);
		retrievaltextField.setColumns(10);
		
		JLabel lblEnterChoice = new JLabel("Enter choice :");
		lblEnterChoice.setBounds(59, 42, 85, 16);
		contentPanel.add(lblEnterChoice);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"username", "email", "creditcard number"}));
		comboBox.setBounds(156, 42, 237, 22);
		contentPanel.add(comboBox);
		
		JButton OkatBTN = new JButton("Okay");
		OkatBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 
				 */
				String s1 = retrievaltextField.getText();
				if(comboBox.getSelectedItem()=="username"){
					if(HashT.nc.containsKey(s1)){
						JOptionPane.showMessageDialog(null, HashT.nc.get(s1));//retrieve user account by name
					}
					else{
						JOptionPane.showMessageDialog(null, "info not found");
					}
				}
				else if(comboBox.getSelectedItem()=="email"){
					if(HashT.ec.containsKey(s1)){
						JOptionPane.showMessageDialog(null, HashT.ec.get(s1));//retrieve user account by email 
					}
					else{
						JOptionPane.showMessageDialog(null, "info not found");
					}
				}
				else if(comboBox.getSelectedItem()=="creditcard number"){
					if(HashT.ac.containsKey(s1)){
						JOptionPane.showMessageDialog(null, HashT.ac.get(s1));//retrieve user account by credit card number
					}
					else{
						JOptionPane.showMessageDialog(null, "info not found");
					}
					}
//				if(bc.containsKey(s1)){
//					
//					JOptionPane.showMessageDialog(contentPane, "");
//				}
			}
		});
		OkatBTN.setBounds(371, 146, 97, 25);
		contentPanel.add(OkatBTN);
		
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
