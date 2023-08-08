package Ecommerce;

import javax.swing.JOptionPane;

public class Produto {
	
	/**Propriedade nome do produto */
	private String  nome;
	/**Propriedade preço do produto */
	private String  preco;
	/**Propriedade categoria do produto */
	private Object  categoria;
	/**Propriedade modelo do produto */
	private String  modelo;
	/**Propriedade marca do produto */
	private String  marca;
	/**Propriedade cor do produto */
	private String  cor;
	/**Propriedade quantidade em estoque do produto */
	private int  quantidadeEstoque;
	
	public Produto() {
		
	}

	public String getNome() {
		return nome;
	}
	
	public boolean setNome(String nome) {
		this.nome = nome;
			
		if (getNome().length() == 3 && getNome().matches("[A-Za-z]*")) {
			return true;
				
		} else {
			return false;
		}
	}
	
	public String getPreco() {
		return preco;
	}
	
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	public Object getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Object categoria) {
		this.categoria = categoria;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public boolean setModelo(String modelo) {
		this.modelo = modelo;
		
		if (getModelo().length() == 2 && getModelo().matches("[A-Za-z]*")) {
			return true;
	
		} else {
			return false;
		} 
	}
	
	public String getMarca() {
		return marca;
	}
	
	public boolean setMarca(String marca) {
		this.marca = marca;
		
		if (getMarca().length() == 2 && getMarca().matches("[A-Za-z]*")) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public String getCor() {
		return cor;
	}
	
	public boolean setCor(String cor) {
		this.cor = cor;
		
		if (getCor().length() == 2 && getCor().matches("[A-Za-z]*")) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
}

