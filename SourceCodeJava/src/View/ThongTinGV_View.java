package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ThongTinGV_View {

	public JFrame frameGiangVien;
	private JTextField txtTenGV;
	private JTextField txtSDT;

	/**
	 * Create the application.
	 */
	public ThongTinGV_View(String tk,String mk) {
		initialize(tk,mk);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String tk,String mk) {
		frameGiangVien = new JFrame();
		frameGiangVien.setBounds(100, 100, 420, 189);
		frameGiangVien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameGiangVien.getContentPane().setLayout(null);
		
		txtTenGV = new JTextField();
		txtTenGV.setColumns(10);
		txtTenGV.setBounds(177, 32, 213, 25);
		frameGiangVien.getContentPane().add(txtTenGV);
		
		txtSDT = new JTextField();
		txtSDT.setColumns(10);
		txtSDT.setBounds(177, 68, 213, 25);
		frameGiangVien.getContentPane().add(txtSDT);
		
		JLabel lblNewLabel_1 = new JLabel("Tên Giang Viên:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(20, 32, 124, 25);
		frameGiangVien.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Số Điện Thoại:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(20, 73, 124, 25);
		frameGiangVien.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnChapNhan = new JButton("Chấp nhận");
		btnChapNhan.setFont(new Font("Arial", Font.BOLD, 13));
		btnChapNhan.setBounds(70, 116, 109, 23);
		frameGiangVien.getContentPane().add(btnChapNhan);
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.setFont(new Font("Arial", Font.BOLD, 13));
		btnHuy.setBounds(243, 116, 109, 23);
		frameGiangVien.getContentPane().add(btnHuy);
		btnChapNhan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String TenGV = txtTenGV.getText();
				String SDT = txtSDT.getText();
				if(!TenGV.equals("")&&!SDT.equals(""))
				{
					Register_View.getInstance().frame.dispose();;
					frameGiangVien.dispose();
				}
			}
		});
		btnHuy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Register_View.getInstance().frame.setVisible(true);
				frameGiangVien.dispose();
			}
		});
	}
}
