

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nnnn extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnUpdate;
	private JLabel lblType;
	private JLabel lblManufacturer;
	private JLabel lblProductionDate;
	private JLabel lblExpiryDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nnnn frame = new Nnnn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Nnnn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtId = new JTextField();
		txtId.setText("id");
		txtId.setBounds(20, 57, 106, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblEnterProductionId = new JLabel("enter Production ID you wat to update");
		lblEnterProductionId.setBounds(10, 24, 253, 14);
		contentPane.add(lblEnterProductionId);
		
		textField = new JTextField();
		textField.setBounds(252, 100, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(252, 131, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(252, 162, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(252, 191, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		btnUpdate = new JButton("update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Production = textField_2.getText();
		        int ID = Integer.parseInt(txtId.getText());
		        String ExpiaryDate = textField_3.getText();
		        String manufacturer= textField_1.getText();
		        String type= textField.getText();
				Product testpat = new Product();
				testpat.setProduct_ID(ID);
				testpat.setType(type);
				testpat.setManufacturer(manufacturer);
				testpat.setProduction_Date(Production );
				testpat.setExpiry_Date(ExpiaryDate);
				DAO updated = new DAO();
				updated.update_product(testpat);
			}
		});
		btnUpdate.setBounds(335, 229, 89, 23);
		contentPane.add(btnUpdate);
		
		lblType = new JLabel("Type");
		lblType.setBounds(165, 103, 46, 14);
		contentPane.add(lblType);
		
		lblManufacturer = new JLabel("Manufacturer");
		lblManufacturer.setBounds(142, 134, 106, 14);
		contentPane.add(lblManufacturer);
		
		lblProductionDate = new JLabel("Production Date");
		lblProductionDate.setBounds(142, 165, 108, 14);
		contentPane.add(lblProductionDate);
		
		lblExpiryDate = new JLabel("Expiry Date");
		lblExpiryDate.setBounds(142, 194, 75, 14);
		contentPane.add(lblExpiryDate);
	}

}
