import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
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
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        Nnnn anis = new Nnnn();
		        anis.setVisible(true);
		        anis.setLocationRelativeTo(null);
		        anis.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnUpdate.setBounds(111, 29, 196, 23);
		contentPane.add(btnUpdate);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Retrieve anis = new Retrieve();
			        anis.setVisible(true);
			        anis.setLocationRelativeTo(null);
			        anis.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnSearch.setBounds(111, 84, 196, 23);
		contentPane.add(btnSearch);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Delete anis = new Delete();
			        anis.setVisible(true);
			        anis.setLocationRelativeTo(null);
			        anis.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnDelete.setBounds(111, 143, 196, 23);
		contentPane.add(btnDelete);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 FFF anis = new FFF();
			        anis.setVisible(true);
			        anis.setLocationRelativeTo(null);
			        anis.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnInsert.setBounds(111, 195, 196, 23);
		contentPane.add(btnInsert);
	}

}
