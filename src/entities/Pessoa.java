package entities;

import java.util.UUID;

public class Pessoa {

	/*
	 * Atributos privados
	 */
	
	private UUID id;
	private String nome;
	private String cpf;

	/*
	 *  Construtores 
	 */
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	
	// Sobrecarga de construtores 
	public Pessoa(UUID id, String nome, String cpf) { 
		super(); // Chamada pro construtor da classe Pai (Nesse caso a Object)
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	/*
	 * Getters and Setters 
	 */
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
