package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroUsuario frame = new TelaCadastroUsuario();
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
	public TelaCadastroUsuario() {
		setTitle("CADASTRO USU\u00C1RIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ITEM1", "ITEM2 ", "ITEM 3", "ITEM 4", "ITEM 5"}));
		comboBox.setBounds(356, 78, 68, 20);
		contentPane.add(comboBox);
		
		JLabel lblUsuario = new JLabel("USU\u00C1RIO");
		lblUsuario.setBounds(121, 64, 68, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setBounds(121, 117, 68, 14);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(123, 78, 186, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 131, 188, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCadastraUsuario = new JButton("Cadastrar");
		btnCadastraUsuario.setBounds(121, 178, 89, 23);
		contentPane.add(btnCadastraUsuario);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(218, 178, 89, 23);
		contentPane.add(btnCancelar);
	}
}
