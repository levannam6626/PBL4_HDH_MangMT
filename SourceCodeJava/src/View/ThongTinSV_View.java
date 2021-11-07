package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ThongTinSV_View {

	public JFrame frameSinhVien;
	private JTextField txtMSSV;
	private JTextField txtTenSV;
	private JTextField txtNS;
	private JTextField txtSDT;

	public ThongTinSV_View(String tk, String mk) {
		initialize(tk,mk);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String tk, String mk) {
		frameSinhVien = new JFrame();
		frameSinhVien.setTitle("Sinh Viên");
		frameSinhVien.setBounds(100, 100, 397, 300);
		frameSinhVien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameSinhVien.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MSSV:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 29, 60, 25);
		frameSinhVien.getContentPane().add(lblNewLabel);
		
		txtMSSV = new JTextField();
		txtMSSV.setBounds(139, 29, 213, 25);
		frameSinhVien.getContentPane().add(txtMSSV);
		txtMSSV.setColumns(10);
		
		txtTenSV = new JTextField();
		txtTenSV.setBounds(139, 78, 213, 25);
		frameSinhVien.getContentPane().add(txtTenSV);
		txtTenSV.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tên Sinh Viên:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(20, 78, 109, 25);
		frameSinhVien.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ngày Sinh:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setBounds(22, 128, 119, 25);
		frameSinhVien.getContentPane().add(lblNewLabel_2);
		
		txtNS = new JTextField();
		txtNS.setBounds(139, 128, 213, 25);
		frameSinhVien.getContentPane().add(txtNS);
		txtNS.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Số Điện Thoại:");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3.setBounds(20, 179, 109, 25);
		frameSinhVien.getContentPane().add(lblNewLabel_3);
		
		txtSDT = new JTextField();
		txtSDT.setColumns(10);
		txtSDT.setBounds(139, 179, 213, 25);
		frameSinhVien.getContentPane().add(txtSDT);
		
		JButton btnChapNhan = new JButton("Chấp nhận");
		btnChapNhan.setFont(new Font("Arial", Font.BOLD, 13));
		btnChapNhan.setBounds(60, 227, 109, 23);
		frameSinhVien.getContentPane().add(btnChapNhan);
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.setFont(new Font("Arial", Font.BOLD, 13));
		btnHuy.setBounds(214, 227, 109, 23);
		frameSinhVien.getContentPane().add(btnHuy);
		btnChapNhan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String MSSV = txtMSSV.getText();
				String TenSV = txtTenSV.getText();
				String SDT = txtSDT.getText();
				String NS = txtNS.getText();
				if(!MSSV.equals("")&&!TenSV.equals("")&&!SDT.equals("")&&!NS.equals(""))
				{
					Register_View.getInstance().frame.dispose();;
					frameSinhVien.dispose();
				}
			}
		});
		btnHuy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Register_View.getInstance().frame.setVisible(true);
				frameSinhVien.dispose();
			}
		});
	}

}
