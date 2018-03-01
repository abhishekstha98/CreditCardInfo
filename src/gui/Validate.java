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

public class Validate extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField usernametextField;
	private JTextField passwordtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Validate dialog = new Validate();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Validate() {
		ArrayList<String>a = new ArrayList<>();
		setBounds(100, 100, 450, 177);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Username");
			lblNewLabel.setBounds(98, 13, 69, 16);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setBounds(265, 13, 69, 16);
			contentPanel.add(lblPassword);
		}
		
		usernametextField = new JTextField();
		usernametextField.setBounds(66, 42, 116, 22);
		contentPanel.add(usernametextField);
		usernametextField.setColumns(10);
		
		passwordtextField = new JTextField();
		passwordtextField.setBounds(248, 42, 116, 22);
		contentPanel.add(passwordtextField);
		passwordtextField.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(HashT.pu.containsKey((usernametextField.getText()))){//to check username
							if(HashT.pu.containsKey((passwordtextField.getText()))){//to check password
								Edit dialog = new Edit();
								dialog.setVisible(true);
						}}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
