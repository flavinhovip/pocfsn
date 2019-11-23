package com.fsn.poc.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import com.fsn.poc.services.Validation.ClienteInsert;

@ClienteInsert
public class ClienteNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotEmpty(message="O nome é obrigatório")
	@Length(min=5, max=120, message="O tamanho do nome deve ser entre 5 e 120 caracteres")
	private String nome;
	
	@NotEmpty(message = "O nome do e-mail é obrigatório")
	@Email(message = "Email inválido")
	private String email;
	
	@NotEmpty(message="O nome da senha é obrigatório")
	private String senha;
	
	@NotEmpty(message="O CPF é obrigatório")
	@CPF
	private String cpf;

	@NotEmpty(message = "O logradouro é obrigatório")
	private String logradouro;
	
	@NotEmpty(message = "O número é obrigatório")
	private String numero;
	
	private String complemento;
	private String bairro;
	
	@NotEmpty(message = "O CEP é obrigatório")
	private String cep;
	
	@NotEmpty(message = "a Cidade é obrigatório")
	private String cidade;
	
	@NotEmpty(message = "O Estado é obrigatório")
	private String estado;

	@NotEmpty(message = "O Telefone é obrigatório")
	private String telefone1;
	
	private String telefone2;

	public ClienteNewDTO() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
}