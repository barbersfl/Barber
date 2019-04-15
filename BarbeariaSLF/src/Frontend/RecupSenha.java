package Front;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class RecupSenha extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecupSenha frame = new RecupSenha();
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
	public RecupSenha() {
		setTitle("RECUPERAR SENHA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(167, 29, 46, 14);
		contentPane.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(167, 42, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("DIGITE A NOVA SENHA");
		lblSenha.setBounds(167, 73, 136, 14);
		contentPane.add(lblSenha);
		
		JLabel lblDigiteASenha = new JLabel("DIGITE A SENHA NOVAMENTE");
		lblDigiteASenha.setBounds(167, 117, 178, 14);
		contentPane.add(lblDigiteASenha);
		
		JButton btnRecuperar = new JButton("RECUPERAR");
		btnRecuperar.setBounds(179, 173, 122, 23);
		contentPane.add(btnRecuperar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(167, 89, 134, 28);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(167, 134, 136, 28);
		contentPane.add(passwordField_1);
	}
}

