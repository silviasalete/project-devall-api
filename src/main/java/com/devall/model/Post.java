package com.devall.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.devall.dto.PostCliqueDto;
import com.devall.dto.PostDto;
import com.devall.dto.SiteDto;

@Entity
@Table(name = "blog_post")
public class Post {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@OneToOne
		private Site site;
		private String titulo;
		private String resumo;
		private Integer cliques;
		private Date dataInclusao;
		private Date dataPublicacao;
		private Integer votosNegativos;
		private Integer votosPositivos;
		private Integer favoritos;
		private Integer comentarios;
		private String url;		
		private Integer ativo;
		private Integer tentativas;
		private String thumbnail;
		private Integer version;

		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Integer getVersion() {
			return version;
		}
		public void setVersion(Integer version) {
			this.version = version;
		}
		public Integer getCliques() {
			return cliques;
		}
		public void setCliques(Integer cliques) {
			this.cliques = cliques;
		}
		public Date getDataInclusao() {
			return dataInclusao;
		}
		public void setDataInclusao(Date dataInclusao) {
			this.dataInclusao = dataInclusao;
		}
		public Date getDataPublicacao() {
			return dataPublicacao;
		}
		public void setDataPublicacao(Date dataPublicacao) {
			this.dataPublicacao = dataPublicacao;
		}
		public String getResumo() {
			return resumo;
		}
		public void setResumo(String resumo) {
			this.resumo = resumo;
		}

		public Site getSite() {
			return site;
		}
		public void setSite(Site site) {
			this.site = site;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
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
		public Integer getAtivo() {
			return ativo;
		}
		public void setAtivo(Integer ativo) {
			this.ativo = ativo;
		}
		public Integer getTentativas() {
			return tentativas;
		}
		public void setTentativas(Integer tentativas) {
			this.tentativas = tentativas;
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
		public String getThumbnail() {
			return thumbnail;
		}
		public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
		}
		public PostDto toDto() {
			
			SiteDto siteDto= this.getSite().toDto();
			
			PostDto postDto = new PostDto(
					this.getId(), 
					this.getTitulo(), 
					this.getResumo(), 
					this.getCliques(), 
					this.getDataInclusao(), 
					this.getDataPublicacao(),
					this.getVotosNegativos(), 
					this.getVotosPositivos(), 
					this.getFavoritos(), 
					this.getComentarios(), 
					"",
					siteDto
					);
			return postDto;
			
		}
		public Autor buscaAutor(Site site) {
			return null;
		}
		public PostCliqueDto toCliqueDto() {
			
			SiteDto siteDto= this.getSite().toDto();
			PostCliqueDto postCliqueDto = new PostCliqueDto(
					this.getId(), 
					this.getTitulo(), 
					this.getResumo(), 
					this.getCliques(), 
					this.getDataInclusao(), 
					this.getDataPublicacao(),
					this.getVotosNegativos(), 
					this.getVotosPositivos(), 
					this.getFavoritos(), 
					this.getComentarios(), 
					this.getUrl(),
					siteDto
					);
			return postCliqueDto;
			
		}
}
