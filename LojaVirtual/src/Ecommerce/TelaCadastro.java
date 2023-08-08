package Ecommerce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txNome;
	private JTextField txCpf;
	private JTextField txEmail;
	private JTextField txTelefone;
	private JPasswordField passwordSenha;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btSalvar;
	private JButton btnButtomVoltar;
	private JPanel panel;
	private JTextField txLogin;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JSpinner spinnerDia;
	private JSpinner spinnerMes;
	private JSpinner spinnerAno;
	private JLabel lblDia;
	private JLabel lblCpf_2;
	private JLabel lblCpf_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(180, 222, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(37, 63, 34, 14);
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Cadastro Cliente");
		lblNewLabel.setBounds(136, 8, 195, 24);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		txNome = new JTextField();
		txNome.setBounds(81, 60, 121, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(46, 106, 25, 14);
		lblCpf.setFont(new Font("Georgia", Font.PLAIN, 12));
		contentPane.add(lblCpf);
		
		txCpf = new JTextField();
		txCpf.setBounds(81, 103, 121, 20);
		txCpf.setColumns(10);
		txCpf.setBackground(Color.WHITE);
		contentPane.add(txCpf);
		
		txEmail = new JTextField();
		txEmail.setBounds(287, 103, 121, 20);
		txEmail.setColumns(10);
		contentPane.add(txEmail);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(242, 106, 35, 14);
		lblEmail.setFont(new Font("Georgia", Font.PLAIN, 12));
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(229, 63, 48, 14);
		lblTelefone.setFont(new Font("Georgia", Font.PLAIN, 12));
		contentPane.add(lblTelefone);
		
		txTelefone = new JTextField();
		txTelefone.setBounds(287, 60, 121, 20);
		txTelefone.setColumns(10);
		txTelefone.setBackground(Color.WHITE);
		contentPane.add(txTelefone);
		
		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(287, 184, 121, 20);
		contentPane.add(passwordSenha);
		
		lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(242, 187, 43, 14);
		lblNewLabel_2.setFont(new Font("Georgia", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.setBounds(243, 145, 34, 14);
		lblNewLabel_3.setFont(new Font("Georgia", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_3);
		
		btSalvar = new JButton("Salvar");
		btSalvar.setForeground(Color.BLACK);
		btSalvar.setBackground(new Color(255, 255, 255));
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txNome.getText();
				String cpf = txCpf.getText();
				String telefone = txTelefone.getText();
				String email = txEmail.getText();
				String login = txLogin.getText();
				String senha = passwordSenha.getName();

				Cadastro p = new Cadastro();
				p.setNome(txNome.getText());
				p.setCpf(txCpf.getText());
				p.setTelefone(txTelefone.getText());
				p.setEmail(txEmail.getText());
				p.setLogin(txLogin.getText());
				p.setSenha(passwordSenha.getName());
				
				if (p.getNome().length() != 3 && !p.getNome().matches("[A-Za-z]*")) {
					JOptionPane.showMessageDialog(null, "Nome inválido!");
					
				} 	else if (!p.getCpf().matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
					JOptionPane.showMessageDialog(null, "CPF inválido!");
					
				} else if (p.getTelefone().matches("\\d{7}-\\d{4}")) {
					JOptionPane.showMessageDialog(null, "Telefone inválido!");
					
				} else if (p.getEmail().contains("@")) {
					JOptionPane.showMessageDialog(null, "Email inválido!");
					
				} else {
					JOptionPane.showMessageDialog(null, "Cadastro concluído!");
				}
			}
	
		});
		btSalvar.setBounds(330, 227, 94, 23);
		contentPane.add(btSalvar);
		
		btnButtomVoltar = new JButton("Voltar");
		btnButtomVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial inicio = new TelaInicial();
				dispose();
				inicio.setVisible(true);
				
			}
		});
		
		btnButtomVoltar.setBounds(10, 11, 85, 24);
		btnButtomVoltar.setForeground(Color.BLACK);
		btnButtomVoltar.setBackground(Color.WHITE);
		contentPane.add(btnButtomVoltar);
		
		panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(213, 236, 228));
		panel.setBounds(105, 145, 128, 101);
		contentPane.add(panel);
		panel.setLayout(null);
		
		spinnerDia = new JSpinner();
		spinnerDia.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(0)));
		spinnerDia.setBounds(10, 36, 44, 20);
		panel.add(spinnerDia);
		
		spinnerMes = new JSpinner();
		spinnerMes.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		spinnerMes.setBounds(64, 36, 47, 20);
		panel.add(spinnerMes);
		
		spinnerAno = new JSpinner();
		spinnerAno.setModel(new SpinnerNumberModel(Integer.valueOf(2000), Integer.valueOf(1900), null, Integer.valueOf(1)));
		spinnerAno.setBounds(55, 74, 56, 20);
		panel.add(spinnerAno);
		
		lblDia = new JLabel("Dia");
		lblDia.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblDia.setBounds(10, 21, 25, 14);
		panel.add(lblDia);
		
		lblCpf_2 = new JLabel("Mês");
		lblCpf_2.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblCpf_2.setBounds(64, 21, 25, 14);
		panel.add(lblCpf_2);
		
		lblCpf_3 = new JLabel("Ano");
		lblCpf_3.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblCpf_3.setBounds(20, 77, 25, 14);
		panel.add(lblCpf_3);
		
		txLogin = new JTextField();
		txLogin.setBounds(287, 142, 121, 20);
		contentPane.add(txLogin);
		txLogin.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Data de");
		lblNewLabel_4.setBounds(30, 172, 48, 14);
		lblNewLabel_4.setFont(new Font("Georgia", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Nascimento");
		lblNewLabel_5.setBounds(23, 187, 72, 14);
		lblNewLabel_5.setFont(new Font("Georgia", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_5);
	}
}

