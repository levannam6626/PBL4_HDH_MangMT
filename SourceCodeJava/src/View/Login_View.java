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
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class Login_View {

	private JFrame frameLogin;
	private JTextField txtTaiKhoan;
	private JPasswordField pwMatKhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_View window = new Login_View();
					window.frameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLogin = new JFrame();
		frameLogin.setBounds(100, 100, 385, 236);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tài khoản:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(25, 66, 91, 25);
		frameLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mật khẩu:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(25, 102, 80, 20);
		frameLogin.getContentPane().add(lblNewLabel_1);
		
		txtTaiKhoan = new JTextField();
		txtTaiKhoan.setBounds(135, 66, 219, 25);
		frameLogin.getContentPane().add(txtTaiKhoan);
		txtTaiKhoan.setColumns(10);
		
		pwMatKhau = new JPasswordField();
		pwMatKhau.setBounds(135, 102, 219, 25);
		frameLogin.getContentPane().add(pwMatKhau);
		pwMatKhau.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ĐĂNG NHẬP");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_2.setBounds(135, 11, 122, 38);
		frameLogin.getContentPane().add(lblNewLabel_2);
		
		JButton btnDangNhap = new JButton("Đăng Nhập");
		btnDangNhap.setBounds(137, 154, 97, 23);
		btnDangNhap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tk = txtTaiKhoan.getText();
				String mk = String.valueOf(pwMatKhau.getPassword());
				if(!tk.equals("")&&!mk.equals(""))
				{
					
				}else
				{
					JOptionPane.showMessageDialog(frameLogin, "Hãy điền đầy đủ!");
				}
				
			}
		});
	}
}
