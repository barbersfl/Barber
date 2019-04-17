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

public class TelaFinancas extends JFrame {

	private JPanel contentPane;
	private JTextField arrecadadodia;
	private JTextField arrecadadomes;
	private JTextField mediamensalmes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFinancas frame = new TelaFinancas();
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
	public TelaFinancas() {
		setTitle("FINAN\u00C7AS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArrecadadoNo = new JLabel("Arrecadado no dia");
		lblArrecadadoNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblArrecadadoNo.setBounds(10, 65, 153, 14);
		contentPane.add(lblArrecadadoNo);
		
		arrecadadodia = new JTextField();
		arrecadadodia.setBounds(183, 64, 86, 20);
		contentPane.add(arrecadadodia);
		arrecadadodia.setColumns(10);
		
		JLabel lblArrecadado = new JLabel("Arrecadado no m\u00EAs");
		lblArrecadado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblArrecadado.setBounds(10, 141, 132, 14);
		contentPane.add(lblArrecadado);
		
		arrecadadomes = new JTextField();
		arrecadadomes.setBounds(183, 140, 86, 20);
		contentPane.add(arrecadadomes);
		arrecadadomes.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("M\u00E9dia mensal do m\u00EAs");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 215, 132, 14);
		contentPane.add(lblNewLabel);
		
		mediamensalmes = new JTextField();
		mediamensalmes.setBounds(183, 214, 86, 20);
		contentPane.add(mediamensalmes);
		mediamensalmes.setColumns(10);
		
		JButton btnVoltarfinancas = new JButton("VOLTAR");
		btnVoltarfinancas.setBounds(127, 287, 89, 23);
		contentPane.add(btnVoltarfinancas);
	}

}
