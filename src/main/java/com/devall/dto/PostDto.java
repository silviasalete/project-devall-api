package com.devall.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PostDto {

	SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	private Long id;
	private String titulo;
	private String resumo;
	private Integer cliques;
	private String dataInclusao;
	private String dataPublicacao;
	private Integer votosNegativos;
	private Integer votosPositivos;
	private Integer favoritos;
	private Integer comentarios;
	private String url;		
	private SiteDto blog;
	
	public PostDto() {
		super();
	}

	public PostDto(Long id, String titulo, String resumo, Integer cliques, Date dataInclusao, Date dataPublicacao,
			Integer votosNegativos, Integer votosPositivos, Integer favoritos, Integer comentarios, String url,
			SiteDto blog) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.resumo = resumo;
		this.cliques = cliques;
		this.dataInclusao = fmt.format(dataInclusao);
		this.dataPublicacao = fmt.format(dataPublicacao);
		this.votosNegativos = votosNegativos;
		this.votosPositivos = votosPositivos;
		this.favoritos = favoritos;
		this.comentarios = comentarios;
		this.url = url;
		this.blog = blog;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public Integer getCliques() {
		return cliques;
	}
	public void setCliques(Integer cliques) {
		this.cliques = cliques;
	}
 
	public String getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(String dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public Integer getVotosNegativos() {
		return votosNegativos;
	}
	public void setVotosNegativos(Integer votosNegativos) {
		this.votosNegativos = votosNegativos;
	}
	public Integer getVotosPositivos() {
		return votosPositivos;
	}
	public void setVotosPositivos(Integer votosPositivos) {
		this.votosPositivos = votosPositivos;
	}
	public Integer getFavoritos() {
		return favoritos;
	}
	public void setFavoritos(Integer favoritos) {
		this.favoritos = favoritos;
	}
	public Integer getComentarios() {
		return comentarios;
	}
	public void setComentarios(Integer comentarios) {
		this.comentarios = comentarios;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public SiteDto getBlog() {
		return blog;
	}
	public void setBlog(SiteDto blog) {
		this.blog = blog;
	} 
}
