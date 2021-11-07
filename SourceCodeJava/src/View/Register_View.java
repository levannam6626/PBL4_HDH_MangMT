package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;

import DTO.CBBITem;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class Register_View {
	private static Register_View Instance;

	public static Register_View getInstance() {
		if (Instance == null)
			Instance = new Register_View();
		return Instance;
	}
	public JFrame frame;
	public JTextField txtTaiKhoan;
	public JPasswordField txtMatKhau;
	public JPasswordField txtXacNhan;
	public JComboBox<CBBITem> cbbDanhCho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register_View window = new Register_View();
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
	public Register_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 385, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tài khoản:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(20, 72, 91, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mật khẩu:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(20, 110, 80, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtTaiKhoan = new JTextField();
		txtTaiKhoan.setColumns(10);
		txtTaiKhoan.setBounds(153, 72, 209, 25);
		frame.getContentPane().add(txtTaiKhoan);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setColumns(10);
		txtMatKhau.setBounds(153, 108, 209, 25);
		frame.getContentPane().add(txtMatKhau);
		
		JLabel lblNewLabel_1_1 = new JLabel("Xác nhận mật khẩu:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(20, 147, 135, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		txtXacNhan = new JPasswordField();
		txtXacNhan.setColumns(10);
		txtXacNhan.setBounds(153, 145, 209, 25);
		frame.getContentPane().add(txtXacNhan);
		
		JLabel lblNewLabel_2 = new JLabel("ĐĂNG KÝ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_2.setBounds(123, 11, 122, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnDangKy = new JButton("Đăng Ký");
		btnDangKy.setBounds(57, 227, 89, 23);
		frame.getContentPane().add(btnDangKy);
		
		JLabel lblNewLabel_1_2 = new JLabel("Dành cho");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(20, 182, 80, 20);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		cbbDanhCho = new JComboBox<CBBITem>();
		cbbDanhCho.addItem(new CBBITem(1, "Sinh Viên"));
		cbbDanhCho.addItem(new CBBITem(2, "Giang Viên"));
		cbbDanhCho.setSelectedItem(cbbDanhCho.getItemAt(0));
		cbbDanhCho.setBounds(153, 181, 208, 22);
		frame.getContentPane().add(cbbDanhCho);
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.setBounds(222, 227, 89, 23);
		frame.getContentPane().add(btnHuy);
		
		btnDangKy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tk = txtTaiKhoan.getText();
				String mk = String.valueOf(txtMatKhau.getPassword());
				if(!tk.equals("")&&!mk.equals(""))
				{
					if(mk.equals(String.valueOf(txtXacNhan.getPassword())))
					{
						if(((CBBITem)cbbDanhCho.getSelectedItem()).getKey() ==1)
						{
							ThongTinSV_View ttsv = new ThongTinSV_View(tk,mk);
							frame.setVisible(false);
							ttsv.frameSinhVien.setVisible(true);
						}else
						{
							ThongTinGV_View ttgv = new ThongTinGV_View(tk,mk);
							frame.setVisible(false);
							ttgv.frameGiangVien.setVisible(true);
						}
					}else {
						JOptionPane.showMessageDialog(btnHuy, "Xác nhận mật khẩu không đúng.");
					}
				}else {
					JOptionPane.showMessageDialog(frame, "Hãy điền đầy đủ thông tin!");
				}
			}
		});	
		btnHuy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
	}
	public void refresh()
	{
		txtTaiKhoan.setText("");
		txtMatKhau.setText("");
		txtXacNhan.setText("");
		cbbDanhCho.setSelectedIndex(0);
	}
}
