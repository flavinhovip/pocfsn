package com.fsn.poc.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.fsn.poc.domain.Fornecedor;

public class FornecedorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotEmpty(message = "O nome é obrigatório")
	@Length(min = 5, max = 120, message = "O tamanho do nome deve ser entre 5 e 120 caracteres")
	private String nome;

	@NotEmpty(message = "O nome do e-mail é obrigatório")
	@Email(message = "Email inválido")
	private String email;

	public FornecedorDTO() {
	}

	public FornecedorDTO(Fornecedor obj) {
		id = obj.getId();
		nome = obj.getNome();
		email = obj.getEmail();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

}
