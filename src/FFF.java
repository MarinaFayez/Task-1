

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class FFF extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JLabel lblProductId;
	private JLabel lblTybe;
	private JTextField txtType;
	private JLabel lblManufacturer;
	private JTextField txtManufacture;
	private JLabel lblProductionDate;
	private JLabel lblExpiryDate;
	private JTextField txtproduction;
	private JTextField txtExpiry_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FFF frame = new FFF();
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
	public FFF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInsert = new JButton("insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Production = txtproduction.getText();
		        int ID=0;
		        ID = Integer.parseInt(txtid.getText());
		        utils.validateID(ID);
		        String ExpiaryDate = txtExpiry_1.getText();
		        String manufacturer= txtManufacture.getText();
		        String type= txtType.getText();
				Product testpat = new Product();
				testpat.setProduct_ID(ID);
				testpat.setType(type);
				testpat.setManufacturer(manufacturer);
				testpat.setProduction_Date(Production );
				testpat.setExpiry_Date(ExpiaryDate);
				DAO newtest = new DAO();
				newtest.insert_product(testpat);
			}
		});
		
		
		btnInsert.setBounds(266, 147, 89, 23);
		contentPane.add(btnInsert);
		
		txtid = new JTextField();
		txtid.setText("id");
		txtid.setBounds(106, 33, 132, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		lblProductId = new JLabel("Product ID");
		lblProductId.setBounds(10, 36, 86, 14);
		contentPane.add(lblProductId);
		
		lblTybe = new JLabel("Tybe");
		lblTybe.setBounds(10, 78, 46, 14);
		contentPane.add(lblTybe);
		
		txtType = new JTextField();
		txtType.setText("type");
		txtType.setBounds(106, 75, 132, 20);
		contentPane.add(txtType);
		txtType.setColumns(10);
		
		lblManufacturer = new JLabel("Manufacturer");
		lblManufacturer.setBounds(10, 118, 86, 14);
		contentPane.add(lblManufacturer);
		
		txtManufacture = new JTextField();
		txtManufacture.setText("manufacture");
		txtManufacture.setBounds(106, 115, 132, 20);
		contentPane.add(txtManufacture);
		txtManufacture.setColumns(10);
		
		lblProductionDate = new JLabel("Production Date ");
		lblProductionDate.setBounds(10, 151, 86, 14);
		contentPane.add(lblProductionDate);
		
		lblExpiryDate = new JLabel("Expiry Date");
		lblExpiryDate.setBounds(10, 187, 86, 14);
		contentPane.add(lblExpiryDate);
		
		txtproduction = new JTextField();
		txtproduction.setText("production");
		txtproduction.setBounds(106, 148, 86, 20);
		contentPane.add(txtproduction);
		txtproduction.setColumns(10);
		
		txtExpiry_1 = new JTextField();
		txtExpiry_1.setText("expiry");
		txtExpiry_1.setBounds(106, 184, 86, 20);
		contentPane.add(txtExpiry_1);
		txtExpiry_1.setColumns(10);
		
	}

}
