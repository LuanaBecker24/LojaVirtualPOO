package Ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Cadastro {

	/** Documentação da classe Cadastro
	 * 
	 * @author Luana
	 *
	 */
		
		//Atributos
		
		/**Propriedade nome do cliente (nome completo) */
		private String nome;
		/**Propriedade cpf do cliente */
		private String cpf;
		/**Propriedade endereco do cliente */
		private String endereco;
		/**Propriedade telefone do cliente */
		private String telefone;
		/**Propriedade email do cliente */
		private String  email;
		/**Propriedade data de nascimento do cliente */
		private String  dataNascimento;
		/**Propriedade login do cliente */
		private String  login;
		/**Propriedade senha do cliente */
		private String  senha;
		
		public Cadastro() {
			
		}

		public String getNome() {
			return nome;
		}
		
		public boolean setNome(String nome) {
			if(nome.length() > 2 && nome.matches("[A-Za-z]*")) {
				return true;

			} else {
				return false;
				
			}
		}
			
		public String getCpf() {
			return cpf;
		}
		
		public boolean setCpf(String cpf) {
			if (Pattern.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", cpf)) {
				return true;
				
			} else {
				return false;
			}
		}
		
		public String getEndereco() {
			return endereco;
			
		}
		
		public boolean setEndereco(String pendereco) {
			if(pendereco.length() > 2 && pendereco.matches("[A-Za-z]*")) {
				return true;
				
			} else {
				return false;
			}
		}

		public String getTelefone() {
			return telefone;
			
		}
		
		public boolean setTelefone(String telefone) {
			if(Pattern.matches("\\d{7}-\\d{4}", telefone)){
				return true;
				
			} else {
				 return false;
				 
			}
		}
		
		public String getEmail() {
			return email;
		}
		
		public boolean setEmail(String email) {
			
			if(email.contains("@")) {
				return true;
				
			}else {
				return false;
				
			}
		}
		
		public String getDataNascimento() {
			return dataNascimento;
		}
		
		public boolean setDataNascimento(String dataNascimento) {
			if (Pattern.matches("\\d{2}\\/\\d{2}\\/\\d{4}", dataNascimento)) {
				return true;
				
			} else {
				return false;
			}
		}
		
		public String getLogin() {
			return login;
		}
		
		public void setLogin(String plogin) {
		
		}
		
		public String getSenha() {
			return senha;
		}
		
		public void setSenha(String psenha) {
			
		}

}