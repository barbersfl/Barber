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

public class TelaCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField nomecliente;
	private JTextField numerocliente;
	private JTextField enderecocliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente frame = new TelaCadastroCliente();
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
	public TelaCadastroCliente() {
		setTitle("CADASTRO CLIENTE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 307, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 71, 46, 14);
		contentPane.add(lblNewLabel);
		
		nomecliente = new JTextField();
		nomecliente.setBounds(10, 89, 137, 20);
		contentPane.add(nomecliente);
		nomecliente.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 140, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		numerocliente = new JTextField();
		numerocliente.setBounds(10, 154, 137, 20);
		contentPane.add(numerocliente);
		numerocliente.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 208, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		enderecocliente = new JTextField();
		enderecocliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enderecocliente.setBounds(10, 224, 137, 20);
		contentPane.add(enderecocliente);
		enderecocliente.setColumns(10);
		
		JButton btnCadastrarcliente = new JButton("CADASTRAR");
		btnCadastrarcliente.setBounds(10, 278, 137, 23);
		contentPane.add(btnCadastrarcliente);
	}

}
