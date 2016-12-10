import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class Retrieve extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtManufacture;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Retrieve frame = new Retrieve();
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
	public Retrieve() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setToolTipText("");
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 150, 414, 32);
		contentPane.add(table);
		
		JLabel lblSearchVymanufacturer = new JLabel("Search by Manufacturer");
		lblSearchVymanufacturer.setBounds(10, 21, 148, 14);
		contentPane.add(lblSearchVymanufacturer);
		
		txtManufacture = new JTextField();
		txtManufacture.setText("Manufacture");
		txtManufacture.setBounds(20, 46, 138, 20);
		contentPane.add(txtManufacture);
		txtManufacture.setColumns(10);
		
		JButton btnSearch = new JButton("search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Product search = new Product();
				
				String manufacturer= txtManufacture.getText();
				search.setManufacturer(manufacturer);
				
				DAO searched = new DAO();
				ArrayList <Product> products = searched.QueryProducts(search);
				Object[] tableColumnNames = new Object[5];
				tableColumnNames[0] = "Id";
		        tableColumnNames[1] = "type";
		        tableColumnNames[2] = "manufacturer";
		        tableColumnNames[3] = "ProductionDate";
		        tableColumnNames[4] = "ExpiaryDate";
				
		        
		        DefaultTableModel tbd = new DefaultTableModel();
		        tbd.setColumnIdentifiers(tableColumnNames);
		        table.setModel(tbd);
		        Object[] RowItem = new Object[5];
		        for (int i = 0; i < products.size(); i++) {
		            RowItem[0] = products.get(i).getProduct_ID();
		            RowItem[1] = products.get(i).getType();
		            RowItem[2] = products.get(i).getManufacturer();
		            RowItem[3] = products.get(i).getProduction_Date();
		            RowItem[4] = products.get(i).getExpiry_Date();
		            tbd.addRow(RowItem);
		        }
		        
			}
		});
		btnSearch.setBounds(297, 78, 89, 23);
		contentPane.add(btnSearch);
	}
}
