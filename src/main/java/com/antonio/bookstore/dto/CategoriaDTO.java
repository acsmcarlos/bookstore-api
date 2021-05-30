package com.antonio.bookstore.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.antonio.bookstore.domain.Categoria;

public class CategoriaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotEmpty(message = "Campo NOME é obrigatório")
	@Length(min = 3, max = 60, message = "O campo nome deve ter entre 3 a 60 caracteres")
	private String nome;
	
	@NotEmpty(message = "Campo DESCRIÇÃO é obrigatório")
	@Length(min = 3, max = 100, message = "O campo DESCRIÇÃO deve ter entre 3 a 100 caracteres")
	private String descricao;
	
	
	public CategoriaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
