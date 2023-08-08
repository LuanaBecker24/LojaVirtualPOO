package Ecommerce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txNome;
	private JPasswordField passwordSenha;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 252, 287);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(180, 222, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_1.setBounds(88, 11, 72, 36);
		contentPane.add(lblNewLabel_1);
		
		txNome = new JTextField();
		txNome.setColumns(10);
		txNome.setBackground(Color.WHITE);
		txNome.setBounds(64, 97, 121, 20);
		contentPane.add(txNome);
		
		JLabel lblNomeDeUsurio = new JLabel("Nome de usuário");
		lblNomeDeUsurio.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblNomeDeUsurio.setBounds(72, 72, 113, 14);
		contentPane.add(lblNomeDeUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblSenha.setBounds(99, 141, 40, 14);
		contentPane.add(lblSenha);
		
		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(64, 157, 121, 20);
		contentPane.add(passwordSenha);
		
		JButton btnProximo = new JButton("Próximo");
		btnProximo.setBackground(new Color(255, 255, 255));
		btnProximo.setFont(new Font("Georgia", Font.PLAIN, 12));
		btnProximo.setBounds(137, 214, 89, 23);
		contentPane.add(btnProximo);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial inicio = new TelaInicial();
				dispose();
				inicio.setVisible(true);
				
				String nome = txNome.getText();
				String senha = passwordSenha.getName();
				
				Cadastro c = new Cadastro();
				
				
				
			}
		});
		
		btnVoltar.setBackground(new Color(255, 255, 255));
		btnVoltar.setFont(new Font("Georgia", Font.PLAIN, 12));
		btnVoltar.setBounds(10, 214, 89, 23);
		contentPane.add(btnVoltar);
	}

}