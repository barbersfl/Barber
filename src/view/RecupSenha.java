package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RecupSenha extends JFrame {

	private JPanel contentPane;
	private JTextField loginUsuario;
	private JPasswordField novaSenha;
	private JLabel lblDigiteASenha;
	private JTextField confirmacaoSenha;
	private JButton btnCancelar;

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
		setBounds(100, 100, 305, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jlbUsuario = new JLabel("USUARIO :");
		jlbUsuario.setBounds(36, 46, 73, 14);
		contentPane.add(jlbUsuario);
		
		loginUsuario = new JTextField();
		loginUsuario.setBounds(36, 60, 184, 20);
		contentPane.add(loginUsuario);
		loginUsuario.setColumns(10);
		
		JLabel lblNovaSenha = new JLabel("NOVA SENHA:");
		lblNovaSenha.setBounds(36, 119, 89, 14);
		contentPane.add(lblNovaSenha);
		
		novaSenha = new JPasswordField();
		novaSenha.setBounds(36, 134, 184, 20);
		contentPane.add(novaSenha);
		
		lblDigiteASenha = new JLabel("DIGITE A SENHA NOVAMENTE :");
		lblDigiteASenha.setBounds(36, 192, 178, 14);
		contentPane.add(lblDigiteASenha);
		
		confirmacaoSenha = new JTextField();
		confirmacaoSenha.setBounds(36, 209, 184, 20);
		contentPane.add(confirmacaoSenha);
		confirmacaoSenha.setColumns(10);
		
		JButton btnTrocarSenha = new JButton("TROCAR SENHA");
		btnTrocarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTrocarSenha.setBounds(10, 272, 134, 23);
		contentPane.add(btnTrocarSenha);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(175, 272, 104, 23);
		contentPane.add(btnCancelar);
		

	}
}
