package Ecommerce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaClienteFuncionario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaClienteFuncionario frame = new TelaClienteFuncionario();
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
	public TelaClienteFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 197);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(180, 222, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aperte na sua opção");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 18));
		lblNewLabel.setBounds(69, 31, 202, 29);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						TelaInicial inicio = new TelaInicial();
						dispose();
						inicio.setVisible(true);
						
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Georgia", Font.PLAIN, 12));
		btnNewButton.setBounds(61, 92, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Funcionário");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaFuncionario funcionario = new TelaFuncionario();
				dispose();
				funcionario.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Georgia", Font.PLAIN, 12));
		btnNewButton_1.setBounds(168, 92, 114, 23);
		contentPane.add(btnNewButton_1);
	}
}
