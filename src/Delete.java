import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Delete extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete frame = new Delete();
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
	public Delete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterProductId = new JLabel("Enter Product ID");
		lblEnterProductId.setBounds(36, 26, 135, 14);
		contentPane.add(lblEnterProductId);
		
		txtId = new JTextField();
		txtId.setText("id");
		txtId.setBounds(36, 63, 118, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product del = new Product();
				int del_product = Integer.parseInt(txtId.getText());
				
				del.setProduct_ID(del_product);
				
				DAO deleted = new DAO();
				deleted.delete_product(del);
				
			}
		});
		btnDelete.setBounds(297, 134, 89, 23);
		contentPane.add(btnDelete);
	}

}
