import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class System extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField CustID;
	private JTextField Name;
	private JTextField Address;
	private JTextField PostCode;
	private JTextField PhoneNumber;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System frame = new System();
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
	public System() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 191, 255));
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(139, 69, 19)));
		panel.setBounds(10, 11, 1174, 650);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Customer ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(43, 126, 117, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblCustomerId = new JLabel("Name");
		lblCustomerId.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCustomerId.setBounds(43, 162, 117, 25);
		panel.add(lblCustomerId);
		
		JLabel lblPostcode = new JLabel("Address");
		lblPostcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPostcode.setBounds(43, 234, 91, 25);
		panel.add(lblPostcode);
		
		JLabel lblAddress = new JLabel("Race");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAddress.setBounds(43, 198, 91, 25);
		panel.add(lblAddress);
		
		JLabel lblPhoneNumber = new JLabel("PostCode");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPhoneNumber.setBounds(43, 270, 117, 25);
		panel.add(lblPhoneNumber);
		
		JLabel lblLoanAmount = new JLabel("Phone Number");
		lblLoanAmount.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLoanAmount.setBounds(43, 306, 117, 25);
		panel.add(lblLoanAmount);
		
		CustID = new JTextField();
		CustID.setBounds(170, 126, 149, 25);
		panel.add(CustID);
		CustID.setColumns(10);
		
		Name = new JTextField();
		Name.setColumns(10);
		Name.setBounds(170, 167, 149, 25);
		panel.add(Name);
		
		Address = new JTextField();
		Address.setColumns(10);
		Address.setBounds(170, 239, 149, 25);
		panel.add(Address);
		
		PostCode = new JTextField();
		PostCode.setColumns(10);
		PostCode.setBounds(170, 275, 149, 25);
		panel.add(PostCode);
		
		PhoneNumber = new JTextField();
		PhoneNumber.setColumns(10);
		PhoneNumber.setBounds(170, 311, 149, 25);
		panel.add(PhoneNumber);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(458, 133, 695, 356);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Customer ID", "Name", "Race", "Address", "PostCode", "Phone Number", "Car Model", "Loan Duration"
			}
		));
		scrollPane.setViewportView(table);
		
		JComboBox Race = new JComboBox();
		Race.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "Malay", "Chinese", "Indian", "Other"}));
		Race.setBounds(170, 203, 149, 20);
		panel.add(Race);
		
		JLabel lblCarModel = new JLabel("Car Model");
		lblCarModel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCarModel.setBounds(43, 342, 117, 25);
		panel.add(lblCarModel);
		
		JComboBox CarModel = new JComboBox();
		CarModel.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "Persona", "Saga", "X50", "X70"}));
		CarModel.setBounds(170, 347, 149, 20);
		panel.add(CarModel);
		
		JLabel lblLoanDuration = new JLabel("Loan Duration");
		lblLoanDuration.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLoanDuration.setBounds(43, 378, 117, 25);
		panel.add(lblLoanDuration);
		
		JComboBox LoanDuration = new JComboBox();
		LoanDuration.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "12 Months", "24 Months", "36 Months", "48 Months", "60 Months", ""}));
		LoanDuration.setBounds(170, 378, 149, 20);
		panel.add(LoanDuration);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						CustID.getText(),
						Name.getText(),
						Race.getSelectedItem(),
						Address.getText(),
						PostCode.getText(),
						PhoneNumber.getText(),
						CarModel.getSelectedItem(),
						LoanDuration.getSelectedItem(), 
				
				});
				
				if (table.getSelectedRow() == -1) {
					if(table.getRowCount()== 0) {
						JOptionPane.showMessageDialog(null, "Information Update!","Customer Information System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
			
		
		btnNewButton.setBounds(47, 438, 127, 38);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CustID.setText("");
				Name.setText("");
				Race.setSelectedItem("Please Select");
				Address.setText("");
				PostCode.setText("");
				PhoneNumber.setText("");
				CarModel.setSelectedItem("Please Select");
				LoanDuration.setSelectedItem("Please Select");
				
			}
		});
		btnReset.setBounds(137, 487, 127, 38);
		panel.add(btnReset);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "No data available","Customer Information System",
								JOptionPane.OK_OPTION);}
					else {
						JOptionPane.showMessageDialog(null, "Select a row to delete","Customer Information System",
								JOptionPane.OK_OPTION);}
				}
				
					else {
						model.removeRow(table.getSelectedRow());
						
					
				}
			}
		});
		btnDelete.setBounds(233, 438, 127, 38);
		panel.add(btnDelete);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Sitka Small", Font.PLAIN, 24));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Select yes if you want to exit","Customer Information System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					
				}
					
				
				
			}
		});
		btnExit.setBounds(959, 569, 194, 55);
		panel.add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_1.setBounds(50, 68, 310, 47);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("CUSTOMER INFORMATION");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 20));
		
		JLabel lblNewLabel_2 = new JLabel("CUSTOMER INFORMATION SYSTEM");
		lblNewLabel_2.setFont(new Font("Open Sans Semibold", Font.BOLD, 25));
		lblNewLabel_2.setBounds(367, 22, 637, 25);
		panel.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(119, 136, 153));
		panel_2.setBounds(53, 424, 307, 3);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(119, 136, 153));
		panel_3.setBounds(53, 536, 307, 3);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(119, 136, 153));
		panel_4.setBounds(367, 46, 428, 1);
		panel.add(panel_4);
	}
}
