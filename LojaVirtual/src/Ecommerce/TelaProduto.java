package Ecommerce;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SpinnerNumberModel;

public class TelaProduto extends JFrame {


	private JPanel contentPane;
	private JTextField txNome;
	private JTextField txMarca;
	private JTextField txCor;
	private JTextField txModelo;
	private JTextField txPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProduto frame = new TelaProduto();
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
	public TelaProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 368);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(180, 222, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txNome = new JTextField();
		txNome.setBackground(new Color(255, 255, 255));
		txNome.setBounds(98, 79, 121, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblNome.setBounds(51, 82, 37, 14);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro Produto");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_1.setBounds(145, 29, 193, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblMarca.setBounds(260, 133, 37, 14);
		contentPane.add(lblMarca);
		
		txMarca = new JTextField();
		txMarca.setColumns(10);
		txMarca.setBackground(new Color(255, 255, 255));
		txMarca.setBounds(307, 130, 121, 20);
		contentPane.add(txMarca);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblCor.setBounds(63, 184, 25, 14);
		contentPane.add(lblCor);
		
		txCor = new JTextField();
		txCor.setColumns(10);
		txCor.setBackground(new Color(255, 255, 255));
		txCor.setBounds(98, 181, 121, 20);
		contentPane.add(txCor);
		
		JLabel lblPreco = new JLabel("Preço");
		lblPreco.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblPreco.setBounds(266, 184, 31, 14);
		contentPane.add(lblPreco);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblModelo.setBounds(40, 136, 48, 14);
		contentPane.add(lblModelo);
		
		txModelo = new JTextField();
		txModelo.setColumns(10);
		txModelo.setBackground(new Color(255, 255, 255));
		txModelo.setBounds(98, 133, 121, 20);
		contentPane.add(txModelo);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblCategoria.setBounds(241, 79, 56, 14);
		contentPane.add(lblCategoria);
		
		JComboBox comboBoxCategoria = new JComboBox();
		comboBoxCategoria.setFont(new Font("Georgia", Font.PLAIN, 12));
		comboBoxCategoria.setModel(new DefaultComboBoxModel(new String[] {"Esporte", "Eletrônico", "Cozinha", "Vestuário", "Ferramenta ", "Brinquedo", "Cosmético"}));
		comboBoxCategoria.setForeground(new Color(0, 0, 0));
		comboBoxCategoria.setBackground(new Color(255, 255, 255));
		comboBoxCategoria.setBounds(307, 75, 121, 22);
		contentPane.add(comboBoxCategoria);
		
		JLabel spinnerEstoque = new JLabel("Quantidade no Estoque");
		spinnerEstoque.setFont(new Font("Georgia", Font.PLAIN, 12));
		spinnerEstoque.setBounds(98, 238, 135, 20);
		contentPane.add(spinnerEstoque);
		
		
		//Cria objeto JButton
		JButton btSalvar = new JButton("Salvar");
		btSalvar.setForeground(new Color(0, 0, 0));
		btSalvar.setBackground(new Color(255, 255, 255));
		//Cria evento ActionListener
		btSalvar.addActionListener(new ActionListener() {
			//Método actionPerformed
			public void actionPerformed(ActionEvent e) {
				//Ações:
				String nome = txNome.getText();
				Object categoria = comboBoxCategoria.getSelectedItem();
				String modelo = txModelo.getText();
				String marca = txMarca.getText();
				String cor = txCor.getText();
				
				//Associação entre classe Produto -> Tela Produto
				Produto p = new Produto();
				p.setNome(txNome.getText());
				p.setModelo(txModelo.getText());
				p.setCategoria(comboBoxCategoria.getSelectedItem());
				p.setMarca(txMarca.getText());
				p.setCor(txCor.getText());
				
				
				if (p.getNome().length() != 3 && !p.getNome().matches("[A-Za-z]*")) {
					JOptionPane.showMessageDialog(null, "Nome inválido!");
					
				} 	else if (p.getModelo().length() != 2 && !p.getModelo().matches("[A-Za-z]*")) {
					JOptionPane.showMessageDialog(null, "Modelo inválido!");
					
				} else if (p.getMarca().length() != 2 && !p.getMarca().matches("[A-Za-z]*")) {
					JOptionPane.showMessageDialog(null, "Marca inválida!");
					
				} else if (p.getCor().length() != 2 && !p.getCor().matches("[A-Za-z]*")) {
					JOptionPane.showMessageDialog(null, "Cor inválida!");
					
				} else {
					JOptionPane.showMessageDialog(null, "Produto cadastrado" + "\nNome: " + nome + "\nCategoria: " + categoria 
							+ "\nModelo: " + modelo + "\nMarca: " + marca + "\nCor: " + cor);
				}
			}
		});
		
		btSalvar.setBounds(386, 298, 89, 23);
		contentPane.add(btSalvar);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner.setBounds(241, 238, 121, 20);
		contentPane.add(spinner);
		
		txPreco = new JTextField();
		txPreco.setBounds(307, 181, 121, 20);
		contentPane.add(txPreco);
		txPreco.setColumns(10);
		
	}
}
