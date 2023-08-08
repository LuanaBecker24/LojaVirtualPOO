package Ecommerce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 319);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(180, 222, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Luque Variedades");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(109, 22, 204, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seja bem-vindo a loja que possui");
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(109, 59, 191, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("todos os produtos que você");
		lblNewLabel_2.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(131, 78, 149, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.setBackground(new Color(255, 255, 255));
		btnCadastro.setFont(new Font("Georgia", Font.PLAIN, 12));
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastro cadastro = new TelaCadastro();
				dispose();
				cadastro.setVisible(true);
			}
		});
		
		btnCadastro.setBounds(154, 215, 89, 23);
		contentPane.add(btnCadastro);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin login = new TelaLogin();
				dispose();
				login.setVisible(true);
			}
		});
		
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Georgia", Font.PLAIN, 12));
		btnLogin.setBounds(154, 119, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_2_1 = new JLabel("Não possui cadastro? ");
		lblNewLabel_2_1.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(138, 163, 132, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Sem problemas, aperte no botão abaixo");
		lblNewLabel_2_2.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(97, 183, 224, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("precisa!!!!");
		lblNewLabel_2_3.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(169, 94, 63, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JButton btnLogin_1 = new JButton("Voltar");
		btnLogin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaClienteFuncionario voltar = new TelaClienteFuncionario();
				dispose();
				voltar.setVisible(true);
			}
		});
		
		btnLogin_1.setFont(new Font("Georgia", Font.PLAIN, 12));
		btnLogin_1.setBackground(Color.WHITE);
		btnLogin_1.setBounds(303, 248, 89, 23);
		contentPane.add(btnLogin_1);
	}
}
