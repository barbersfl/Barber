package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField loginUsuario;
	private JPasswordField senhaUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 198);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jlbusuario = new JLabel("LOGIN:");
		jlbusuario.setBounds(58, 26, 46, 14);
		contentPane.add(jlbusuario);
		
		loginUsuario = new JTextField();
		loginUsuario.setBounds(114, 23, 104, 20);
		contentPane.add(loginUsuario);
		loginUsuario.setColumns(10);
		
		JLabel jlbsenha = new JLabel("SENHA:");
		jlbsenha.setBounds(58, 66, 46, 14);
		contentPane.add(jlbsenha);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passando uma senha qualquer so para testar a funcionalidade
				if(loginUsuario.getText().equals("henrique") && senhaUsuario.getText().equals("salao") ) {
					new TelaPrincipal().setVisible(true);
				}
			}
		});
		
		senhaUsuario = new JPasswordField();
		senhaUsuario.setBounds(114, 63, 104, 20);
		contentPane.add(senhaUsuario);
		btnEntrar.setBounds(29, 112, 118, 23);
		contentPane.add(btnEntrar);
		
		JButton btnEsqueciASenha = new JButton("ESQUECI A SENHA");
		btnEsqueciASenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RecupSenha().setVisible(true);
			}
		});
		btnEsqueciASenha.setBounds(173, 112, 155, 23);
		contentPane.add(btnEsqueciASenha);
	
		
	}
}