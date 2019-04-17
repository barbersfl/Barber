package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField nomefuncionario;
	private JTextField numerofuncionario;
	private JTextField enderecofuncionario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroFuncionario frame = new TelaCadastroFuncionario();
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
	public TelaCadastroFuncionario() {
		setTitle("CADASTRO FUNCION\u00C1RIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(128, 57, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(128, 190, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		nomefuncionario = new JTextField();
		nomefuncionario.setBounds(128, 72, 143, 20);
		contentPane.add(nomefuncionario);
		nomefuncionario.setColumns(10);
		
		numerofuncionario = new JTextField();
		numerofuncionario.setBounds(128, 206, 143, 20);
		contentPane.add(numerofuncionario);
		numerofuncionario.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(128, 123, 61, 14);
		contentPane.add(lblNewLabel_2);
		
		enderecofuncionario = new JTextField();
		enderecofuncionario.setBounds(128, 140, 143, 20);
		contentPane.add(enderecofuncionario);
		enderecofuncionario.setColumns(10);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCadastrar.setBounds(129, 266, 142, 23);
		contentPane.add(btnCadastrar);
	}
}
