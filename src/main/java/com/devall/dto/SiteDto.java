package com.devall.dto;

public class SiteDto {
	
	private Long id;
	private String nome;
	private Integer ativo;
	private String resumo;
//  Acesso negado
//	@OneToOne
//	private Autor autor;
	
	public SiteDto(Long id, String nome, Integer ativo, String sobre) {
		super();
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
		this.resumo = sobre;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAtivo() {
		return ativo;
	}
	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
}
