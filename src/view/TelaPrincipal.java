package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("TELA PRINCIPAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarUsuario = new JButton("CADASTRAR USU\u00C1RIO");
		btnCadastrarUsuario.setBounds(74, 79, 167, 23);
		contentPane.add(btnCadastrarUsuario);
		
		JButton btnlistarusuarios = new JButton("LISTAR USU\u00C1RIOS");
		btnlistarusuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnlistarusuarios.setBounds(74, 161, 167, 23);
		contentPane.add(btnlistarusuarios);
		
		JButton btnfinancas = new JButton("FINAN\u00C7AS");
		btnfinancas.setBounds(74, 242, 167, 23);
		contentPane.add(btnfinancas);
		
		JButton btnfuncionario = new JButton("FUNCION\u00C1RIO");
		btnfuncionario.setBounds(74, 327, 167, 23);
		contentPane.add(btnfuncionario);
		
		JButton btnfidelidade = new JButton("FIDELIDADE");
		btnfidelidade.setBounds(74, 412, 167, 23);
		contentPane.add(btnfidelidade);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Paulo\\Pictures\\Nova pasta\\Barber\\Imagens\\Imagemtelaprincipal.jpg"));
		lblNewLabel.setBounds(328, 0, 555, 527);
		contentPane.add(lblNewLabel);
	}
}
