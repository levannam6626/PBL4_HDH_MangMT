package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;

import DTO.CBBITem;

public class Admin_View {

	private JFrame frame;
	private JTable tbDSTK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_View window = new Admin_View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tbDSTK = new JTable();
		tbDSTK.setEnabled(true);
		tbDSTK.setBounds(10, 124, 664, 203);
		frame.getContentPane().add(tbDSTK);
		
		JLabel lblNewLabel = new JLabel("Danh sách tài khoản");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 90, 196, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setBounds(20, 338, 89, 23);
		frame.getContentPane().add(btnThem);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.setBounds(164, 338, 89, 23);
		frame.getContentPane().add(btnSua);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setBounds(320, 338, 89, 23);
		frame.getContentPane().add(btnXoa);
		
		JButton btnSapXep = new JButton("Sắp Xếp");
		btnSapXep.setBounds(482, 338, 89, 23);
		frame.getContentPane().add(btnSapXep);
		
		JComboBox<String> cbbSapXep = new JComboBox<String>();
		cbbSapXep.setBounds(585, 338, 89, 22);
		frame.getContentPane().add(cbbSapXep);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(36, 66, 46, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ADMIN");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(245, 11, 188, 51);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnDangXuat = new JButton("Đăng Xuất");
		btnDangXuat.setBounds(306, 377, 112, 23);
		frame.getContentPane().add(btnDangXuat);
		
		JComboBox<CBBITem> cbbLoaiTK = new JComboBox<CBBITem>();
		cbbLoaiTK.addItem(new CBBITem(1, "Sinh Viên"));
		cbbLoaiTK.addItem(new CBBITem(2, "Giang Viên"));
		cbbLoaiTK.setSelectedItem(cbbLoaiTK.getItemAt(0));
		cbbLoaiTK.setBounds(568, 92, 106, 24);
		frame.getContentPane().add(cbbLoaiTK);
		btnThem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Register_View.getInstance().refresh();
				Register_View.getInstance().frame.setVisible(true);
			}
		});
	}
}
