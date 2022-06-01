package com.lelis.bookstore.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.lelis.bookstore.domain.Categoria;

public class CategoriaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message = "Campo Nome é requerido!")
	@Length(min = 5, max = 75, message = "O campo Nome deve ter entre 5 e 75 caracteres")
	private String nome;
	
	@NotEmpty(message = "Campo Descrição é requerido!")
	@Length(min = 5, max = 200, message = "O campo Descrição deve ter entre 20 e 200 caracteres")
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
